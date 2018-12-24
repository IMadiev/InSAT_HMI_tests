package autotestSVG.IndustrialIcons.PlantsTest;

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

public class PlantsDirConBackgroundColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Plants/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Заводы (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '286432']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '286432']")));
        driver.findElement(By.xpath("//*[@data-control-id = '286432']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '182669']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '182669']")));
        InsatWebUITools tester = new InsatWebUITools();
        tester.set.colorButton(driver, "//*[@data-control-id = '182669']");
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186509']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186521']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186533']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186545']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186557']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186569']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186581']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186593']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186605']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186617']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186629']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186641']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186653']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод1, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod1(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod1_background", "//*[@data-control-id = '186509']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод2, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod2(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod2_background", "//*[@data-control-id = '186521']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод3, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod3(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod3_background", "//*[@data-control-id = '186533']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод4, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod4(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod4_background", "//*[@data-control-id = '186545']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод5, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод5")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod5(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod5_background", "//*[@data-control-id = '186557']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод6, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод6")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod6(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod6_background", "//*[@data-control-id = '186569']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод7, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод7")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod7(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod7_background", "//*[@data-control-id = '186581']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод8, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод8")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod8(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod8_background", "//*[@data-control-id = '186593']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод9, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод9")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod9(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod9_background", "//*[@data-control-id = '186605']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод10, прямая конвертация,проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод10")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod10(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod10_background", "//*[@data-control-id = '186617']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод11, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод11")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod11(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod11_background", "//*[@data-control-id = '186629']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод12, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод12")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod12(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod12_background", "//*[@data-control-id = '186641']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод13, прямая конвертация, проверка корректности отображения фона при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод13")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod13(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod13_background", "//*[@data-control-id = '186653']");
    }
}
