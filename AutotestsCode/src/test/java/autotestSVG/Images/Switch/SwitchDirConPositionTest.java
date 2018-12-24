package autotestSVG.Images.Switch;

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

public class SwitchDirConPositionTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/Images/Switch/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Переключатели (прямая)]")
    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/28/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '467909']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '467909']")));
        driver.findElement(By.xpath("//*[@data-control-id = '467909']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '258226']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '258226']")));
        driver.findElement(By.xpath("//*[@data-control-id = '258226']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '135263']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '135263']")));
        tester.set.comboBox(driver, "//*[@data-control-id = '135263']", "on");
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переключатель, прямая конвертация, проверка корректности отображения состояния после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Переключатели")
    @Story(value = "Переключатель")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perekluchatel(){
        String XPath = "//*[@data-control-id = '135107']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perekluchatel_position", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переключатель клавишный, прямая конвертация, проверка корректности отображения состояния после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Переключатели")
    @Story(value = "Переключатель клавишный")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perekluchatelKlavishniy(){
        String XPath = "//*[@data-control-id = '135119']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perekluchatelKlavishniy_position", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переключатель ползунковый(1), прямая конвертация, проверка корректности отображения состояния после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Переключатели")
    @Story(value = "Переключатель ползунковый(1)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perekluchatelPolzunkoviy1(){
        String XPath = "//*[@data-control-id = '135131']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perekluchatelPolzunkoviy1_position", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переключатель ползунковый(2), прямая конвертация, проверка корректности отображения состояния после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Переключатели")
    @Story(value = "Переключатель ползунковый(2)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perekluchatelPolzunkoviy2(){
        String XPath = "//*[@data-control-id = '135143']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perekluchatelPolzunkoviy2_position", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Переключатель ползунковый(3), прямая конвертация, проверка корректности отображения состояния после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Переключатели")
    @Story(value = "Переключатель ползунковый(3)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void perekluchatelPolzunkoviy3(){
        String XPath = "//*[@data-control-id = '135155']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "perekluchatelPolzunkoviy3_position", XPath);
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тумблер, прямая конвертация, проверка корректности отображения состояния после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Переключатели")
    @Story(value = "Тумблер")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void tumblr(){
        String XPath = "//*[@data-control-id = '135167']";
        WebDriverWait wait = new WebDriverWait(driver, 240);
        driver.switchTo().frame(driver.findElement(By.xpath(XPath)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        tester.check.screenshotBasedTest(driver, PATH, "tumblr_position", XPath);
    }
}
