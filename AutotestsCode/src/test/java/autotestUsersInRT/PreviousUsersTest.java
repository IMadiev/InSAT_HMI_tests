package autotestUsersInRT;

import io.qameta.allure.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class PreviousUsersTest {
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

    @Description("Проверка сохранения пользователей, созданных в предыдущей сессии")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "Task", url = TASK_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Управление пользователями в RT")
    @Story(value = "Сохранение пользователей предыдущей сессии")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void setAndCheckGroups(){
        tester.action.loginAs(driver, "ARamazanova", "");
        tester.action.wait(driver, "//*[@data-control-id='59202']");
        local.waitPreloader(driver);
        recorder.addShot(driver);
        tester.action.wait(driver, "//*[@data-control-id='59140']");
        tester.set.textInput(driver, "//*[@data-control-id='59140']", "");
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.action.wait(driver, "//*[@data-control-id='59202']");
        tester.event.click(driver, "//*[@data-control-id='59202']");
        tester.action.wait(500);
        recorder.addShot(driver);

        if (!(driver.findElement(By.xpath("//*[@data-control-id='59184']")).getText().contains("Constant_1")&&driver.findElement(By.xpath("//*[@data-control-id='59184']")).getText().contains("Constant_2")&&driver.findElement(By.xpath("//*[@data-control-id='59184']")).getText().contains("Constant_3"))){
            local.createUser(driver, "Constant_1", "", "Разрешить", recorder);
            local.createUser(driver, "Constant_2", "password", "", recorder);
            local.createUser(driver, "Constant_3", "", "", recorder);
            tester.action.wait(driver, "//*[@data-control-id='59140']");
            tester.set.textInput(driver, "//*[@data-control-id='59140']", "");
            tester.event.click(driver, "//*[@data-control-id='58848']");
            tester.action.wait(1000);
            tester.action.wait(driver, "//*[@data-control-id='59202']");
            tester.event.click(driver, "//*[@data-control-id='59202']");
            tester.action.wait(1000);
            if (!(driver.findElement(By.xpath("//*[@data-control-id='59184']")).getText().contains("Constant_1")&&driver.findElement(By.xpath("//*[@data-control-id='59184']")).getText().contains("Constant_2")&&driver.findElement(By.xpath("//*[@data-control-id='59184']")).getText().contains("Constant_3"))){
                Assert.assertTrue("Не удалось создать заново пользователей Constant_1, Constant_2, Constant_3", false);
            }
            Assert.assertTrue("Не сохранились пользователи, созданные в предыдущей сессии", false);
        }
    }
}
