package autotestUsersInRT;

import io.qameta.allure.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

import java.util.Arrays;
import java.util.Collection;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class CreateUserTest {
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
        local.deleteTrash(driver, "login");
        local.deleteTrash(driver, "login1");
        local.deleteTrash(driver, "login2");
        local.deleteTrash(driver, "login3");
        local.deleteTrash(driver, "login4");
        local.deleteTrash(driver, "login5");
        local.deleteTrash(driver, "login6");
    }

    @Parameterized.Parameter
    public String login;

    @Parameterized.Parameter(1)
    public String password;

    @Parameterized.Parameter(2)
    public String group;

    @Parameterized.Parameters (name = "login = {0} | password = {1} | group = {2}")
    public static Collection<String[]> dataProvider(){
        return Arrays.asList(new String[][]{
                {"login", "password", "group"},
                {"login1", "", ""},
                {"login2","password2",""},
                {"login3","","group3"},
                {"login4", "password4", "Разрешить"},
                {"login5","password5", "Запретить"},
                {"login6","password6", "Подтверждение"}
        });
    }

    @Description("Проверка создания/удаления пользователя")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "Task", url = TASK_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Управление пользователями в RT")
    @Story(value = "Создание/удаление пользователя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void createAndDeleteUser(){
        tester.action.loginAs(driver, "ARamazanova", "");
        local.waitPreloader(driver);
        recorder.addShot(driver);
        local.createUser(driver, login, password, group, recorder);
        tearDown();
        setup();
        local.checkUserExist(driver, login, password, group, recorder);
        tearDown();
        setup();
        tester.action.loginAs(driver, "ARamazanova", "");
        local.waitPreloader(driver);
        recorder.addShot(driver);
        local.deleteUser(driver, login, recorder);
        tearDown();
        setup();
        local.checkUserDelete(driver, login, recorder);
    }
}
