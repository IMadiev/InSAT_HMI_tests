package autotestUsersInRT;

import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class CurrentUserTest {
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

    @Description("Проверка получения данных о текущем пользователе")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "Task", url = TASK_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Управление пользователями в RT")
    @Story(value = "Получение данных о текущем пользователе (созданном в DT)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void getCurrentUsername_DT(){
        tester.action.loginAs(driver, "ARamazanova", "");
        local.waitPreloader(driver);
        tester.action.wait(driver, "//*[@data-control-id='79921']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='79921']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.check.textOutput(driver, "//*[@data-control-id='79943']", "ARamazanova");
        tester.check.textOutput(driver, "//*[@data-control-id='79921']", "Group1");
    }

    @Description("Проверка получения данных о текущем пользователе")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "Task", url = TASK_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Управление пользователями в RT")
    @Story(value = "Получение данных о текущем пользователе (созданном в RT)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void getCurrentUsername_RT(){
        tester.action.loginAs(driver, "ARamazanova", "");
        local.waitPreloader(driver);
        recorder.addShot(driver);
        local.createUser(driver, "Temp", "Temp", "Разрешить", recorder);
        tearDown();
        setup();
        tester.action.loginAs(driver, "Temp", "Temp");
        local.waitPreloader(driver);
        tester.action.wait(driver, "//*[@data-control-id='79921']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='79921']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.check.textOutput(driver, "//*[@data-control-id='79943']", "Temp");
        tester.check.textOutput(driver, "//*[@data-control-id='79978']", "Разрешить");
        Assert.assertNotEquals("Не вернулось время входа пользователя","Текст",driver.findElement(By.xpath("//*[@data-control-id='79964']")).getText());
    }

}
