package autotestSVG;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebUITools;

public class LocalSteps {
    InsatWebUITools tester = new InsatWebUITools();

    @Step ("Проверка свойсва SVG-элемента")
    public void checkSVGProperty (WebDriver driver, String embedXPath, String xPath, String property, String expected){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.switchTo().frame(driver.findElement(By.xpath(embedXPath)));
        tester.check.elementProperty("SVG", driver, xPath, property, expected);
        driver.switchTo().defaultContent();
    }

    @Step ("Ожидание SVG - элемента")
    public void waitSVG (WebDriver driver, String embedXPath){
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(embedXPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
    }

    @Step ("Проверка класса SVG-элемента (или его составляющей)")
    public void checkSVGclass (WebDriver driver, String embedXPath, String expected, String message){
        driver.switchTo().frame(driver.findElement(By.xpath(embedXPath)));
        try {
            driver.findElement(By.xpath("//*[contains(@class, '"+expected+"')]"));
        } catch (Exception er) {Assert.assertEquals(message, "true", "false");}
        driver.switchTo().defaultContent();
    }
}
