package autotestWindows;

import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class PopupKeyboardTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    LocalSteps local = new LocalSteps();
    InsatWebRecorder recorder = new InsatWebRecorder();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/Windows/Keyboard";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/4/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие стартовой страницы")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/4/index.html");
        recorder.start(driver);
        tester.action.wait(driver, "//*[@data-control-id = '64485']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '64485']");
        tester.action.wait(driver, "//*[@data-control-id = '59290']");
        recorder.addShot(driver);
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка русской раскладки всплывающей клавиатуры")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_russianKeyboard_checkUsability(){
        tester.event.click(driver, "//*[@data-control-id = '59461']");
        recorder.addShot(driver);
        tester.check.presenceOfElement(driver, "Клавиатура с русской раскладкой", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        local.russianKeyboardInput(driver);
    }

    @Description("Проверка английской раскладки всплывающей клавиатуры")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_englishKeyboard_checkUsability(){
        tester.event.click(driver, "//*[@data-control-id = '59474']");
        recorder.addShot(driver);
        tester.check.presenceOfElement(driver, "Клавиатура с английской раскладкой", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        local.englishKeyboardInput(driver);
    }

    @Description("Проверка цифровой раскладки всплывающей клавиатуры")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_numericKeyboard_checkUsability(){
        tester.event.click(driver, "//*[@data-control-id = '59488']");
        recorder.addShot(driver);
        tester.check.presenceOfElement(driver, "Клавиатура с цифровой раскладкой", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        local.numericKeyboardInput(driver);
    }

    @Description("Проверка расположения всплывающей клавиатуры - сверху по месту")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_1(){
        tester.event.click(driver, "//*[@data-control-id = '59502']");
        tester.check.presenceOfElement(driver, "Клавиатура сверху по месту", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не сверху", driver.findElement(By.xpath("//*[@data-control-id = '59502']")).getLocation().y-driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().y==driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().height);
        Assert.assertTrue("Диалог всплыла не по месту", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().x-driver.findElement(By.xpath("//*[@data-control-id = '59502']")).getLocation().x<driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().width/2);
    }

    @Description("Проверка расположения всплывающей клавиатуры - справа по месту")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_2(){
        tester.event.click(driver, "//*[@data-control-id = '59516']");
        tester.check.presenceOfElement(driver, "Клавиатура справа по месту", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не справа", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().x-driver.findElement(By.xpath("//*[@data-control-id = '59516']")).getLocation().x==driver.findElement(By.xpath("//*[@data-control-id = '59516']")).getSize().width);
        Assert.assertTrue("Диалог всплыла не по месту", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().y-driver.findElement(By.xpath("//*[@data-control-id = '59516']")).getLocation().y<driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().height/2);
    }

    @Description("Проверка расположения всплывающей клавиатуры - слева по месту")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_3(){
        tester.event.click(driver, "//*[@data-control-id = '59530']");
        tester.check.presenceOfElement(driver, "Клавиатура слева по месту", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не слева", driver.findElement(By.xpath("//*[@data-control-id = '59516']")).getLocation().x-driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().x==driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().width);
        Assert.assertTrue("Диалог всплыла не по месту", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().y-driver.findElement(By.xpath("//*[@data-control-id = '59516']")).getLocation().y<driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().height/2);
    }

    @Description("Проверка расположения всплывающей клавиатуры - снизу по месту")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_4(){
        tester.event.click(driver, "//*[@data-control-id = '59544']");
        tester.check.presenceOfElement(driver, "Клавиатура снизу по месту", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не снизу", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().y-driver.findElement(By.xpath("//*[@data-control-id = '59544']")).getLocation().y==driver.findElement(By.xpath("//*[@data-control-id = '59544']")).getSize().height);
        Assert.assertTrue("Диалог всплыла не по месту", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().x-driver.findElement(By.xpath("//*[@data-control-id = '59544']")).getLocation().x<driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().width/2);
    }

    @Description("Проверка расположения всплывающей клавиатуры - сверху окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_5(){
        tester.event.click(driver, "//*[@data-control-id = '59557']");
        tester.check.presenceOfElement(driver, "Клавиатура сверху окна", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не сверху", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().y==0);
    }

    @Description("Проверка расположения всплывающей клавиатуры - справа окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_6(){
        tester.event.click(driver, "//*[@data-control-id = '59572']");
        tester.check.presenceOfElement(driver, "Клавиатура справа окна", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не справа", driver.manage().window().getSize().width-driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().x-driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().width<50);
    }

    @Description("Проверка расположения всплывающей клавиатуры - слева окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_7(){
        tester.event.click(driver, "//*[@data-control-id = '59587']");
        tester.check.presenceOfElement(driver, "Клавиатура слева окна", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не слева", driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().x==0);
    }

    @Description("Проверка расположения всплывающей клавиатуры - снизу окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard_checkLocation_8(){
        tester.event.click(driver, "//*[@data-control-id = '59602']");
        tester.check.presenceOfElement(driver, "Клавиатура снизу окна", "//*[contains(@class, 'ui-keyboard-has-focus')]");
        recorder.addShot(driver);
        Assert.assertTrue("Диалог всплыла не снизу", driver.manage().window().getSize().height-driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getLocation().y-driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]")).getSize().height<150);
    }

    @Description("Проверка расположения зафиксированной клавиатуры")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Стандартные контролы")
    @Feature(value = "Диалог")
    @Story(value = "Текстовый ввод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void virtualKeyboard(){
        tester.check.screenshotBasedTest(driver, PATH, "keyboard");
    }
}
