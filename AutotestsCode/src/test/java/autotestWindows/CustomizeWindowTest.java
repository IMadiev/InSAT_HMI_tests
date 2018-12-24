package autotestWindows;

import io.qameta.allure.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class CustomizeWindowTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
    LocalSteps local = new LocalSteps();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/Windows/CustomizeWindow";

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
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Проверка начального значения заливки фона)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Заливка фона")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void backgroundColor_1(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '65909']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '65909']");
        tester.action.wait(driver, "//*[@data-control-id = '64679']");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "backgroundColor_1");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (После динамизации заливки фона)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Заливка фона")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void backgroundColor_2(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '65909']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '65909']");
        tester.action.wait(driver, "//*[@data-control-id = '64679']");
        recorder.addShot(driver);
        tester.set.colorButton(driver, "//*[@data-control-id = '64679']");
        tester.check.screenshotBasedTest(driver, PATH, "backgroundColor_2");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Проверка начального значения прозрачности)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Прозрачность")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void opacity_1(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '65942']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '65942']");
        tester.action.wait(driver, "//*[@data-control-id = '64889']");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "opacity_1");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Проверка начального значения прозрачности)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Прозрачность")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void opacity_2(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '65942']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '65942']");
        tester.action.wait(driver, "//*[@data-control-id = '64889']");
        recorder.addShot(driver);
        tester.set.increment(driver, "//*[@data-control-id = '64889']", "100");
        tester.check.screenshotBasedTest(driver, PATH, "opacity_2");
    }

    @Description("Проверка всплывающей подсказки")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Подсказка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void help(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '65975']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '65975']");
        tester.action.wait(driver, "//*[@data-control-id = '65002']");
        recorder.addShot(driver);
        local.tooltipCheck(driver, "//*[@data-control-id = '64903']", "Подсказка");
        tester.set.textInput(driver, "//*[@data-control-id = '65002']", "Все идет по плану");
        tester.action.wait(300);
        recorder.addShot(driver);
        local.tooltipCheck(driver, "//*[@data-control-id = '64903']", "Все идет по плану");
    }

    @Description("Проверка мигания окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Мигание")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void flash(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '66008']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66008']");
        tester.action.wait(driver, "//*[@data-control-id = '65115']");
        recorder.addShot(driver);
        tester.check.elementProperty("Внешний вид окна", driver, "//*[@data-control-id = '65018']", "className", "");
        tester.event.click(driver, "//*[@data-control-id = '65115']");
        recorder.addShot(driver);
        tester.check.elementProperty("Внешний вид окна", driver, "//*[@data-control-id = '65018']", "className", "flash");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Проверка тени окна)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Размер тени/цвет тени")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shadow(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '66041']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66041']");
        tester.action.wait(driver, "//*[@data-control-id = '65833']");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "shadow_1");

        tester.set.colorButton(driver, "//*[@data-control-id = '65833']");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "shadow_2");

        tester.set.increment(driver, "//*[@data-control-id = '65819']", "10");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "shadow_3");
    }

    @Description("Проверка видимости окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Видимость")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void visibility(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '66107']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66107']");
        tester.action.wait(driver, "//*[@data-control-id = '65866']");
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Внешний вид окна", driver, "//*[@data-control-id = '65334']", "visibility", "visible");
        tester.event.click(driver, "//*[@data-control-id = '65866']");
        recorder.addShot(driver);
        tester.check.elementCSSProperty("Внешний вид окна", driver, "//*[@data-control-id = '65334']", "visibility", "hidden");
    }

    @Description("Проверка активности окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Активность")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void activity(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '66140']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66140']");
        tester.action.wait(driver, "//*[@data-control-id = '65880']");
        recorder.addShot(driver);
        tester.check.elementProperty("Внешний вид окна", driver, "//*[@data-control-id = '65431']", "disabled", null);
        tester.event.click(driver, "//*[@data-control-id = '65880']");
        recorder.addShot(driver);
        tester.check.elementProperty("Внешний вид окна", driver, "//*[@data-control-id = '65431']", "disabled", "true");
    }

    @Description("Проверка изображения и замостки окна")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Окна и их свойства")
    @Feature(value = "Внешний вид окна")
    @Story(value = "Изображение фона/замостка фона")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void backgroundImage(){
        tester.action.wait(driver, "//*[@data-control-id = '66173']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66173']");
        tester.action.wait(driver, "//*[@data-control-id = '66074']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id = '66074']");
        tester.action.wait(driver, "//*[@data-control-id = '65851']");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "backgroundImage_1");

        tester.set.comboBox(driver, "//*[@data-control-id = '65851']", "Нет");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "backgroundImage_2");

        tester.set.comboBox(driver, "//*[@data-control-id = '65851']", "Мозаика");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "backgroundImage_3");

        tester.set.comboBox(driver, "//*[@data-control-id = '65851']", "Заполнение");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "backgroundImage_4");

        tester.set.comboBox(driver, "//*[@data-control-id = '65851']", "Центр");
        recorder.addShot(driver);
        tester.check.screenshotBasedTest(driver, PATH, "backgroundImage_5");
    }
}
