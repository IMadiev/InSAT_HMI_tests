package autotestJournal_ScalesAI;

import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

@FixMethodOrder
public class StaticScalesTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
    LocalSteps local = new LocalSteps();
    public static final String TPROJECT = "http://10.0.1.96:8043/29/index.html";
    public static final String RIZZOMA = "https://rizzoma.com/topic/814a6fac101a256c6bc5a75b91c2bc1c/0_b_9571_8djuf/";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие рабочей страницы тестового проекта")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/29/index.html");
        recorder.start(driver);
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='81462']")));
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='81462']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка отсутствия сообщения при параметре, находящемся в нейтральной зоне")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Статически выставленные значения для сигналов тревоги")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void normal(){
        tester.action.wait(driver, "//*[@data-control-id='58569']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "0");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
    }

    @Description("Проверка появления сообщения [Минимальное аварийное] при параметре, находящемся в зоне LoLo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Статически выставленные значения для сигналов тревоги")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lolo(){
        tester.action.wait(driver, "//*[@data-control-id='58569']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "9");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
        local.checkUnpresenceOfMessage(driver, "Минимальное предупреждающее");
        local.checkUnpresenceOfMessage(driver, "Максимальное предупреждающее");
        local.checkUnpresenceOfMessage(driver, "Максимальное аварийное");
    }

    @Description("Проверка появления сообщения [Минимальное предупреждающее] при параметре, находящемся в зоне Lo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Статически выставленные значения для сигналов тревоги")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lo(){
        tester.action.wait(driver, "//*[@data-control-id='58569']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "29");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное предупреждающее");
        local.checkUnpresenceOfMessage(driver, "Минимальное аварийное");
        local.checkUnpresenceOfMessage(driver, "Максимальное предупреждающее");
        local.checkUnpresenceOfMessage(driver, "Максимальное аварийное");
    }

    @Description("Проверка появления сообщения [Максимальное предупреждающее] при параметре, находящемся в зоне Hi")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Статически выставленные значения для сигналов тревоги")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hi(){
        tester.action.wait(driver, "//*[@data-control-id='58569']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "71");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Максимальное предупреждающее");
        local.checkUnpresenceOfMessage(driver, "Минимальное аварийное");
        local.checkUnpresenceOfMessage(driver, "Минимальное предупреждающее");
        local.checkUnpresenceOfMessage(driver, "Максимальное аварийное");
    }

    @Description("Проверка появления сообщения [Максимальное аварийное] при параметре, находящемся в зоне HiHi")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Статически выставленные значения для сигналов тревоги")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hihi(){
        tester.action.wait(driver, "//*[@data-control-id='58569']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='80902']", "91");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Максимальное аварийное");
        local.checkUnpresenceOfMessage(driver, "Минимальное аварийное");
        local.checkUnpresenceOfMessage(driver, "Минимальное предупреждающее");
        local.checkUnpresenceOfMessage(driver, "Максимальное предупреждающее");
    }
}
