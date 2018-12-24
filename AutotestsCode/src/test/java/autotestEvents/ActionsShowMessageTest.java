package autotestEvents;

import io.qameta.allure.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class ActionsShowMessageTest {
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='317871']"))); //здесь нужно указать xpath любого элемента на стартовой странице
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='317871']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void click(){
        String event = "[Клик]";
        String buttonXpath = "//*[@data-control-id='283279']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Двойной клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void doubleClick(){
        String event = "[Двойной клик]";
        String buttonXpath = "//*[@data-control-id='304432']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Нажатие мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseDown(){
        String event = "[Нажатие мыши]";
        String buttonXpath = "//*[@data-control-id='302670']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Отпускание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseUp(){
        String event = "[Отпускание мыши]";
        String buttonXpath = "//*[@data-control-id='300910']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseUp(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Получение фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOn(){
        String event = "[Отпускание мыши]";
        String buttonXpath = "//*[@data-control-id='293848']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Потеря фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOff(){
        String event = "[Потеря мыши]";
        String buttonXpath = "//*[@data-control-id='292085']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='282017']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Ввод символа]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void inputSymbol(){
        String event = "[Ввод символа]";
        String buttonXpath = "//*[@data-control-id='290326']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Нажатие клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyDown(){
        String event = "[Нажатие клавиши]";
        String buttonXpath = "//*[@data-control-id='285041']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Отпускание клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyUp(){
        String event = "[Отпускание клавиши]";
        String buttonXpath = "//*[@data-control-id='288563']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        recorder.addShot(driver);
        tester.event.keyUp(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Захват мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouse(){
        String event = "[Захват мыши]";
        String buttonXpath = "//*[@data-control-id='299147']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Покидание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseLeave(){
        String event = "[Покидание мыши]";
        String buttonXpath = "//*[@data-control-id='297374']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='282017']",5,5);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }

    @Description("Проверка действия [Показать сообщение] вызываемого событием [Перемещение мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Показать сообщение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseMotion(){
        String event = "[Перемещение мыши]";
        String buttonXpath = "//*[@data-control-id='295611']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkMessage(driver, event);
    }
}
