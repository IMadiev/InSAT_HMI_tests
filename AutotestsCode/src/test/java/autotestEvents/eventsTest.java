package autotestEvents;

import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class eventsTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
    LocalSteps local = new LocalSteps();
    public static final String link = "http://10.0.1.96:8043/2/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие рабочей страницы тестового проекта")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/2/index.html");
        recorder.start(driver);
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='74916']"))); //здесь нужно указать xpath любого элемента на стартовой странице
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='74916']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка работы события [Клик] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Клик")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void click(){
        String event = "[Клик]";
        String buttonXPath = "//*[@data-control-id='80002']";
        String eventCounterXPath = "//*[@data-control-id='43801']";
        String x_xpath = "//*[@data-control-id='85629']";
        String y_xpath = "//*[@data-control-id='85746']";
        String lkm_xpath = "//*[@data-control-id='85863']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        local.checkEventParameters(driver, event, x_xpath, y_xpath, lkm_xpath);
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Двойной клик] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Двойной клик")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void doubleClick(){
        String event = "[Двойной клик]";
        String buttonXPath = "//*[@data-control-id='80353']";
        String eventCounterXPath = "//*[@data-control-id='77088']";
        String x_xpath = "//*[@data-control-id='90543']";
        String y_xpath = "//*[@data-control-id='90660']";
        String lkm_xpath = "//*[@data-control-id='90777']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.doubleClick(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        local.checkEventParameters(driver, event, x_xpath, y_xpath, lkm_xpath);
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Нажатие мыши] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Нажатие мыши")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void mouseDown(){
        String event = "[Нажатие мыши]";
        String buttonXPath = "//*[@data-control-id='80470']";
        String eventCounterXPath = "//*[@data-control-id='77303']";
        String x_xpath = "//*[@data-control-id='91245']";
        String y_xpath = "//*[@data-control-id='91362']";
        String lkm_xpath = "//*[@data-control-id='91479']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.mouseDown(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        local.checkEventParameters(driver, event, x_xpath, y_xpath, lkm_xpath);
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Отпускание мыши] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Отпускание мыши")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void mouseUp(){
        String event = "[Отпускание мыши]";
        String buttonXPath = "//*[@data-control-id='80587']";
        String eventCounterXPath = "//*[@data-control-id='81758']";
        String x_xpath = "//*[@data-control-id='91947']";
        String y_xpath = "//*[@data-control-id='92064']";
        String lkm_xpath = "//*[@data-control-id='92181']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.mouseDown(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "0");
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.mouseUp(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        local.checkEventParameters(driver, event, x_xpath, y_xpath, lkm_xpath);
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Захват мыши] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Захват мыши")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void mouse(){
        String event = "[Захват мыши]";
        String buttonXPath = "//*[@data-control-id='80704']";
        String eventCounterXPath = "//*[@data-control-id='81876']";
        String x_xpath = "//*[@data-control-id='92649']";
        String y_xpath = "//*[@data-control-id='92766']";
        String lkm_xpath = "//*[@data-control-id='92883']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='96836']",5,5);
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        local.checkEventParameters(driver, event, x_xpath, y_xpath, lkm_xpath);
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Покидание мыши] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Покидание мыши")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void mouseLeave(){
        String event = "[Покидание мыши]";
        String buttonXPath = "//*[@data-control-id='80821']";
        String eventCounterXPath = "//*[@data-control-id='82003']";
        String x_xpath = "//*[@data-control-id='93353']";
        String y_xpath = "//*[@data-control-id='93470']";
        String lkm_xpath = "//*[@data-control-id='93587']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='96836']",5,5);
        tester.action.wait(500);
        recorder.addShot(driver);

        tester.event.mouseOver(driver, "//*[@data-control-id='96624']",5,5);
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertNotEquals("Событие [Покидание мыши] сработало некорректно", "0", driver.findElement(By.xpath("//*[@data-control-id='82003']")).getText());
        local.checkEventParameters(driver, event, x_xpath, y_xpath, lkm_xpath);
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Перемещение мыши] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Перемещение мыши")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void mouseMotion(){
        String event = "[Перемещение мыши]";
        String buttonXPath = "//*[@data-control-id='80938']";
        String eventCounterXPath = "//*[@data-control-id='82121']";
        String x_xpath = "//*[@data-control-id='94055']";
        String y_xpath = "//*[@data-control-id='94172']";
        String lkm_xpath = "//*[@data-control-id='94289']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='96836']",5,5);
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        local.checkEventParameters(driver, event, x_xpath, y_xpath, lkm_xpath);
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Ввод символа] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Ввод символа")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void inputSymbol(){
        String event = "[Ввод символа]";
        String buttonXPath = "//*[@data-control-id='81406']";
        String eventCounterXPath = "//*[@data-control-id='82593']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Нажатие клавиши] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Нажатие клавиши")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void keyDown(){
        String event = "[Нажатие клавиши]";
        String buttonXPath = "//*[@data-control-id='81523']";
        String eventCounterXPath = "//*[@data-control-id='82711']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.keyDown(driver, "//*[@data-control-id='96836']", Keys.CONTROL);
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Отпускание клавиши] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Отпускание клавиши")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void keyUp(){
        String event = "[Отпускание клавиши]";
        String buttonXPath = "//*[@data-control-id='81640']";
        String eventCounterXPath = "//*[@data-control-id='82829']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.keyDown(driver, "//*[@data-control-id='96836']", Keys.CONTROL);
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "0");

        tester.event.keyUp(driver, "//*[@data-control-id='96836']", Keys.CONTROL);
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Получение фокуса] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Получение фокуса")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void focusOn(){
        String event = "[Получение фокуса]";
        String buttonXPath = "//*[@data-control-id='81172']";
        String eventCounterXPath = "//*[@data-control-id='82357']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }

    @Description("Проверка работы события [Потеря фокуса] на элементе [Овал]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "События")
    @Story(value = "Потеря фокуса")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void focusOff(){
        String event = "[Потеря фокуса]";
        String buttonXPath = "//*[@data-control-id='81289']";
        String eventCounterXPath = "//*[@data-control-id='82475']";
        tester.action.wait(driver, buttonXPath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXPath);
        tester.action.wait(driver, "//*[@data-control-id='96836']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='96836']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "0");
        tester.event.click(driver, "//*[@data-control-id='96624']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.textOutput(driver, eventCounterXPath, "1");
        tester.event.click(driver,"//*[@data-control-id='395002']");
    }
}
