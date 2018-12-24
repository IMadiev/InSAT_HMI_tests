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

public class RoadMachinesTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/RoadEngineering/RoadMachines";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Дорожная техника]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165938']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165938']")));
        driver.findElement(By.xpath("//*[@data-control-id = '165938']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165482']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165482']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165494']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165494']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165506']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165506']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165518']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165518']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165530']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165530']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165542']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165542']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165554']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165554']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165566']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165566']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165578']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165578']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165590']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165590']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165602']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165602']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165614']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165614']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165626']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165626']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '165638']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '165638']")));
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бетономешалка //мешает бетон, бригада строителей жрет самогон)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Бетономешалка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void betonomeshalka(){
        tester.check.screenshotBasedTest(driver, PATH, "betonomeshalka", "//*[@data-control-id = '165482']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бульдозер)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Бульдозер")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void buldozer(){
        tester.check.screenshotBasedTest(driver, PATH, "buldozer", "//*[@data-control-id = '165494']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Грейдозер малогабаритный)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Грейдозер малогабаритный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void greidozerMalogabaritniy(){
        tester.check.screenshotBasedTest(driver, PATH, "greidozerMalogabaritniy", "//*[@data-control-id = '165506']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Грейдозер)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Грейдозер")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void greidozer(){
        tester.check.screenshotBasedTest(driver, PATH, "greidozer", "//*[@data-control-id = '165518']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Каток)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Каток")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void katok(){
        tester.check.screenshotBasedTest(driver, PATH, "katok", "//*[@data-control-id = '165530']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Конус дорожный)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Конус дорожный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void konusDorozhniy(){
        tester.check.screenshotBasedTest(driver, PATH, "konusDorozhniy", "//*[@data-control-id = '165542']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Погрузчик малогабаритный многофункциональный)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Погрузчик малогабаритный многофункциональный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void pogruzchikMalogabaritniyMnogofunctionalniy(){
        tester.check.screenshotBasedTest(driver, PATH, "pogruzchikMalogabaritniyMnogofunctionalniy", "//*[@data-control-id = '165554']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Погрузчик)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Погрузчик")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void pogruzchik(){
        tester.check.screenshotBasedTest(driver, PATH, "pogruzchik", "//*[@data-control-id = '165566']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Преграждение бетонное)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Преграждение бетонное")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void pregrazhdenieBetonnoye(){
        tester.check.screenshotBasedTest(driver, PATH, "pregrazhdenieBetonnoye", "//*[@data-control-id = '165578']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Самосвал)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Самосвал")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void samosval(){
        tester.check.screenshotBasedTest(driver, PATH, "samosval", "//*[@data-control-id = '165590']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Трактор)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Трактор")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void traktor(){
        tester.check.screenshotBasedTest(driver, PATH, "traktor", "//*[@data-control-id = '165602']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Указатель)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Указатель")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ukazatel(){
        tester.check.screenshotBasedTest(driver, PATH, "ukazatel", "//*[@data-control-id = '165614']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Экскаватор)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Road Engineering]")
    @Feature(value = "Дорожная техника")
    @Story(value = "Экскаватор")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void exkavator(){
        tester.check.screenshotBasedTest(driver, PATH, "exkavator", "//*[@data-control-id = '165626']");
    }
}
