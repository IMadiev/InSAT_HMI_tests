package autotestEvents;

import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class ActionsStopSessionTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
    LocalSteps local = new LocalSteps();
    public static final String link = "http://10.0.1.96:8043/2/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие рабочей страницы тестового проекта")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/2/index.html");
        recorder.start(driver);
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id='317871']"))); //здесь нужно указать xpath любого элемента на стартовой странице
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='317871']");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void click(){
        String event = "[Клик]";
        String buttonXpath = "//*[@data-control-id='284026']";
        tester.action.wait(driver, buttonXpath);
        tester.event.click(driver, buttonXpath);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Двойной клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void doubleClick(){
        String event = "[Двойной клик]";
        String buttonXpath = "//*[@data-control-id='305177']";

        tester.action.wait(driver, buttonXpath);
        tester.event.doubleClick(driver, buttonXpath);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Нажатие мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseDown(){
        String event = "[Нажатие мыши]";
        String buttonXpath = "//*[@data-control-id='303415']";

        tester.action.wait(driver, buttonXpath);
        tester.event.mouseDown(driver, buttonXpath);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Отпускание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseUp(){
        String event = "[Отпускание мыши]";
        String buttonXpath = "//*[@data-control-id='301655']";

        tester.action.wait(driver, buttonXpath);
        tester.event.mouseUp(driver, buttonXpath);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Получение фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOn(){
        String event = "[Получение фокуса]";
        String buttonXpath = "//*[@data-control-id='294600']";

        tester.action.wait(driver, buttonXpath);
        tester.event.click(driver, buttonXpath);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Потеря фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOff(){
        String event = "[Потеря фокуса]";
        String buttonXpath = "//*[@data-control-id='292837']";

        tester.action.wait(driver, buttonXpath);
        tester.event.click(driver, buttonXpath);
        tester.event.click(driver, "//*[@data-control-id='282457']");
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Ввод символа]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void inputSymbol(){
        String event = "[Ввод символа]";
        String buttonXpath = "//*[@data-control-id='291074']";

        tester.action.wait(driver, buttonXpath);
        tester.event.inputSymbol(driver, buttonXpath);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Нажатие клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyDown(){
        String event = "[Нажатие клавиши]";
        String buttonXpath = "//*[@data-control-id='285789']";

        tester.action.wait(driver, buttonXpath);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Отпускание клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyUp(){
        String event = "[Отпускание клавиши]";
        String buttonXpath = "//*[@data-control-id='289311']";

        tester.action.wait(driver, buttonXpath);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        tester.event.keyUp(driver, buttonXpath, Keys.CONTROL);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Захват мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouse(){
        String event = "[Захват мыши]";
        String buttonXpath = "//*[@data-control-id='299895']";

        tester.action.wait(driver, buttonXpath);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Покидание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseLeave(){
        String event = "[Покидание мыши]";
        String buttonXpath = "//*[@data-control-id='298132']";

        tester.action.wait(driver, buttonXpath);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.event.mouseOver(driver, "//*[@data-control-id='282457']",5,5);
        local.waitPreloader(driver);
        Assert.assertEquals("Сессия не завершилась по событию "+event, "block", driver.findElement(By.cssSelector("body > div.preloaderBase.sheme-preloader")).getCssValue("display"));
    }

    @Flaky
    @Description("Проверка действия [Завершить сессию], вызываемого событием [Перемещение мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Завершить сессию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseMotion(){
        String event = "[Перемещение мыши]";
        String buttonXpath = "//*[@data-control-id='296363']";

        tester.action.wait(driver, buttonXpath);
        tester.event.mouseOver(driver, buttonXpath,5,5);
        tester.event.mouseOver(driver, "//*[@data-control-id='282457']",5,5);
        local.waitPreloader(driver);
        Assert.assertTrue("Сессия не завершилась по событию "+event, false);
    }
}
