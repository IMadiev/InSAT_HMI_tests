package autotestSVG.BaseObjects.Valve;

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

public class ValveDirConAlarmTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Valve/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Задвижки/клапаны (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '105413']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '105413']")));
        driver.findElement(By.xpath("//*[@data-control-id = '105413']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '103266']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '103266']")));
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

    @Description("Проверка класса элемента SVG [AvaryBorder] (Задвижка изометрия, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaIsometriya(){
        String XPath = "//*[@data-control-id = '102934']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Задвижка с электроприводом, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodom(){
        String XPath = "//*[@data-control-id = '102946']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Задвижка с электроприводом 2, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodom2(){
        String XPath = "//*[@data-control-id = '102958']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Задвижка с электроприводом изометрия 2, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом изометрия 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodomIsometriya2(){
        String XPath = "//*[@data-control-id = '102970']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Задвижка с электроприводом изометрия, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodomIsometriya(){
        String XPath = "//*[@data-control-id = '102982']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Задвижка, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhka(){
        String XPath = "//*[@data-control-id = '103002']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Клапан с пневмоприводом, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Клапан с пневмоприводом")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void klapanSPnevmoprivodom(){
        String XPath = "//*[@data-control-id = '103014']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Клапан с пневмоприводом изометрия, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Клапан с пневмоприводом изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void klapanSPnevmoprivodomIsometriya(){
        String XPath = "//*[@data-control-id = '103026']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Клапан с электроприводом, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Клапан с электроприводом")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void klapanSElekroprivodom(){
        String XPath = "//*[@data-control-id = '103038']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Клапан с электроприводом изометрия, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Клапан с электроприводом изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void klapanSElekroprivodomIsometriya(){
        String XPath = "//*[@data-control-id = '103050']";
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '103266']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }
}
