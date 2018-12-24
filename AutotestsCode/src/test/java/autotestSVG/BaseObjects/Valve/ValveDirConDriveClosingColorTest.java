package autotestSVG.BaseObjects.Valve;

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

public class ValveDirConDriveClosingColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
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
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '105004']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '105004']")));
        tester.set.comboBox(driver, "//*[@data-control-id = '105004']", "Closing");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '103279']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '103279']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '103279']");
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Задвижка изометрия, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaIsometriya(){
        String XPath = "//*[@data-control-id = '102934']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zadvizhkaIsometriya_closingDriveColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Задвижка с электроприводом, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodom(){
        String XPath = "//*[@data-control-id = '102946']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zadvizhkaSElectroprivodom_closingDriveColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Задвижка с электроприводом 2, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodom2(){
        String XPath = "//*[@data-control-id = '102958']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zadvizhkaSElectroprivodom2_closingDriveColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Задвижка с электроприводом изометрия 2, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом изометрия 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodomIsometriya2(){
        String XPath = "//*[@data-control-id = '102970']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zadvizhkaSElectroprivodomIsometriya2_closingDriveColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Задвижка с электроприводом изометрия, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка с электроприводом изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhkaSElectroprivodomIsometriya(){
        String XPath = "//*[@data-control-id = '102982']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zadvizhkaSElectroprivodomIsometriya_closingDriveColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Задвижка, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Задвижка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhka(){
        String XPath = "//*[@data-control-id = '103002']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zadvizhka_closingDriveColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Клапан с электроприводом, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Клапан с электроприводом")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void klapanSElekroprivodom(){
        String XPath = "//*[@data-control-id = '103038']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "klapanSElekroprivodom_closingDriveColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Клапан с электроприводом изометрия, прямая конвертация, проверка корректности отображения цвета закрывающегося привода после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Задвижки/клапаны")
    @Story(value = "Клапан с электроприводом изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void klapanSElekroprivodomIsometriya(){
        String XPath = "//*[@data-control-id = '103050']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "klapanSElekroprivodomIsometriya_closingDriveColor", XPath);
    }
}
