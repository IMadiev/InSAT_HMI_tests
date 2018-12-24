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

public class ActionsOpenWindowTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='75721']"))); //здесь нужно указать xpath любого элемента на стартовой странице
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='75721']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void click(){
        String event = "[Клик]";
        String buttonXpath = "//*[@data-control-id='157498']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Двойной клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void doubleClick(){
        String event = "[Двойной клик]";
        String buttonXpath = "//*[@data-control-id='158718']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Нажатие мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseDown(){
        String event = "[Нажатие мыши]";
        String buttonXpath = "//*[@data-control-id='158596']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Отпускание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseUp(){
        String event = "[Отпускание мыши]";
        String buttonXpath = "//*[@data-control-id='158474']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseUp(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Получение фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOn(){
        String event = "[Получение фокуса]";
        String buttonXpath = "//*[@data-control-id='175442']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Потеря фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOff(){
        String event = "[Потеря фокуса]";
        String buttonXpath = "//*[@data-control-id='175320']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='135462']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Ввод символа]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void inputSymbol(){
        String event = "[Ввод символа]";
        String buttonXpath = "//*[@data-control-id='157742']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Нажатие клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyDown(){
        String event = "[Нажатие клавиши]";
        String buttonXpath = "//*[@data-control-id='157620']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Отпускание клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyUp(){
        String event = "[Отпускание клавиши]";
        String buttonXpath = "//*[@data-control-id='158962']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath,Keys.CONTROL);
        recorder.addShot(driver);
        tester.event.keyUp(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Захват мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouse(){
        String event = "[Захват мыши]";
        String buttonXpath = "//*[@data-control-id='158352']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Покидание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseLeave(){
        String event = "[Покидание мыши]";
        String buttonXpath = "//*[@data-control-id='175686']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='135462']",5,5);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }

    @Description("Проверка действия [Открыть окно], вызываемого событием [Перемещение мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Открыть окно")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseMotion(){
        String event = "[Перемещение мыши]";
        String buttonXpath = "//*[@data-control-id='175564']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.action.wait(1000);
        recorder.addShot(driver);
        Assert.assertEquals("Не сработало действие [Открыть окно] по событию "+event, "http://127.0.0.1:8043/2/index.html?window=157163", driver.getCurrentUrl());
    }
}
