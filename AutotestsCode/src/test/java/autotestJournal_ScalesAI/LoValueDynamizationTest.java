package autotestJournal_ScalesAI;

import io.qameta.allure.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class LoValueDynamizationTest {
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='81627']")));
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='81627']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Установка Lo больше LoLo, установка параметра между ними")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация значения Lo")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hi_parameter_hihi(){
        tester.action.wait(driver, "//*[@data-control-id='72070']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "0");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "30");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "20");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное предупреждающее");
        local.checkMessageActivity(driver, "Минимальное предупреждающее");
    }

    @Description("Установка Lo больше LoLo, установка параметра меньше LoLo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация значения Lo")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hi_hihi_parameter(){
        tester.action.wait(driver, "//*[@data-control-id='72070']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "0");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "30");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
        local.checkMessageActivity(driver, "Минимальное аварийное");
    }

    @Description("Установка Lo меньше LoLo, установка параметра меньше Lo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация значения Lo")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hihi_hi_parameter(){
        tester.action.wait(driver, "//*[@data-control-id='72070']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "0");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "1");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
        local.checkMessageActivity(driver, "Минимальное аварийное");
    }

    @Description("Установка Lo больше LoLo, установка параметра между ними, установка Lo равным LoLo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация значения Lo")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hihiMove_Hi_parameter(){
        tester.action.wait(driver, "//*[@data-control-id='72070']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "0");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "30");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "20");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное предупреждающее");
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "10");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkMessageDisabled(driver, "Минимальное предупреждающее");
    }

    @Description("Установка Lo меньше LoLo, установка параметра меньше Lo, установка Lo равным LoLo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация значения Lo")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hi_parameter_hihiMove(){
        tester.action.wait(driver, "//*[@data-control-id='72070']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "0");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.textInput(driver, "//*[@data-control-id='72270']", "1");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
        tester.set.textInput(driver, "//*[@data-control-id='90021']", "10");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkMessageActivity(driver, "Минимальное аварийное");
    }
}
