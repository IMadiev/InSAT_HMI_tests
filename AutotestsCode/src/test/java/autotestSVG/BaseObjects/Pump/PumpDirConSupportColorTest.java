package autotestSVG.BaseObjects.Pump;

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

public class PumpDirConSupportColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Pump/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";


    @Step("Открытие страницы [Насосы (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '88415']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '88415']")));
        driver.findElement(By.xpath("//*[@data-control-id = '88415']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        tester.action.wait(driver, "//*[@data-control-id = '65111']");
        tester.set.colorButton(driver, "//*[@data-control-id = '65111']");
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос вертикальный, прямая конвертация, проверка динамизации параметра [Цвет опоры])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос вертикальный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosVerticalniy(){
        String XPath = "//*[@data-control-id = '64692']";
        tester.action.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "nasosVerticalniy_supportColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос улитка вертикальный, прямая конвертация, проверка динамизации параметра [Цвет опоры])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос улитка вертикальный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosUlitkaVerticalniy(){
        String XPath = "//*[@data-control-id = '64704']";
        tester.action.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "nasosUlitkaVerticalniy_supportColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос горизонтальный, прямая конвертация, проверка динамизации параметра [Цвет опоры])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос горизонтальный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosGorizontalniy(){
        String XPath = "//*[@data-control-id = '64716']";
        tester.action.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "nasosGorizontalniy_supportColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос профиль, прямая конвертация, проверка динамизации параметра [Цвет опоры])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Насос профиль")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasosProfil(){
        String XPath = "//*[@data-control-id = '64728']";
        tester.action.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "nasosProfil_supportColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренчатый насос, прямая конвертация, проверка динамизации параметра [Цвет опоры])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Шестеренчатый насос")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenchatiyNasos(){
        String XPath = "//*[@data-control-id = '64740']";
        tester.action.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "shesterenchatiyNasos_supportColor", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренчатый насос 2, прямая конвертация, проверка динамизации параметра [Цвет опоры])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Насосы")
    @Story(value = "Шестеренчатый насос 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenchatiyNasos2(){
        String XPath = "//*[@data-control-id = '64752']";
        tester.action.waitSVG(driver, XPath);
        tester.check.screenshotBasedTest(driver, PATH, "shesterenchatiyNasos2_supportColor", XPath);
    }
}
