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

public class IndicatorsDirConSpecialTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/Images/Indicators/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Солнце снежинка, прямая конвертация, проверка смены зима/лето)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Солнце снежинка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solntseSnezhinka(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132337']", "Summer");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "solntseSnezhinka_special_summer", "//*[@data-control-id = '131890']");
        tester.action.wait(300);
        tester.set.comboBox(driver, "//*[@data-control-id = '132337']", "Winter");
        tester.check.screenshotBasedTest(driver, PATH, "solntseSnezhinka_special_winter", "//*[@data-control-id = '131890']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Пламя, прямая конвертация, проверка цвета пламени)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Пламя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void plamya(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132292']", "BlueYellow");
        tester.action.wait(300);
        local.checkSVGProperty(driver, "//*[@data-control-id = '131866']", "//*[@id = 'fire']", "class", "BlueYellow");
        tester.set.comboBox(driver, "//*[@data-control-id = '132292']", "OrangeYellow");
        tester.action.wait(300);
        local.checkSVGProperty(driver, "//*[@data-control-id = '131866']", "//*[@id = 'fire']", "class", "OrangeYellow");
        tester.set.comboBox(driver, "//*[@data-control-id = '132292']", "YellowOrange");
        tester.action.wait(300);
        local.checkSVGProperty(driver, "//*[@data-control-id = '131866']", "//*[@id = 'fire']", "class", "YellowOrange");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Светофор пешеходный, прямая конвертация, проверка корректности режимов работы)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Светофор пешеходный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void svetoforPeshehodniy(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132322']", "green");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "svetoforPeshehodniy_green", "//*[@data-control-id = '131842']");
        tester.set.comboBox(driver, "//*[@data-control-id = '132322']", "red");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "svetoforPeshehodniy_red", "//*[@data-control-id = '131842']");
        tester.set.comboBox(driver, "//*[@data-control-id = '132322']", "off");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "svetoforPeshehodniy_off", "//*[@data-control-id = '131842']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Светофор, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Светофор")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void svetofor(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132307']", "green");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "svetofor_green", "//*[@data-control-id = '131854']");
        tester.set.comboBox(driver, "//*[@data-control-id = '132307']", "yellow");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "svetofor_yellow", "//*[@data-control-id = '131854']");
        tester.set.comboBox(driver, "//*[@data-control-id = '132307']", "red");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "svetofor_red", "//*[@data-control-id = '131854']");
        tester.set.comboBox(driver, "//*[@data-control-id = '132307']", "off");
        tester.action.wait(300);
        tester.check.screenshotBasedTest(driver, PATH, "svetofor_off", "//*[@data-control-id = '131854']");
    }
}
