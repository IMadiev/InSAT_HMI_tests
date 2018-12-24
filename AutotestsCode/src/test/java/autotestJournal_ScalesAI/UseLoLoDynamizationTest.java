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

public class UseLoLoDynamizationTest {
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='81726']")));
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='81726']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка отсутствия сообщения LoLo при параметре, находящемся зоне LoLo, но при этом LoLo не использовано")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать LoLo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void LoLo_off(){
        tester.action.wait(driver, "//*[@data-control-id='73242']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90190']", false);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessage(driver, "Минимальное аварийное");
    }

    @Description("Проверка присутствия сообщения LoLo при параметре, появившемся в зоне LoLo раньше активации использования LoLo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать LoLo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void setParameter_LoLoOn(){
        tester.action.wait(driver, "//*[@data-control-id='73242']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90190']", false);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessage(driver, "Минимальное аварийное");
        tester.set.toggleButton(driver, "//*[@data-control-id='90190']", true);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
    }

    @Description("Проверка присутствия сообщения LoLo при параметре, появившемся в зоне LoLo после активации использования LoLo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать LoLo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void LoLoOn_setParameter(){
        tester.action.wait(driver, "//*[@data-control-id='73242']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90190']", true);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
    }

    @Description("Проверка значения столбца [Использовать LoLo] в сообщении (ожидание false)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA), @Link(name = "BUG 16255", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems/edit/16255")})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать LoLo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void LoLo_column_false(){
        tester.action.wait(driver, "//*[@data-control-id='73242']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90190']", false);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное предупреждающее");
        local.checkMessageColumnValue(driver, "Использовать LoLo", "//tbody//tr//*[@data-bind = 'UseLoLo,title=UseLoLo']", "false");
    }

    @Description("Проверка значения столбца [Использовать LoLo] в сообщении (ожидание true)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA), @Link(name = "BUG 16255", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems/edit/16255")})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать LoLo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void LoLo_column_true(){
        tester.action.wait(driver, "//*[@data-control-id='73242']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90190']", true);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90155']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
        local.checkMessageColumnValue(driver, "Использовать LoLo", "//tbody//tr//*[@data-bind = 'UseLoLo,title=UseLoLo']", "true");
    }
}
