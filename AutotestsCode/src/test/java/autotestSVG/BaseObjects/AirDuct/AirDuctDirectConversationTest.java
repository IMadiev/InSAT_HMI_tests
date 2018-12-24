package autotestSVG.BaseObjects.AirDuct;

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

public class AirDuctDirectConversationTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/AirDuct/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Воздуховод (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '99958']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '99958']")));
        driver.findElement(By.xpath("//*[@data-control-id = '99958']")).click();
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Перекресток, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Перекресток")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perekrestok(){
        String XPath = "//*[@data-control-id = '99519']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perekrestok", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переходник на маленький воздуховод, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Переходник на маленький воздуховод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perehodNaMaliyVozduhovod(){
        String XPath = "//*[@data-control-id = '99531']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perehodNaMaliyVozduhovod", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переходник на маленькую трубу, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Переходник на маленькую трубу")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perehodNaMaluyuTrubu(){
        String XPath = "//*[@data-control-id = '99543']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perehodNaMaluyuTrubu", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переходник на трубу, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Переходник на трубу")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perehodnikNaTrubu(){
        String XPath = "//*[@data-control-id = '99555']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perehodnikNaTrubu", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Поворот 45, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Поворот 45")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void povorot45(){
        String XPath = "//*[@data-control-id = '99567']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "povorot45", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Поворот 60, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Поворот 60")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void povorot60(){
        String XPath = "//*[@data-control-id = '99579']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "povorot60", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Угол 2, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Угол 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol2(){
        String XPath = "//*[@data-control-id = '99639']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "ugol2", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Угол, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Угол")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol(){
        String XPath = "//*[@data-control-id = '99651']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "ugol", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Прямая, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Прямая")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void pryamaya(){
        String XPath = "//*[@data-control-id = '99591']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "pryamaya", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Тройник")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troinik(){
        String XPath = "//*[@data-control-id = '99603']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troinik", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник 2, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Тройник 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik2(){
        String XPath = "//*[@data-control-id = '99615']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troynik2", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Угол 0, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуховод")
    @Story(value = "Угол 0")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol0(){
        String XPath = "//*[@data-control-id = '99627']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "ugol0", XPath);
    }
}
