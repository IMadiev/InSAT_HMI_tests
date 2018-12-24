package autotestSVG.RoadEngineering;

import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebUITools;

public class TruckTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/RoadEngineering/Trucks";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Грузовики]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165905']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165905']")));
        driver.findElement(By.xpath("//*[@data-control-id = '165905']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165112']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165112']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165124']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165124']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165136']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165136']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165148']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165148']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165160']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165160']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165172']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165172']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165184']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165184']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165196']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165196']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165208']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165208']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165222']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165222']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165334']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165334']")));
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бензовоз большой)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Бензовоз большой")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void benzovozBolshoy(){
            tester.check.screenshotBasedTest(driver, PATH, "benzovozBolshoy", "//*[@data-control-id = '165112']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бензовоз)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Бензовоз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void benzovoz(){
        tester.check.screenshotBasedTest(driver, PATH, "benzovoz", "//*[@data-control-id = '165124']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Грузовик большой)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Грузовик большой")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gruzovikBolshoy(){
        tester.check.screenshotBasedTest(driver, PATH, "gruzovikBolshoy", "//*[@data-control-id = '165136']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Грузовик открытый)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Грузовик открытый")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gruzovikOtkritiy(){
        tester.check.screenshotBasedTest(driver, PATH, "gruzovikOtkritiy", "//*[@data-control-id = '165148']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Грузовик)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Грузовик")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gruzovik(){
        tester.check.screenshotBasedTest(driver, PATH, "gruzovik", "//*[@data-control-id = '165160']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Самосвал оранжевый открытый)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Самосвал оранжевый открытый")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void samosvalOrangeviyOtkritiy(){
        tester.check.screenshotBasedTest(driver, PATH, "samosvalOrangeviyOtkritiy", "//*[@data-control-id = '165172']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Самосвал оранжевый)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Самосвал оранжевый")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void samosvalOrangeviy(){
        tester.check.screenshotBasedTest(driver, PATH, "samosvalOrangeviy", "//*[@data-control-id = '165184']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Самосвал)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Самосвал")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void samosval(){
        tester.check.screenshotBasedTest(driver, PATH, "samosval", "//*[@data-control-id = '165196']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Самосвал открытый)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Самосвал открытый")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void samosvalOtkritiy(){
        tester.check.screenshotBasedTest(driver, PATH, "samosvalOtkritiy", "//*[@data-control-id = '165208']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Эвакуатор)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Грузовики")
    @Story(value = "Эвакуатор")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void evacuator(){
        tester.check.screenshotBasedTest(driver, PATH, "evacuator", "//*[@data-control-id = '165222']");
    }
}
