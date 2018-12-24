package autotestSVG.Images.Buttons;

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

public class ButtonsDirectConversationTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/Images/Buttons/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Баржа (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Баржа (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void barzhaSeriy(){
        String XPath = "//*[@data-control-id = '132602']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "barzhaSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Ветряные мельницы (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Ветряные мельницы (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vetryaniyeMelnitsiSeriy(){
        String XPath = "//*[@data-control-id = '132614']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "vetryaniyeMelnitsiSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Завод (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavodSeriy(){
        String XPath = "//*[@data-control-id = '132626']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "zavodSeriy", XPath);
    }
    @Description("Сравнение скриншота актуальной страницы с эталоном (Инструменты (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Инструменты (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void instrumentiSeriy(){
        String XPath = "//*[@data-control-id = '132638']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "instrumentiSeriy", XPath);
    }
    @Description("Сравнение скриншота актуальной страницы с эталоном (Кран башенный (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кран башенный (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kranBashenniySeriy(){
        String XPath = "//*[@data-control-id = '132650']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "kranBashenniySeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кран (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кран (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kranSeriy(){
        String XPath = "//*[@data-control-id = '132662']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "kranSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Лампочка (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochkaSeriy(){
        String XPath = "//*[@data-control-id = '132674']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "lampochkaSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Насос (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosSeriy(){
        String XPath = "//*[@data-control-id = '132686']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "nasosSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Настройки (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Настройки (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nastroykiSeriy(){
        String XPath = "//*[@data-control-id = '132698']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "nastroykiSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Солнечная батарея (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Солнечная батарея (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solnechnayaBatareyaSeriy(){
        String XPath = "//*[@data-control-id = '132710']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "solnechnayaBatareyaSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Трубы (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Трубы (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubiSeriy(){
        String XPath = "//*[@data-control-id = '132722']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "trubiSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Цистерна (серый), прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Цистерна (серый)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void cisternaSeriy(){
        String XPath = "//*[@data-control-id = '132734']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "cisternaSeriy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кнопка 2, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кнопка 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void knopka2(){
        String XPath = "//*[@data-control-id = '132758']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "knopka2", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кнопка 1, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кнопка 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void knopka1(){
        String XPath = "//*[@data-control-id = '132746']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "knopka1", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кнопка 3, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кнопка 3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void knopka3(){
        String XPath = "//*[@data-control-id = '132770']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "knopka3", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кнопка 4, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Кнопки")
    @Story(value = "Кнопка 4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void knopka4(){
        String XPath = "//*[@data-control-id = '132782']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "knopka4", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бункер, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "bunker", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Ветряные мельницы, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "vetryaniyeMelnitsi", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "zavod", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Инструменты, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "instrumenti", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кран башенный, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "kranBashenniy", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кран, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "kran", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "lampochka", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "nasos", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Настройки, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "nastroyki", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Солнечная батарея, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "solnechnayaBatareya", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Трубы, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "trubi", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Цистерна, прямая конвертация, проверка корректности начального отображения)")
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
        tester.check.screenshotBasedTest(driver, PATH, "cisterna", XPath);
    }
}
