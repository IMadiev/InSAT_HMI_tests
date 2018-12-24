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

public class ActionsCallFBTest {
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

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void click(){
        String event = "[Клик]";
        String buttonXpath = "//*[@data-control-id='186056']";
        String stXpath = "//*[@data-control-id='197002']";
        String fbdXpath = "//*[@data-control-id='266235']";
        String ldXpath = "//*[@data-control-id='267691']";
        String sfcXpath = "//*[@data-control-id='269341']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Двойной клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void doubleClick(){
        String event = "[Двойной клик]";
        String buttonXpath = "//*[@data-control-id='187276']";
        String stXpath = "//*[@data-control-id='198102']";
        String fbdXpath = "//*[@data-control-id='266345']";
        String ldXpath = "//*[@data-control-id='268791']";
        String sfcXpath = "//*[@data-control-id='269451']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Нажатие мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseDown(){
        String event = "[Нажатие мыши]";
        String buttonXpath = "//*[@data-control-id='187154']";
        String stXpath = "//*[@data-control-id='198212']";
        String fbdXpath = "//*[@data-control-id='266455']";
        String ldXpath = "//*[@data-control-id='268901']";
        String sfcXpath = "//*[@data-control-id='269561']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Отпускание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseUp(){
        String event = "[Отпускание мыши]";
        String buttonXpath = "//*[@data-control-id='187032']";
        String stXpath = "//*[@data-control-id='197992']";
        String fbdXpath = "//*[@data-control-id='266565']";
        String ldXpath = "//*[@data-control-id='268681']";
        String sfcXpath = "//*[@data-control-id='269671']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseUp(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Получение фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOn(){
        String event = "[Получение фокуса]";
        String buttonXpath = "//*[@data-control-id='186544']";
        String stXpath = "//*[@data-control-id='197112']";
        String fbdXpath = "//*[@data-control-id='266675']";
        String ldXpath = "//*[@data-control-id='267801']";
        String sfcXpath = "//*[@data-control-id='269781']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Потеря фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOff(){
        String event = "[Потеря фокуса]";
        String buttonXpath = "//*[@data-control-id='186422']";
        String stXpath = "//*[@data-control-id='197552']";
        String fbdXpath = "//*[@data-control-id='266785']";
        String ldXpath = "//*[@data-control-id='268241']";
        String sfcXpath = "//*[@data-control-id='269891']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='269781']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Ввод символа]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void inputSymbol(){
        String event = "[Ввод символа]";
        String buttonXpath = "//*[@data-control-id='186300']";
        String stXpath = "//*[@data-control-id='197442']";
        String fbdXpath = "//*[@data-control-id='266895']";
        String ldXpath = "//*[@data-control-id='268131']";
        String sfcXpath = "//*[@data-control-id='270002']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, buttonXpath);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Нажатие клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyDown(){
        String event = "[Нажатие клавиши]";
        String buttonXpath = "//*[@data-control-id='186178']";
        String stXpath = "//*[@data-control-id='197332']";
        String fbdXpath = "//*[@data-control-id='267005']";
        String ldXpath = "//*[@data-control-id='268021']";
        String sfcXpath = "//*[@data-control-id='270112']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Отпускание клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyUp(){
        String event = "[Отпускание клавиши]";
        String buttonXpath = "//*[@data-control-id='187520']";
        String stXpath = "//*[@data-control-id='197222']";
        String fbdXpath = "//*[@data-control-id='267115']";
        String ldXpath = "//*[@data-control-id='267911']";
        String sfcXpath = "//*[@data-control-id='270222']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        recorder.addShot(driver);
        tester.event.keyUp(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Захват мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouse(){
        String event = "[Захват мыши]";
        String buttonXpath = "//*[@data-control-id='186910']";
        String stXpath = "//*[@data-control-id='197882']";
        String fbdXpath = "//*[@data-control-id='267335']";
        String ldXpath = "//*[@data-control-id='268571']";
        String sfcXpath = "//*[@data-control-id='270442']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Покидание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseLeave(){
        String event = "[Покидание мыши]";
        String buttonXpath = "//*[@data-control-id='186788']";
        String stXpath = "//*[@data-control-id='197772']";
        String fbdXpath = "//*[@data-control-id='267445']";
        String ldXpath = "//*[@data-control-id='268461']";
        String sfcXpath = "//*[@data-control-id='270552']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='270442']",5,5);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }

    @Description("Проверка действия [Вызов ФБ], вызываемого событием [Перемещение мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Вызов ФБ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseMotion(){
        String event = "[Перемещение мыши]";
        String buttonXpath = "//*[@data-control-id='186666']";
        String stXpath = "//*[@data-control-id='197662']";
        String fbdXpath = "//*[@data-control-id='267555']";
        String ldXpath = "//*[@data-control-id='268351']";
        String sfcXpath = "//*[@data-control-id='270662']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkFB(driver, event, stXpath, fbdXpath, ldXpath, sfcXpath);
    }
}
