package autotestSVG.BaseObjects.Burner;

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

public class BurnerDirConNozzleColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Burner/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

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
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '116419']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '116419']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '116419']");
        tester.action.wait(500);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '116470']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '116470']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '116470']");
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка изометрия кожухом вбок, прямая конвертация, проверка корректности отображения цвета сопла после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия кожухом вбок")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriyaKozhuhomVbok(){
        String XPath = "//*[@data-control-id = '116184']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVbok_nozzleColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка изометрия кожухом вниз, прямая конвертация, проверка корректности отображения цвета сопла после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия кожухом вниз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriyaKozhuhomVniz(){
        String XPath = "//*[@data-control-id = '116196']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriyaKozhuhomVniz_nozzleColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка изометрия, прямая конвертация, проверка корректности отображения цвета сопла после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка изометрия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaIsometriya(){
        String XPath = "//*[@data-control-id = '116208']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaIsometriya_nozzleColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка кожухом вниз, прямая конвертация, проверка корректности отображения цвета сопла после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка кожухом вниз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaKozhuhomVniz(){
        String XPath = "//*[@data-control-id = '116232']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVniz_nozzleColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка, прямая конвертация, проверка корректности отображения цвета сопла после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelka(){
        String XPath = "//*[@data-control-id = '116244']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelka_nozzleColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Горелка кожухом вбок, прямая конвертация, проверка корректности отображения цвета сопла после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Горелка")
    @Story(value = "Горелка кожухом вбок")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gorelkaKozhuhomVbok(){
        String XPath = "//*[@data-control-id = '116220']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "gorelkaKozhuhomVbok_nozzleColor", XPath);
    }
}
