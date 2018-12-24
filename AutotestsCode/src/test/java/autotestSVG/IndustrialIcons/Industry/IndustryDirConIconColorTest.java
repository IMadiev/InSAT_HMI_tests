package autotestSVG.IndustrialIcons.Industry;

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

public class IndustryDirConIconColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Industry/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Промышленность (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '280899']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '280899']")));
        driver.findElement(By.xpath("//*[@data-control-id = '280899']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '186300']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '186300']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '186300']");
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186340']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186354']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186368']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186382']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186396']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186410']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186424']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186438']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186452']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186466']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186480']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186494']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Баллон, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Баллон")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ballon(){
        tester.check.screenshotBasedTest(driver, PATH, "ballon_icon", "//*[@data-control-id = '186340']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Баллоны, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Баллоны")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void balloni(){
        tester.check.screenshotBasedTest(driver, PATH, "balloni_icon", "//*[@data-control-id = '186354']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Баржа, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Баржа")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void barzha(){
        tester.check.screenshotBasedTest(driver, PATH, "barzha_icon", "//*[@data-control-id = '186368']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бензовоз, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Бензовоз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void benzovoz(){
        tester.check.screenshotBasedTest(driver, PATH, "benzovoz_icon", "//*[@data-control-id = '186382']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Вентиль, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Вентиль")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ventil(){
        tester.check.screenshotBasedTest(driver, PATH, "ventil_icon", "//*[@data-control-id = '186396']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Вышка, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Вышка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vishka(){
        tester.check.screenshotBasedTest(driver, PATH, "vishka_icon", "//*[@data-control-id = '186410']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Колонка, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Колонка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kolonka(){
        tester.check.screenshotBasedTest(driver, PATH, "kolonka_icon", "//*[@data-control-id = '186424']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Молекула, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Молекула")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void molecula(){
        tester.check.screenshotBasedTest(driver, PATH, "molecula_icon", "//*[@data-control-id = '186438']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Нефтевышка, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Нефтевышка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void neftevishka(){
        tester.check.screenshotBasedTest(driver, PATH, "neftevishka_icon", "//*[@data-control-id = '186452']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Нефтехранилище, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Нефтехранилище")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void neftehranische(){
        tester.check.screenshotBasedTest(driver, PATH, "neftehranische_icon", "//*[@data-control-id = '186466']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Огонь, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Огонь")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ogon(){
        tester.check.screenshotBasedTest(driver, PATH, "ogon_icon", "//*[@data-control-id = '186480']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Цистерна, прямая конвертация, проверк корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Промышленность")
    @Story(value = "Цистерна")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void cisterna(){
        tester.check.screenshotBasedTest(driver, PATH, "cisterna_icon", "//*[@data-control-id = '186494']");
    }
}
