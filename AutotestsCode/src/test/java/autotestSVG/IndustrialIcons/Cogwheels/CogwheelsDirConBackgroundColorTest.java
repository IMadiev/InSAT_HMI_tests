package autotestSVG.IndustrialIcons.Cogwheels;

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

public class CogwheelsDirConBackgroundColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Cogwheels/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Шестеренки (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '274950']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '274950']")));
        driver.findElement(By.xpath("//*[@data-control-id = '274950']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '187204']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '187204']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '187204']");
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187682']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187694']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187706']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187718']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187730']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187742']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187754']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187766']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187778']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187790']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187802']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187814']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '187826']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 1, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka1(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka1_background", "//*[@data-control-id = '187682']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 2, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka2(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka2_background", "//*[@data-control-id = '187694']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 3, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka3(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka3_background", "//*[@data-control-id = '187706']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 4, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka4(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka4_background", "//*[@data-control-id = '187718']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 5, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 5")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka5(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka5_background", "//*[@data-control-id = '187730']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 6, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 6")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka6(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka6_background", "//*[@data-control-id = '187742']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 7, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 7")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka7(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka7_background", "//*[@data-control-id = '187754']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 8, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 8")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka8(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka8_background", "//*[@data-control-id = '187766']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 9, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 9")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka9(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka9_background", "//*[@data-control-id = '187778']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 10, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 10")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka10(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka10_background", "//*[@data-control-id = '187790']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 11, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 11")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka11(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka11_background", "//*[@data-control-id = '187802']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 12, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 12")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka12(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka12_background", "//*[@data-control-id = '187814']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шестеренка 13, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Шестеренки")
    @Story(value = "Шестеренка 13")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shesterenka13(){
        tester.check.screenshotBasedTest(driver, PATH, "shesterenka13_background", "//*[@data-control-id = '187826']");
    }
}
