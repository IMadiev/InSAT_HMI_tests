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

public class BurnerDirConWorkTest {
    private static WebDriver driver;
    LocalSteps local = new LocalSteps();
    InsatWebUITools tester = new InsatWebUITools();
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка изометрия кожухом вбок, прямая конвертация, проверка параметра [Режим работы])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия кожухом вбок")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriyaKozhuhomVbok(){
        String XPath = "//*[@data-control-id = '116184']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Off");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVbok_Off", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Blow");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVbok_Blow", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Ignition");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVbok_Ignition", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Run");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVbok_Run", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка изометрия кожухом вниз, прямая конвертация, проверка параметра [Режим работы])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия кожухом вниз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriyaKozhuhomVniz(){
        String XPath = "//*[@data-control-id = '116196']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Off");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVniz_Off", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Blow");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVniz_Blow", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Ignition");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVniz_Ignition", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Run");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVniz_Run", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка изометрия, прямая конвертация, проверка параметра [Режим работы])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriya(){
        String XPath = "//*[@data-control-id = '116208']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Off");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriya_Off", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Blow");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriya_Blow", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Ignition");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriya_Ignition", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Run");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriya_Run", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка кожухом вниз, прямая конвертация, проверка параметра [Режим работы])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка кожухом вниз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaKozhuhomVniz(){
        String XPath = "//*[@data-control-id = '116232']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Off");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVniz_Off", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Blow");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVniz_Blow", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Ignition");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVniz_Ignition", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Run");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVniz_Run", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка, прямая конвертация, проверка параметра [Режим работы])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelka(){
        String XPath = "//*[@data-control-id = '116244']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Off");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelka_Off", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Blow");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelka_Blow", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Ignition");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelka_Ignition", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Run");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelka_Run", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка кожухом вбок, прямая конвертация, проверка параметра [Режим работы])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка кожухом вбок")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaKozhuhomVbok(){
        String XPath = "//*[@data-control-id = '116220']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Off");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVbok_Off", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Blow");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVbok_Blow", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Ignition");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVbok_Ignition", XPath);
        tester.set.comboBox(driver, "//*[@data-control-id = '116595']", "Run");
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVbok_Run", XPath);
    }
}
