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

public class ActionsFullscreenTest {
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

    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void click(){
        String event = "[Клик]";
        String fullscreenInXpath = "//*[@data-control-id='284398']";
        String fullscreenOutXpath = "//*[@data-control-id='283403']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.click(driver, fullscreenInXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        tester.event.click(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Двойной клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void doubleClick(){
        String event = "[Двойной клик]";
        String fullscreenInXpath = "//*[@data-control-id='305549']";
        String fullscreenOutXpath = "//*[@data-control-id='304556']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, fullscreenInXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Нажатие мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseDown(){
        String event = "[Нажатие мыши]";
        String fullscreenInXpath = "//*[@data-control-id='303787']";
        String fullscreenOutXpath = "//*[@data-control-id='302794']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, fullscreenInXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        tester.event.mouseDown(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Отпускание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseUp(){
        String event = "[Отпускание мыши]";
        String fullscreenInXpath = "//*[@data-control-id='302027']";
        String fullscreenOutXpath = "//*[@data-control-id='301034']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.mouseUp(driver, fullscreenInXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        tester.event.mouseUp(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Получение фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOn(){
        String event = "[Получение фокуса]";
        String fullscreenInXpath = "//*[@data-control-id='294972']";
        String fullscreenOutXpath = "//*[@data-control-id='293972']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.click(driver, fullscreenInXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        tester.event.click(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Потеря фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOff(){
        String event = "[Потеря фокуса]";
        String fullscreenInXpath = "//*[@data-control-id='294972']";
        String fullscreenOutXpath = "//*[@data-control-id='293972']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.click(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='282457']");
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        tester.event.click(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='282457']");
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Ввод символа]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void inputSymbol(){
        String event = "[Ввод символа]";
        String fullscreenInXpath = "//*[@data-control-id='291446']";
        String fullscreenOutXpath = "//*[@data-control-id='290450']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, fullscreenInXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        tester.event.inputSymbol(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Ignore(value = "Тест игнорируется, т.к. системные кнопки и движение мыши не подходят для действия ( API can only be initiated by a user gesture.)")
    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Нажатие клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link), @Link(name = "Bug16139", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems?id=16139&triage=true&fullScreen=false&_a=edit")})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyDown(){
        String event = "[Нажатие клавиши]";
        String fullscreenInXpath = "//*[@data-control-id='286161']";
        String fullscreenOutXpath = "//*[@data-control-id='285165']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, fullscreenInXpath, Keys.CONTROL);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        tester.event.keyDown(driver, fullscreenOutXpath, Keys.CONTROL);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Ignore(value = "Тест игнорируется, т.к. системные кнопки и движение мыши не подходят для действия ( API can only be initiated by a user gesture.)")
    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Отпускание клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link), @Link(name = "Bug16139", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems?id=16139&triage=true&fullScreen=false&_a=edit")})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyUp(){
        String event = "[Отпускание клавиши]";
        String fullscreenInXpath = "//*[@data-control-id='289683']";
        String fullscreenOutXpath = "//*[@data-control-id='288687']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, fullscreenInXpath, Keys.CONTROL);
        recorder.addShot(driver);
        tester.event.keyUp(driver, fullscreenInXpath, Keys.CONTROL);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, fullscreenOutXpath,Keys.CONTROL);
        recorder.addShot(driver);
        tester.event.keyUp(driver, fullscreenOutXpath, Keys.CONTROL);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Ignore(value = "Тест игнорируется, т.к. системные кнопки и движение мыши не подходят для действия ( API can only be initiated by a user gesture.)")
    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Захват мыши]")
    @Links(value = {@Link(name = "TestProject", url = link), @Link(name = "Bug16139", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems?id=16139&triage=true&fullScreen=false&_a=edit")})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouse(){
        String event = "[Захват мыши]";
        String fullscreenInXpath = "//*[@data-control-id='300267']";
        String fullscreenOutXpath = "//*[@data-control-id='299271']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, fullscreenInXpath, 5, 5);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, fullscreenOutXpath,5,5);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Ignore(value = "Тест игнорируется, т.к. системные кнопки и движение мыши не подходят для действия ( API can only be initiated by a user gesture.)")
    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Покидание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link), @Link(name = "Bug16139", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems?id=16139&triage=true&fullScreen=false&_a=edit")})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseLeave(){
        String event = "[Покидание мыши]";
        String fullscreenInXpath = "//*[@data-control-id='298504']";
        String fullscreenOutXpath = "//*[@data-control-id='297498']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, fullscreenInXpath, 5, 5);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='282457']",5,5);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        tester.event.mouseOver(driver, fullscreenOutXpath,5,5);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='282457']",5,5);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }

    @Ignore(value = "Тест игнорируется, т.к. системные кнопки и движение мыши не подходят для действия ( API can only be initiated by a user gesture.)")
    @Description("Проверка действий [Войти в полноэкранный режим] и [Выйти из полноэкранного режима}  вызываемого событием [Перемещение мыши]")
    @Links(value = {@Link(name = "TestProject", url = link), @Link(name = "Bug16139", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems?id=16139&triage=true&fullScreen=false&_a=edit")})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Полноэкранный режим")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseMotion(){
        String event = "[Перемещение мыши]";
        String fullscreenInXpath = "//*[@data-control-id='296735']";
        String fullscreenOutXpath = "//*[@data-control-id='295735']";
        int usualHeight = driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height;

        tester.action.wait(driver, fullscreenInXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, fullscreenInXpath, 5, 5);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, true, usualHeight, event);
        tester.action.wait(driver, fullscreenOutXpath);
        tester.event.mouseOver(driver, fullscreenOutXpath,5,5);
        recorder.addShot(driver);
        local.checkFrameHeight(driver, false, usualHeight, event);
    }
}
