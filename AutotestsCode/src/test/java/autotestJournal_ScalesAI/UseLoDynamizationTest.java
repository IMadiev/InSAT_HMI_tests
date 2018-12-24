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

public class UseLoDynamizationTest {
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='81660']")));
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='81660']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка отсутствия сообщения Lo при параметре, находящемся зоне Lo, но при этом Lo не использовано")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать Lo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void Lo_off(){
        tester.action.wait(driver, "//*[@data-control-id='72482']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90076']", false);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "29");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessage(driver, "Минимальное предупреждающее");
    }

    @Description("Проверка присутствия сообщения Lo при параметре, появившемся в зоне Lo раньше активации использования Lo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать Lo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void setParameter_LoOn(){
        tester.action.wait(driver, "//*[@data-control-id='72482']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90076']", false);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "29");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessage(driver, "Минимальное предупреждающее");
        tester.set.toggleButton(driver, "//*[@data-control-id='90076']", true);
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное предупреждающее");
    }

    @Description("Проверка присутствия сообщения Lo при параметре, появившемся в зоне Lo после активации использования Lo")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA)})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать Lo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void LoOn_setParameter(){
        tester.action.wait(driver, "//*[@data-control-id='72482']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90076']", true);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "25");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
    }

    @Description("Проверка значения столбца [Использовать Lo] в сообщении (ожидание false)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA), @Link(name = "BUG 16255", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems/edit/16255")})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать Lo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void Lo_column_false(){
        tester.action.wait(driver, "//*[@data-control-id='72482']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90076']", false);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "5");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное аварийное");
        local.checkMessageColumnValue(driver, "Использовать Lo", "//tbody//tr//*[@data-bind = 'UseLo,title=UseLo']", "false");
    }

    @Description("Проверка значения столбца [Использовать Lo] в сообщении (ожидание true)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT), @Link(name = "Rizzoma", url = RIZZOMA), @Link(name = "BUG 16255", url = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems/edit/16255")})
    @Epic(value = "Журнал")
    @Feature(value = "Шкалы AI")
    @Story(value = "Динамизация параметра [Использовать Lo]")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void Lo_column_true(){
        tester.action.wait(driver, "//*[@data-control-id='72482']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "50");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.acceptAllMessages(driver);
        recorder.addShot(driver);
        local.checkUnpresenceOfMessages(driver);
        tester.set.toggleButton(driver, "//*[@data-control-id='90076']", true);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='90055']", "29");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.checkPresenceOfMessage(driver, "Минимальное предупреждающее");
        local.checkMessageColumnValue(driver, "Использовать Lo", "//tbody//tr//*[@data-bind = 'UseLo,title=UseLo']", "true");
    }
}
