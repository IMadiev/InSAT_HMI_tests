package autotestSVG.BaseObjects.Burner;

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

public class BurnerDirConAlarmTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Burner/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Горелка (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '117200']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '117200']")));
        driver.findElement(By.xpath("//*[@data-control-id = '117200']")).click();
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

    @Description("Проверка класса элемента SVG [AvaryBorder] (Горелка анфас, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка анфас")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaAnfas(){
        String XPath = "//*[@data-control-id = '116172']";
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Горелка изометрия кожухом вбок, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия кожухом вбок")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriyaKozhuhomVbok(){
        String XPath = "//*[@data-control-id = '116184']";
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Горелка изометрия кожухом вниз, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия кожухом вниз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriyaKozhuhomVniz(){
        String XPath = "//*[@data-control-id = '116196']";
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Горелка изометрия, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriya(){
        String XPath = "//*[@data-control-id = '116208']";
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Горелка кожухом вниз, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка кожухом вниз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaKozhuhomVniz(){
        String XPath = "//*[@data-control-id = '116232']";
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Горелка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelka(){
        String XPath = "//*[@data-control-id = '116244']";
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Горелка кожухом вбок, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка кожухом вбок")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaKozhuhomVbok(){
        String XPath = "//*[@data-control-id = '116220']";
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '116445']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }
}
