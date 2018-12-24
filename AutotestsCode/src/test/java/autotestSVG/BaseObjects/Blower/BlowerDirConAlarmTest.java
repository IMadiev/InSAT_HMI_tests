package autotestSVG.BaseObjects.Blower;

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

public class BlowerDirConAlarmTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Blower/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Воздуходувки (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '119789']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '119789']")));
        driver.findElement(By.xpath("//*[@data-control-id = '119789']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '119589']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '119589']")));
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

    @Description("Проверка класса элемента SVG [AvaryBorder] (Воздуходувка профиль, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуходувки")
    @Story(value = "Воздуходувка профиль")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vozduhoduvkaProfil(){
        String XPath = "//*[@data-control-id = '119148']";
        tester.set.comboBox(driver, "//*[@data-control-id = '119589']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '119589']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Воздуходувка верхний выход, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуходувки")
    @Story(value = "Воздуходувка верхний выход")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vozduhoduvkaVerhniyVihod(){
        String XPath = "//*[@data-control-id = '119160']";
        tester.set.comboBox(driver, "//*[@data-control-id = '119589']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '119589']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Воздуходувка боковой выход, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуходувки")
    @Story(value = "Воздуходувка боковой выход")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vozduhoduvkaBokovoyVihod(){
        String XPath = "//*[@data-control-id = '119172']";
        tester.set.comboBox(driver, "//*[@data-control-id = '119589']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '119589']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }
}
