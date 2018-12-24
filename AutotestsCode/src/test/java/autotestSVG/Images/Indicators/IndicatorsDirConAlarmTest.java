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

public class IndicatorsDirConAlarmTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
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
    
    @Description("Проверка класса элемента SVG [AvaryBorder] (Снежинка, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Снежинка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void snezhinka(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Alarm");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131878']", "//*[@id = 'AvaryBorder']", "class", "Alarm");
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Warning");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131878']", "//*[@id = 'AvaryBorder']", "class", "Warning");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Солнце, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Солнце")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solntse(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Alarm");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131902']", "//*[@id = 'AvaryBorder']", "class", "Alarm");
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Warning");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131902']", "//*[@id = 'AvaryBorder']", "class", "Warning");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Солнце снежинка, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Солнце снежинка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solntseSnezhinka(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Alarm");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131890']", "//*[@id = 'AvaryBorder']", "class", "Alarm");
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Warning");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131890']", "//*[@id = 'AvaryBorder']", "class", "Warning");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Пламя, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Индикаторы")
    @Story(value = "Пламя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void plamya(){
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Alarm");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131866']", "//*[@id = 'AvaryBorder']", "class", "Alarm");
        tester.set.comboBox(driver, "//*[@data-control-id = '132118']", "Warning");
        local.checkSVGProperty(driver, "//*[@data-control-id = '131866']", "//*[@id = 'AvaryBorder']", "class", "Warning");
    }
}
