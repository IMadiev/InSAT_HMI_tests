package autotestSVG.BaseObjects.Blower;

import autotestSVG.LocalSteps;
import io.qameta.allure.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebUITools;

public class BlowerDirConHoopColorTest {
    private static WebDriver driver;
    LocalSteps local = new LocalSteps();
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Blower/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Воздуходувки (прямая)]")
    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/28/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '467876']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '467876']")));
        driver.findElement(By.xpath("//*[@data-control-id = '467876']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '119789']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '119789']")));
        driver.findElement(By.xpath("//*[@data-control-id = '119789']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        tester.action.wait(driver, "//*[@data-control-id = '119634']");
        tester.set.colorButton(driver, "//*[@data-control-id = '119634']");
    }

    @Before
    public void returnDriver () {
        driver.switchTo().defaultContent();
    }

    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Воздуходувка верхний выход, прямая конвертация, проверка динамизации параметра [Цвет обода])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуходувки")
    @Story(value = "Воздуходувка верхний выход")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vozduhoduvkaVerhniyVihod(){
        String XPath = "//*[@data-control-id = '119160']";
        local.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "vozduhoduvkaVerhniyVihod_hoopColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Воздуходувка боковой выход, прямая конвертация, проверка динамизации параметра [Цвет обода])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Воздуходувки")
    @Story(value = "Воздуходувка боковой выход")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vozduhoduvkaBokovoyVihod(){
        String XPath = "//*[@data-control-id = '119172']";
        local.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "vozduhoduvkaBokovoyVihod_hoopColor", XPath);
    }
}
