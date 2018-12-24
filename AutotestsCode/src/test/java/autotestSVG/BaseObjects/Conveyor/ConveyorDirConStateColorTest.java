package autotestSVG.BaseObjects.Conveyor;

import autotestSVG.LocalSteps;
import io.qameta.allure.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebUITools;

public class ConveyorDirConStateColorTest {
    private static WebDriver driver;
    LocalSteps local = new LocalSteps();
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Conveyor/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Конвейеры и шнеки (прямая)]")
    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/28/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '467876']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '467876']")));
        driver.findElement(By.xpath("//*[@data-control-id = '467876']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '112934']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '112934']")));
        driver.findElement(By.xpath("//*[@data-control-id = '112934']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '112655']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '112655']")));
        tester.set.comboBox(driver, "//*[@data-control-id = '112655']", "Started");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '112389']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '112389']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '112389']");
    }

    @Before
    public void returnDriver () {
        driver.switchTo().defaultContent();
    }

    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шнек, прямая конвертация, проверка динамизации параметра [Цвет работы] шнеков)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Конвейеры и шнеки")
    @Story(value = "Шнек")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void screw(){
        String XPath = "//*[@data-control-id = '112191']";
        local.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "screw_stateColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шнек изометрия, прямая конвертация, проверка динамизации параметра [Цвет работы] шнеков)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Конвейеры и шнеки")
    @Story(value = "Шнек изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void screwIsometriya(){
        String XPath = "//*[@data-control-id = '112203']";
        local.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "screwIsometriya_stateColor", XPath);
    }
}
