package autotestWindows;

import io.qameta.allure.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class PopupWindowTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/Windows/PopupWindow";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/4/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/4/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '64518']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '64518']")));
        driver.findElement(By.xpath("//*[@data-control-id = '64518']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '62729']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '62729']")));
        driver.findElement(By.xpath("//*[@data-control-id = '62729']")).click();
        try {
            driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]"));
        } catch (Exception er) {Assert.assertTrue("Всплывающее окно не появилось по клику на кнопку", false);}
        driver.quit();
    }

    @Step("Открытие стартовой страницы")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/4/index.html");
        recorder.start(driver);
        tester.action.wait(driver, "//*[@data-control-id = '64518']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '64518']");
        tester.action.wait(driver, "//*[@data-control-id = '62729']");
        recorder.addShot(driver);
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Проверка параметра [Текст заголовка]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Текст заголовка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void title(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        local.checkTitle(driver, "Заголовок всплывающего окна");
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id = '62958']", "Text");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        local.checkTitle(driver, "Text");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id = '62958']", "Заголовок всплывающего окна");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkTitle(driver, "Заголовок всплывающего окна");
    }

    @Description("Проверка параметра [Изменение размера]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Изменение размера")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void changeSize(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        local.checkResizability(driver);
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '62794']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        local.checkUnresizability(driver);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '62794']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkResizability(driver);
    }

    @Description("Проверка параметра [Сворачивание]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Сворачивание")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void minimizeWindow(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Кнопка сворачивания окна", driver, "//*[contains(@class, 'ui-dialog-titlebar-collapse') and @title = 'Свернуть']", "display", "block");
        tester.event.click(driver, "//*[contains(@class, 'ui-dialog-titlebar-collapse') and @title = 'Свернуть']");
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Фрейм", driver, "//*[@data-control-id = '2461']", "height", "0px");
        tester.event.click(driver, "//*[contains(@class, 'ui-dialog-titlebar-collapse-restore')]");
        recorder.addShot(driver);
        Assert.assertNotEquals("Окно не развернулось по требованию", "0px",driver.findElement(By.xpath("//*[@data-control-id = '2461']")).getCssValue("height"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '62817']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Кнопка сворачивания окна", driver, "//*[contains(@class, 'ui-dialog-titlebar-collapse') and @title = 'Свернуть']", "display", "none");
        tester.event.click(driver, "//*[@data-control-id = '62817']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Кнопка сворачивания окна", driver, "//*[contains(@class, 'ui-dialog-titlebar-collapse') and @title = 'Свернуть']", "display", "block");
    }

    @Description("Проверка параметра [Закрытие]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Закрытие")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void closeWindow(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Кнопка закрытия окна", driver, "//*[contains(@class, 'ui-dialog-titlebar-close')]", "display", "block");
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.check.unpresenceOfElement(driver, "Всплывающее окно", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]");
        tester.event.click(driver, "//*[@data-control-id = '62840']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Кнопка закрытия окна", driver, "//*[contains(@class, 'ui-dialog-titlebar-close')]", "display", "none");
        tester.event.click(driver, "//*[@data-control-id = '62840']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Кнопка закрытия окна", driver, "//*[contains(@class, 'ui-dialog-titlebar-close')]", "display", "block");
    }

    @Description("Проверка параметра [Видимость]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Видимость")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void visibility(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Всплывающее окно", driver, "//*[@data-control-id = '64161']", "visibility", "visible");
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '62863']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        tester.check.elementCSSProperty("Всплывающее окно", driver, "//*[@data-control-id = '64161']", "visibility", "hidden");
        tester.event.click(driver, "//*[@data-control-id = '62863']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Всплывающее окно", driver, "//*[@data-control-id = '64161']", "visibility", "visible");
    }

    @Description("Проверка параметра [Активность]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Активность")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void activity(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        tester.check.elementProperty("Всплывающее окно", driver, "//*[@data-control-id = '64161']", "disabled", null);
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '62886']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        tester.check.elementProperty("Всплывающее окно", driver, "//*[@data-control-id = '64161']", "disabled", "true");
        tester.event.click(driver, "//*[@data-control-id = '62886']");
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.elementProperty("Всплывающее окно", driver, "//*[@data-control-id = '64161']", "disabled", null);
    }

    @Description("Проверка параметра [Положение окна]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Положение окна")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void location(){
        tester.set.comboBox(driver, "//*[@data-control-id = '63727']", "Смещение от указателя");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Окно открылось не со смещением от указателя",
                driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().y>driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getLocation().y
                        && driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().x>driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getLocation().x
                        && driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().y<driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getLocation().y+driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getSize().height
                        && driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().x<driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getLocation().x+driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getSize().width);
        local.closePopupWindow(driver);
        recorder.addShot(driver);

        tester.set.comboBox(driver, "//*[@data-control-id = '63727']", "Смещение от элемента");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Окно открылось не со смещением от элемента",
                driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().y-driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getLocation().y<50
                        && driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().x-driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getLocation().x-driver.findElement(By.xpath("//*[@data-control-id = '62729']")).getSize().width<50);
        local.closePopupWindow(driver);
        recorder.addShot(driver);

        tester.set.comboBox(driver, "//*[@data-control-id = '63727']", "По заданным");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Окно открылось не по заданным",
                driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().y==0
                        && driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().x==0);
        local.closePopupWindow(driver);
        recorder.addShot(driver);

        tester.set.comboBox(driver, "//*[@data-control-id = '63727']", "По центру");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Окно открылось не по центру",
                driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().y!=0
                        && driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getLocation().x!=0);
        local.closePopupWindow(driver);
        recorder.addShot(driver);
    }

    @Description("Проверка параметра [Способ отображения]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Способ отображения")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void a_mapping_RealSize(){
        tester.set.comboBox(driver, "//*[@data-control-id = '63622']", "Исходный размер");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        tester.action.wait(500);
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "mapping_RealSize", "//*[@data-control-id = '2461']");
    }

    @Description("Проверка параметра [Способ отображения]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Способ отображения")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void a_mapping_adapt(){
        tester.set.comboBox(driver, "//*[@data-control-id = '63622']", "Подогнать");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "mapping_adapt", "//*[@data-control-id = '2461']");
    }

    @Description("Проверка параметра [Способ отображения]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Способ отображения")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void a_mapping_cut(){
        tester.set.comboBox(driver, "//*[@data-control-id = '63622']", "Обрезать");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "mapping_cut", "//*[@data-control-id = '2461']");
    }

    @Description("Проверка параметра [Способ отображения]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Способ отображения")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void a_mapping_scroll(){
        tester.set.comboBox(driver, "//*[@data-control-id = '63622']", "Прокрутить");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "mapping_scroll", "//*[@data-control-id = '2461']");
    }

    @Description("Проверка параметра [Подсказка]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Подсказка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void help(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        local.tooltipCheck(driver, "//*[@data-control-id = '64161']", "Кирилл, не смотри на торт");
    }

    @Description("Проверка параметра [Фон заголовка]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Фон заголовка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void titleBackground(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Фон заголовка неверного цвета в начальный момент времени", driver.findElement(By.xpath("//*[contains(@class, 'ui-helper-clearfix')]")).getCssValue("background").contains("rgb(0, 0, 255)"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.colorButton(driver, "//*[@data-control-id = '63365']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63365']", -500, -500);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Фон заголовка неверного цвета после установки при закрытом окне", driver.findElement(By.xpath("//*[contains(@class, 'ui-helper-clearfix')]")).getCssValue("background").contains("rgb(255, 255, 255)"));
        tester.set.colorButton(driver, "//*[@data-control-id = '63365']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63365']", 500, -500);
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertTrue("Фон заголовка неверного цвета после установки при открытом окне", driver.findElement(By.xpath("//*[contains(@class, 'ui-helper-clearfix')]")).getCssValue("background").contains("rgb(0, 0, 255)"));
    }

    @Description("Проверка параметра [Цвет текста заголовка]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Цвет текста заголовка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void titleTextColor(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет текста заголовка неверного цвета в начальный момент времени", driver.findElement(By.xpath("//*[contains(@class, 'ui-helper-clearfix')]/span")).getCssValue("color").contains("rgba(255, 0, 0, 1)"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.colorButton(driver, "//*[@data-control-id = '63379']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63379']", -500, -500);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет текста заголовка неверного цвета после установки при закрытом окне", driver.findElement(By.xpath("//*[contains(@class, 'ui-helper-clearfix')]/span")).getCssValue("color").contains("rgba(255, 255, 255, 1)"));
        tester.set.colorButton(driver, "//*[@data-control-id = '63379']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63379']", 500, -500);
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет текста заголовка неверного цвета после установки при открытом окне", driver.findElement(By.xpath("//*[contains(@class, 'ui-helper-clearfix')]/span")).getCssValue("color").contains("rgba(255, 0, 0, 1)"));
    }

    @Description("Проверка параметра [Толщина рамки]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Толщина рамки")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void border(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Толщина рамки неверна в начальный момент времени", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("3px"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id = '63481']", "7");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Толщина рамки неверна после установки при закрытом окне", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("7px"));
        tester.set.textInput(driver, "//*[@data-control-id = '63481']", "3");
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertTrue("Толщина рамки неверна после установки при открытом окне", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("3px"));
    }

    @Description("Проверка параметра [Стиль рамки]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Стиль рамки")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void borderStyle(){
        tester.set.comboBox(driver, "//*[@data-control-id = '63652']", "Непрерывный");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Стиль рамки неверен, ожидался [Непрерывный]", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("solid"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);

        tester.set.comboBox(driver, "//*[@data-control-id = '63652']", "Пунктир");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Стиль рамки неверен, ожидался [Пунктир]", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("dashed"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);

        tester.set.comboBox(driver, "//*[@data-control-id = '63652']", "Точка");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Стиль рамки неверен, ожидался [Точка]", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("dotted"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);

        tester.set.comboBox(driver, "//*[@data-control-id = '63652']", "Нет");
        tester.action.wait(1000);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Стиль рамки неверен, ожидался [Нет]", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("none"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);

        tester.set.comboBox(driver, "//*[@data-control-id = '63652']", "Пунктир");
        tester.action.wait(1000);
    }

    @Description("Проверка параметра [Цвет рамки]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Цвет рамки")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void borderColor(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет рамки неверного цвета в начальный момент времени", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("rgb(0, 255, 0)"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.colorButton(driver, "//*[@data-control-id = '63495']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63495']", -500, -500);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет рамки неверного цвета после установки при закрытом окне: "+driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border"), driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("rgb(255, 255, 255)"));
        tester.set.colorButton(driver, "//*[@data-control-id = '63495']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63495']", 500, -500);
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет рамки неверного цвета после установки при открытом окне", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("border").contains("rgb(0, 255, 0)"));
    }

    @Description("Проверка параметра [Порядок Z]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Порядок Z")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void z_index(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertEquals("Порядок Z неверен в начальный момент времени", "0", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("z-index"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id = '63523']", "5");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertEquals("Порядок Z неверен после установки при закрытом окне", "5", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("z-index"));
        tester.set.textInput(driver, "//*[@data-control-id = '63523']", "0");
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertEquals("Порядок Z неверен после установки при открытом окне", "0", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("z-index"));
    }

    @Description("Проверка параметра [Прозрачность]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Прозрачность")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void opacity(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertEquals("Прозрачность неверна в начальный момент времени", "1", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("opacity"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id = '63537']", "50");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertEquals("Прозрачность неверна после установки при закрытом окне", "0.5", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("opacity"));
        tester.set.textInput(driver, "//*[@data-control-id = '63537']", "100");
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertEquals("Прозрачность неверна после установки при открытом окне", "1", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("opacity"));
    }

    @Description("Проверка параметра [Заливка фона]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Заливка фона")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void backgroundColor(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет фона неверен в начальный момент времени", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("background-color").contains("rgba(255, 0, 0, 1)"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.colorButton(driver, "//*[@data-control-id = '63551']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63551']", -500, -500);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет фона неверен после установки при закрытом окне", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("background-color").contains("rgba(255, 255, 255, 1)"));
        tester.set.colorButton(driver, "//*[@data-control-id = '63551']");
        tester.action.wait(500);
        driver.findElement(By.xpath("//*[@data-control-id = '63429']")).click();
        tester.set.colorButton(driver, "//*[@data-control-id = '63551']", 500,-500);
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertTrue("Цвет фона неверен после установки при открытом окне", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getCssValue("background-color").contains("rgba(255, 0, 0, 1)"));
    }

    @Description("Проверка параметра [Клавиатурный индекс]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Всплывающее окно")
    @Feature(value = "Параметры всплывающего окна")
    @Story(value = "Клавиатурный индекс")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void tabindex(){
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertEquals("Клавиатурный индекс неверен в начальный момент времени", "1", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getAttribute("tabindex"));
        local.closePopupWindow(driver);
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id = '63593']", "7");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.openPopupWindow(driver);
        recorder.addShot(driver);
        Assert.assertEquals("Клавиатурный индекс неверен после установки при закрытом окне", "7",driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getAttribute("tabindex"));
        tester.set.textInput(driver, "//*[@data-control-id = '63593']", "1");
        tester.action.wait(500);
        recorder.addShot(driver);
        Assert.assertEquals("Клавиатурный индекс неверен после установки при открытом окне", "1", driver.findElement(By.xpath("//*[@data-control-id = '64161']")).getAttribute("tabindex"));
    }
}
