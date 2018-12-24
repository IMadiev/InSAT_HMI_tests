package autotestSVG.RoadEngineering;

import io.qameta.allure.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebUITools;

public class SignTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/RoadEngineering/Signs";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Знаки]")
    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/28/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '468046']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '468046']")));
        driver.findElement(By.xpath("//*[@data-control-id = '468046']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165971']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165971']")));
        driver.findElement(By.xpath("//*[@data-control-id = '165971']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165771']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165771']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165783']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165783']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165795']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165795']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165807']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165807']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165819']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165819']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165831']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165831']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165843']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165843']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165855']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165855']")));
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Главная дорога)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Знаки")
    @Story(value = "Главная дорога")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void glavnayaDoroga(){
        tester.check.screenshotBasedTest(driver, PATH, "glavnayaDoroga", "//*[@data-control-id = '165771']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кирпич)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Знаки")
    @Story(value = "Кирпич")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kirpich(){
        tester.check.screenshotBasedTest(driver, PATH, "kirpich", "//*[@data-control-id = '165783']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Мигалка)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Знаки")
    @Story(value = "Мигалка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void migalka(){
        tester.check.screenshotBasedTest(driver, PATH, "migalka", "//*[@data-control-id = '165795']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Объезд)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Знаки")
    @Story(value = "Объезд")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void obyezd(){
        tester.check.screenshotBasedTest(driver, PATH, "obyezd", "//*[@data-control-id = '165807']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Огорождение)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Знаки")
    @Story(value = "Огорождение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ogorozhdeniye(){
        tester.check.screenshotBasedTest(driver, PATH, "ogorozhdeniye", "//*[@data-control-id = '165819']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Проезд запрещен)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Знаки")
    @Story(value = "Проезд запрещен")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void proyezdZapreschen(){
        tester.check.screenshotBasedTest(driver, PATH, "proyezdZapreschen", "//*[@data-control-id = '165831']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Ремонтные работы)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Знаки")
    @Story(value = "Ремонтные работы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void remontniyeRaboti(){
        tester.check.screenshotBasedTest(driver, PATH, "remontniyeRaboti", "//*[@data-control-id = '165843']");
    }
}
