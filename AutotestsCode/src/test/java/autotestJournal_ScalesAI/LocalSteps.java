package autotestJournal_ScalesAI;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingTools.InsatWebUITools;

public class LocalSteps {
    InsatWebUITools tester = new InsatWebUITools();

    @Step ("Квитировать последнее сообщение в журнале")
    public void acceptMessage (WebDriver driver){
        tester.event.click(driver, "//tbody//tr//input[@class='journal-grid-confirm']");
        tester.action.wait(1000);
    }

    @Step ("Квитировать все сообщения в журнале")
    public void acceptAllMessages (WebDriver driver){
        tester.event.click(driver, "//button[@title = 'Квитировать все']");
        tester.action.wait(1000);
    }

    @Step ("Проверка отсутствия сообщений в журнале")
    public void checkUnpresenceOfMessages (WebDriver driver) {
        Assert.assertEquals("Присутствует сообщение ["+driver.findElement(By.xpath("//tbody//tr//*[@data-bind = 'Message,title=Message']")).getText()+"]", "none", driver.findElement(By.xpath("//tbody//tr")).getCssValue("display"));
    }

    @Step ("Проверка наличия сообщения [{message}]")
    public void checkPresenceOfMessage (WebDriver driver, String message) {
        tester.check.presenceOfElement(driver, "Сообщение", "//*[@title = '"+message+"']");
    }

    @Step ("Проверка отсутствия сообщения [{message}] в журнале")
    public void checkUnpresenceOfMessage (WebDriver driver, String message) {
        try{
            driver.findElement(By.xpath("//*[@title = '"+message+"']"));
            Assert.assertFalse("Присутствует сообщение ["+message+"]", true);
        } catch (Exception er){}
    }

    @Step ("Проверка поля [{columnName}] сообщения")
    public void checkMessageColumnValue (WebDriver driver, String columnName, String xPath, String expected){
        Assert.assertEquals("Содержимое поля ["+columnName+"] сообщения не соответствует ожиданию", expected, driver.findElement(By.xpath(xPath)).getText());
    }

    @Step ("Проверка активности сообщения {message}")
    public void checkMessageActivity (WebDriver driver, String message){
        Assert.assertEquals("Сообщение неактивно в данный момент времени", "700", driver.findElement(By.xpath("//tbody//tr[./td/div[contains(@title, '"+message+"')]]")).getCssValue("font-weight"));
    }

    @Step ("Проверка неактивности сообщения {message}")
    public void checkMessageDisabled (WebDriver driver, String message){
        Assert.assertEquals("Сообщение активно в данный момент времени", "400", driver.findElement(By.xpath("//tbody//tr[./td/div[contains(@title, '"+message+"')]]")).getCssValue("font-weight"));
    }
}
