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

public class PlantsPointConIconColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Plants/PointConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Заводы (точечная)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '286465']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '286465']")));
        driver.findElement(By.xpath("//*[@data-control-id = '286465']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        tester.set.increment(driver, "//*[@data-control-id = '284598']", "21");
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284310']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284324']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284338']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284352']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284366']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284380']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284394']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284408']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284422']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284436']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284450']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284464']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '284478']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод1, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod1(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod1_icon", "//*[@data-control-id = '284310']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод2, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod2(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod2_icon", "//*[@data-control-id = '284324']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод3, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod3(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod3_icon", "//*[@data-control-id = '284338']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод4, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod4(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod4_icon", "//*[@data-control-id = '284352']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод5, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод5")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod5(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod5_icon", "//*[@data-control-id = '284366']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод6, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод6")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod6(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod6_icon", "//*[@data-control-id = '284380']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод7, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод7")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod7(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod7_icon", "//*[@data-control-id = '284394']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод8, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод8")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod8(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod8_icon", "//*[@data-control-id = '284408']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод9, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод9")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod9(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod9_icon", "//*[@data-control-id = '284422']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод10, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод10")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod10(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod10_icon", "//*[@data-control-id = '284436']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод11, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод11")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod11(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod11_icon", "//*[@data-control-id = '284450']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод12, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод12")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod12(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod12_icon", "//*[@data-control-id = '284464']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод13, точечная конвертация, проверка корректности цвета иконки при динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Заводы")
    @Story(value = "Завод13")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod13(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod13_icon", "//*[@data-control-id = '284478']");
    }
}
