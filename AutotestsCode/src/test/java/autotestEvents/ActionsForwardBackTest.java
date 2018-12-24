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

public class ActionsForwardBackTest {
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='394200']"))); //здесь нужно указать xpath любого элемента на стартовой странице
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='394200']");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='391942']")));
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='391942']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void click(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Клик]";
        String backXPath = "//*[@data-control-id='390158']";
        String forwardXPath = "//*[@data-control-id='381828']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.click(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.click(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Двойной клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void doubleClick(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Двойной клик]";
        String backXPath = "//*[@data-control-id='391388']";
        String forwardXPath = "//*[@data-control-id='382553']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Нажатие мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseDown(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Нажатие мыши]";
        String backXPath = "//*[@data-control-id='391265']";
        String forwardXPath = "//*[@data-control-id='383291']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Отпускание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseUp(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Отпускание мыши]";
        String backXPath = "//*[@data-control-id='391142']";
        String forwardXPath = "//*[@data-control-id='382320']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertNotEquals("Произошел ложный переход на окно [Назад], вызванный событием [Нажатие мыши]", "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.event.mouseUp(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertNotEquals("Произошел ложный переход на окно [Вперед], вызванный событием [Нажатие мыши]", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        tester.event.mouseUp(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Получение фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOn(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Получение фокуса]";
        String backXPath = "//*[@data-control-id='390650']";
        String forwardXPath = "//*[@data-control-id='382074']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.click(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.click(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Потеря фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOff(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Потеря фокуса]";
        String backXPath = "//*[@data-control-id='390527']";
        String forwardXPath = "//*[@data-control-id='382922']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.click(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertNotEquals("Произошел ложный переход на окно [Назад], вызванный событием [Получение фокуса]", "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.event.click(driver, "//*[@data-control-id='388618']");
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.click(driver, forwardXPath);
        Assert.assertNotEquals("Произошел ложный переход на окно [Вперед], вызванный событием [Получение фокуса]", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        tester.event.click(driver, "//*[@data-control-id='383524']");
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Ввод символа]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void inputSymbol(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Ввод символа]";
        String backXPath = "//*[@data-control-id='390404']";
        String forwardXPath = "//*[@data-control-id='381951']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Нажатие клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyDown(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Нажатие клавиши]";
        String backXPath = "//*[@data-control-id='390281']";
        String forwardXPath = "//*[@data-control-id='382799']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, backXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, forwardXPath);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Отпускание клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyUp(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Отпускание клавиши]";
        String backXPath = "//*[@data-control-id='391634']";
        String forwardXPath = "//*[@data-control-id='382676']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, backXPath, Keys.CONTROL);
        recorder.addShot(driver);
        Assert.assertNotEquals("Произошел ложный переход на окно [Назад], вызванный событием [Нажатие клавиши]", "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.event.keyUp(driver, backXPath, Keys.CONTROL);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, forwardXPath,Keys.CONTROL);
        recorder.addShot(driver);
        Assert.assertNotEquals("Произошел ложный переход на окно [Вперед], вызванный событием [Нажатие клавиши]", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        tester.event.keyUp(driver, forwardXPath,Keys.CONTROL);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Захват мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseFocus(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Захват мыши]";
        String backXPath = "//*[@data-control-id='391019']";
        String forwardXPath = "//*[@data-control-id='383168']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, backXPath, 5, 5);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, forwardXPath,5,5);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Покидание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseLeave(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Покидание мыши]";
        String backXPath = "//*[@data-control-id='390896']";
        String forwardXPath = "//*[@data-control-id='382197']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, backXPath, 5, 5);
        recorder.addShot(driver);
        Assert.assertNotEquals("Произошел ложный переход на окно [Назад], вызванный событием [Захват мыши]", "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.event.mouseOver(driver, "//*[@data-control-id='388618']",5,5);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());

        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, forwardXPath,5,5);
        recorder.addShot(driver);
        Assert.assertNotEquals("Произошел ложный переход на окно [Назад], вызванный событием [Захват мыши]", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        tester.event.mouseOver(driver, "//*[@data-control-id='383524']",5,5);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }

    @Description("Проверка действий [Вперед] и [Назад], вызываемых событием [Перемещение мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вперед/Назад")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseMotion(){
        Assert.assertEquals("Не произошел переход на окно [Вперед] по клику кнопки с указаниями ", "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
        String event = "[Перемещение мыши]";
        String backXPath = "//*[@data-control-id='390773']";
        String forwardXPath = "//*[@data-control-id='383045']";

        tester.action.wait(driver, backXPath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, backXPath, 5, 5);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Назад], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=381604", driver.getCurrentUrl());
        tester.action.wait(driver, forwardXPath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, forwardXPath,5,5);
        recorder.addShot(driver);
        Assert.assertEquals("Не произошел переход на окно [Вперед], вызванный событием "+event, "http://127.0.0.1:8043/2/index.html?window=386773", driver.getCurrentUrl());
    }
}
