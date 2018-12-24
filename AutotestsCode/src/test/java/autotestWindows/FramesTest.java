package autotestWindows;

import io.qameta.allure.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebUITools;

public class FramesTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/Windows/Frames";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/4/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие стартовой страницы")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/4/index.html");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Экран")
    @Story(value = "Отображение в контейнере окна")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void windowSizesInFrames(){
        tester.action.wait(driver, "//*[@data-control-id = '64436']");
        tester.event.click(driver, "//*[@data-control-id = '64436']");
        tester.action.wait(driver, "//*[@data-control-id = '58172']");
        tester.check.screenshotBasedTest(driver, PATH, "frame");
    }
}
