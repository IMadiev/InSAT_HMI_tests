package autotestSVG.IndustrialIcons.Scales;

import autotestSVG.LocalSteps;
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

public class ScalesDirectConversationTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Scales/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Шкалы (прямая)]")
    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/28/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '467942']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '467942']")));
        driver.findElement(By.xpath("//*[@data-control-id = '467942']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '272483']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '272483']")));
        driver.findElement(By.xpath("//*[@data-control-id = '272483']")).click();
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188330']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188342']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188354']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188366']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188378']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188390']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188402']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188414']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188426']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188438']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188450']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188462']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188474']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188486']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188498']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188510']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188522']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '188534']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 1, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala1(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala1", "//*[@data-control-id = '188330']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 2, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala2(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala2", "//*[@data-control-id = '188342']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 3, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala3(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala3", "//*[@data-control-id = '188354']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 4, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala4(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala4", "//*[@data-control-id = '188366']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 5, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 5")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala5(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala5", "//*[@data-control-id = '188378']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 6, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 6")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala6(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala6", "//*[@data-control-id = '188390']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 7, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 7")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala7(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala7", "//*[@data-control-id = '188402']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 8, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 8")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala8(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala8", "//*[@data-control-id = '188414']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 9, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 9")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala9(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala9", "//*[@data-control-id = '188426']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 10, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 10")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala10(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala10", "//*[@data-control-id = '188438']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 11, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 11")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala11(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala11", "//*[@data-control-id = '188450']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 12, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 12")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala12(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala12", "//*[@data-control-id = '188462']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 13, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 13")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala13(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala13", "//*[@data-control-id = '188474']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 14, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 14")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala14(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala14", "//*[@data-control-id = '188486']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 15, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 15")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala15(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala15", "//*[@data-control-id = '188498']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 16, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 16")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala16(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala16", "//*[@data-control-id = '188510']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 17, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 17")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala17(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala17", "//*[@data-control-id = '188522']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала 18, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шкалы")
    @Story(value = "Шкала 18")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala18(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala18", "//*[@data-control-id = '188534']");
    }
}
