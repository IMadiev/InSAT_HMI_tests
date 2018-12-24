package autotestSVG.BaseObjects.Pipeline;

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

public class PipelineDirConStreamTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Pipeline/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Трубопровод (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '96598']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '96598']")));
        driver.findElement(By.xpath("//*[@data-control-id = '96598']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '96102']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '96102']")));
        tester.event.click(driver, "//*[@data-control-id = '96102']");
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Труба вертикальная, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Труба вертикальная")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubaVertikalnaya(){
        String XPath = "//*[@data-control-id = '95867']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "trubaVertikalnaya_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Угол, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Угол")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol(){
        String XPath = "//*[@data-control-id = '95879']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "ugol_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik(){
        String XPath = "//*[@data-control-id = '95891']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troynik_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник (1 к 2), прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник (1 к 2)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik1k2(){
        String XPath = "//*[@data-control-id = '95903']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troynik1k2_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Фланцы, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Фланцы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void flantsi(){
        String XPath = "//*[@data-control-id = '95915']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "flantsi_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник 1, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik1(){
        String XPath = "//*[@data-control-id = '95927']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troynik1_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник 1-2, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 1-2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik1_2(){
        String XPath = "//*[@data-control-id = '95939']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troynik1_2_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник 2, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik2(){
        String XPath = "//*[@data-control-id = '95951']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troynik2_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тройник 2-2, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 2-2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik2_2(){
        String XPath = "//*[@data-control-id = '95963']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "troynik2_2_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Труба X, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Труба X")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubaX(){
        String XPath = "//*[@data-control-id = '95987']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "trubaX_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Угол 1, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Угол 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol1(){
        String XPath = "//*[@data-control-id = '95975']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "ugol1_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Угол 2, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Угол 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol2(){
        String XPath = "//*[@data-control-id = '96002']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "ugol2_stream", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Труба горизонтальная, прямая конвертация, проверка работы параметра [Поток])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Труба горизонтальная")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubaGorizontalnaya(){
        String XPath = "//*[@data-control-id = '95855']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "trubaGorizontalnaya_stream", XPath);
    }
}
