package autotestSVG.Images.Buttons;

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

public class ButtonsDirConButtonColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/Images/Buttons/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Кнопки (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '256622']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '256622']")));
        driver.findElement(By.xpath("//*[@data-control-id = '256622']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '132978']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '132978']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '132978']");
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бункер, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Бункер")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void bunker(){
        String XPath = "//*[@data-control-id = '132794']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "bunker_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Ветряные мельницы, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Ветряные мельницы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vetryaniyeMelnitsi(){
        String XPath = "//*[@data-control-id = '132806']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "vetryaniyeMelnitsi_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Завод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod(){
        String XPath = "//*[@data-control-id = '132818']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zavod_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Инструменты, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Инструменты")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void instrumenti(){
        String XPath = "//*[@data-control-id = '132830']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "instrumenti_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кран башенный, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кран башенный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kranBashenniy(){
        String XPath = "//*[@data-control-id = '132842']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "kranBashenniy_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кран, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кран")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kran(){
        String XPath = "//*[@data-control-id = '132854']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "kran_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Лампочка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochka(){
        String XPath = "//*[@data-control-id = '132866']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "lampochka_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Насос")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasos(){
        String XPath = "//*[@data-control-id = '132878']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "nasos_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Настройки, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Настройки")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nastroyki(){
        String XPath = "//*[@data-control-id = '132890']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "nastroyki_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Солнечная батарея, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Солнечная батарея")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solnechnayaBatareya(){
        String XPath = "//*[@data-control-id = '132902']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "solnechnayaBatareya_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Трубы, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Трубы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubi(){
        String XPath = "//*[@data-control-id = '132914']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "trubi_buttonColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Цистерна, прямая конвертация, проверка отображения цвета кнопки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Цистерна")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void cisterna(){
        String XPath = "//*[@data-control-id = '132926']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "cisterna_buttonColor", XPath);
    }
}
