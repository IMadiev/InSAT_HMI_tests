package autotestSVG.Images.Indicators;

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

public class IndicatorsDirConWorkTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/Images/Indicators/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Индикаторы (прямая)]")
    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/28/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '467909']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '467909']")));
        driver.findElement(By.xpath("//*[@data-control-id = '467909']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '251624']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '251624']")));
        driver.findElement(By.xpath("//*[@data-control-id = '251624']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '131942']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '131942']")));
        driver.findElement(By.xpath("//*[@data-control-id = '131942']")).click();
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131716']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131728']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131740']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131752']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131764']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131878']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Layer_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Layer_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131902']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Layer_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Layer_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131788']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131776']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#svg2")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#svg2")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131802']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131816']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131828']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131890']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Layer_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Layer_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131866']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131842']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '131854']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Индикатор, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Индикатор")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void indicator(){
        tester.check.screenshotBasedTest(driver, PATH, "indicator_work", "//*[@data-control-id = '131716']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Индикатор 1, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Индикатор 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void indicator1(){
        tester.check.screenshotBasedTest(driver, PATH, "indicator1_work", "//*[@data-control-id = '131728']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Индикатор 2, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Индикатор 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void indicator2(){
        tester.check.screenshotBasedTest(driver, PATH, "indicator2_work", "//*[@data-control-id = '131740']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Индикатор 3, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Индикатор 3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void indicator3(){
        tester.check.screenshotBasedTest(driver, PATH, "indicator3_work", "//*[@data-control-id = '131752']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Индикатор 4, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Индикатор 4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void indicator4(){
        tester.check.screenshotBasedTest(driver, PATH, "indicator4_work", "//*[@data-control-id = '131764']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка энергосберегающая, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Лампочка энергосберегающая")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochkaEnergosberegayuschaya(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochkaEnergosberegayuschaya_work", "//*[@data-control-id = '131788']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Лампочка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochka(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochka_work", "//*[@data-control-id = '131776']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка 2, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Лампочка 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochka2(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochka2_work", "//*[@data-control-id = '131802']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка 3, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Лампочка 3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochka3(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochka3_work", "//*[@data-control-id = '131816']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка 4, прямая конвертация, проверка корректности параметра [Работа])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Лампочка 4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochka4(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochka4_work", "//*[@data-control-id = '131828']");
    }
}
