package autotestUsersInRT;

import io.qameta.allure.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ShowGroupTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
    LocalSteps local = new LocalSteps();

    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/e1a64ff69a01f9e7091ee830c2d1c846/";
    public static final String TASK_LINK = "http://10.0.0.99:8080/DefaultCollection/MS4/_workitems/edit/16053?fullScreen=false";
    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/1/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие страницы аутентификации")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/1/index.html");
        recorder.start(driver);
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @AfterClass
    public static void afterAll(){
        LocalSteps local = new LocalSteps();
        local.deleteTrash(driver, "Temp");
    }

    @Parameterized.Parameter
    public String delimeter;

    @Parameterized.Parameters (name = "delimeter = {0}")
    public static Collection<String> dataProvider(){
        return Arrays.asList(new String[]{
                "", " ", ",", "kek", "12", "/*", "!--"
        });
    }

    @Description("Проверка установки групп пользователю")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "Task", url = TASK_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Управление пользователями в RT")
    @Story(value = "Установить группы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void groupList(){
        tester.action.loginAs(driver, "ARamazanova", "");
        local.waitPreloader(driver);
        recorder.addShot(driver);
        local.createUser(driver, "Temp", "", "", recorder);
        tester.action.wait(driver, "//*[@data-control-id='59140']");

        local.setGroups(driver, "Temp", "group1,group2,group3", recorder);
        if (delimeter!="") {
            local.checkGroups(driver, "Temp", delimeter, "group1" + delimeter + "group2" + delimeter + "group3", recorder);
        } else {
            local.checkGroups(driver, "Temp", delimeter, "group1,group2,group3", recorder);
        }
    }
}
