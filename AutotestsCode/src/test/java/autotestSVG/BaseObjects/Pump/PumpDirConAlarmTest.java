package autotestSVG.BaseObjects.Pump;

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

public class PumpDirConAlarmTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Pump/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";


    @Step("Открытие страницы [Насосы (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '88415']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '88415']")));
        driver.findElement(By.xpath("//*[@data-control-id = '88415']")).click();
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

    @Description("Проверка класса элемента SVG [AvaryBorder] (Насос вертикальный, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос вертикальный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosVerticalniy(){
        String XPath = "//*[@data-control-id = '64692']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Насос улитка вертикальный, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос улитка вертикальный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosUlitkaVerticalniy(){
        String XPath = "//*[@data-control-id = '64704']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Насос горизонтальный, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос горизонтальный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosGorizontalniy(){
        String XPath = "//*[@data-control-id = '64716']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Насос профиль, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос профиль")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosProfil(){
        String XPath = "//*[@data-control-id = '64728']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Шестеренчатый насос, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Шестеренчатый насос")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenchatiyNasos(){
        String XPath = "//*[@data-control-id = '64740']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Шестеренчатый насос 2, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Шестеренчатый насос 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenchatiyNasos2(){
        String XPath = "//*[@data-control-id = '64752']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Погружной 1, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Погружной 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void pogruzhnoy1(){
        String XPath = "//*[@data-control-id = '64764']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Погружной 5, прямая конвертация, проверка динамизации параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Погружной 5")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void pogruzhnoy5(){
        String XPath = "//*[@data-control-id = '64776']";
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '65194']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }
}
