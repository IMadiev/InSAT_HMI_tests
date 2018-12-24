package autotestSVG.BaseObjects.Pipeline;

import autotestSVG.LocalSteps;
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

public class PipelineDirConAlarmTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/BaseObjects/Pipeline/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Трубопровод (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '96598']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '96598']")));
        driver.findElement(By.xpath("//*[@data-control-id = '96598']")).click();
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

    @Description("Проверка класса элемента SVG [AvaryBorder] (Труба вертикальная, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Труба вертикальная")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubaVertikalnaya(){
        String XPath = "//*[@data-control-id = '95867']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Угол, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Угол")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol(){
        String XPath = "//*[@data-control-id = '95879']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Тройник, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik(){
        String XPath = "//*[@data-control-id = '95891']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Тройник (1 к 2), прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник (1 к 2)")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik1k2(){
        String XPath = "//*[@data-control-id = '95903']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Фланцы, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Фланцы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void flantsi(){
        String XPath = "//*[@data-control-id = '95915']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Тройник 1, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik1(){
        String XPath = "//*[@data-control-id = '95927']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Тройник 1-2, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 1-2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik1_2(){
        String XPath = "//*[@data-control-id = '95939']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Тройник 2, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik2(){
        String XPath = "//*[@data-control-id = '95951']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Тройник 2-2, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Тройник 2-2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void troynik2_2(){
        String XPath = "//*[@data-control-id = '95963']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Труба X, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Труба X")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubaX(){
        String XPath = "//*[@data-control-id = '95987']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Угол 1, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Угол 1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol1(){
        String XPath = "//*[@data-control-id = '95975']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Угол 2, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Угол 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ugol2(){
        String XPath = "//*[@data-control-id = '96002']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }

    @Description("Проверка класса элемента SVG [AvaryBorder] (Труба горизонтальная, прямая конвертация, проверка работы параметра [Общая авария])")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [BaseObjects]")
    @Feature(value = "Трубопровод")
    @Story(value = "Труба горизонтальная")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void trubaGorizontalnaya(){
        String XPath = "//*[@data-control-id = '95855']";
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Warning");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Warning");
        tester.set.comboBox(driver, "//*[@data-control-id = '96218']", "Alarm");
        local.checkSVGProperty(driver, XPath, "//*[@id = 'AvaryBorder']", "class", "Alarm");
    }
}
