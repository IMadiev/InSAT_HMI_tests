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

public class ActionsSetParameterTest {
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

    @Description("Проверка действия [Установить параметр] вызываемого событием [Клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void click(){
        String event = "[Клик]";
        String buttonXpath = "//*[@data-control-id='284272']";
        String addXpath = "//*[@data-control-id='319248']";
        String subXpath = "//*[@data-control-id='320678']";
        String mulXpath = "//*[@data-control-id='322112']";
        String divXpath = "//*[@data-control-id='323552']";
        String moveXpath = "//*[@data-control-id='325002']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Двойной клик]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void doubleClick(){
        String event = "[Двойной клик]";
        String buttonXpath = "//*[@data-control-id='305423']";
        String addXpath = "//*[@data-control-id='319358']";
        String subXpath = "//*[@data-control-id='320788']";
        String mulXpath = "//*[@data-control-id='322222']";
        String divXpath = "//*[@data-control-id='323662']";
        String moveXpath = "//*[@data-control-id='325112']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.doubleClick(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Нажатие мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseDown(){
        String event = "[Нажатие мыши]";
        String buttonXpath = "//*[@data-control-id='303661']";
        String addXpath = "//*[@data-control-id='319468']";
        String subXpath = "//*[@data-control-id='320898']";
        String mulXpath = "//*[@data-control-id='322332']";
        String divXpath = "//*[@data-control-id='323772']";
        String moveXpath = "//*[@data-control-id='325222']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseDown(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Отпускание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseUp(){
        String event = "[Отпускание мыши]";
        String buttonXpath = "//*[@data-control-id='301901']";
        String addXpath = "//*[@data-control-id='319578']";
        String subXpath = "//*[@data-control-id='321008']";
        String mulXpath = "//*[@data-control-id='322442']";
        String divXpath = "//*[@data-control-id='323882']";
        String moveXpath = "//*[@data-control-id='325332']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseUp(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Получение фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOn(){
        String event = "[Получение фокуса]";
        String buttonXpath = "//*[@data-control-id='294846']";
        String addXpath = "//*[@data-control-id='319688']";
        String subXpath = "//*[@data-control-id='321118']";
        String mulXpath = "//*[@data-control-id='322552']";
        String divXpath = "//*[@data-control-id='324002']";
        String moveXpath = "//*[@data-control-id='325442']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Потеря фокуса]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void focusOff(){
        String event = "[Потеря фокуса]";
        String buttonXpath = "//*[@data-control-id='293083']";
        String addXpath = "//*[@data-control-id='319798']";
        String subXpath = "//*[@data-control-id='321228']";
        String mulXpath = "//*[@data-control-id='322662']";
        String divXpath = "//*[@data-control-id='324112']";
        String moveXpath = "//*[@data-control-id='325552']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='325552']");
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Ввод символа]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void inputSymbol(){
        String event = "[Ввод символа]";
        String buttonXpath = "//*[@data-control-id='291320']";
        String addXpath = "//*[@data-control-id='319908']";
        String subXpath = "//*[@data-control-id='321338']";
        String mulXpath = "//*[@data-control-id='322772']";
        String divXpath = "//*[@data-control-id='324222']";
        String moveXpath = "//*[@data-control-id='325662']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.inputSymbol(driver, buttonXpath);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Нажатие клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyDown(){
        String event = "[Нажатие клавиши]";
        String buttonXpath = "//*[@data-control-id='286035']";
        String addXpath = "//*[@data-control-id='320018']";
        String subXpath = "//*[@data-control-id='321448']";
        String mulXpath = "//*[@data-control-id='322882']";
        String divXpath = "//*[@data-control-id='324332']";
        String moveXpath = "//*[@data-control-id='325772']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Отпускание клавиши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void keyUp(){
        String event = "[Отпускание клавиши]";
        String buttonXpath = "//*[@data-control-id='289557']";
        String addXpath = "//*[@data-control-id='320128']";
        String subXpath = "//*[@data-control-id='321558']";
        String mulXpath = "//*[@data-control-id='323002']";
        String divXpath = "//*[@data-control-id='324442']";
        String moveXpath = "//*[@data-control-id='325882']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.keyDown(driver, buttonXpath, Keys.CONTROL);
        recorder.addShot(driver);
        tester.event.keyUp(driver, buttonXpath, Keys.CONTROL);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Захват мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouse(){
        String event = "[Захват мыши]";
        String buttonXpath = "//*[@data-control-id='300141']";
        String addXpath = "//*[@data-control-id='320348']";
        String subXpath = "//*[@data-control-id='321778']";
        String mulXpath = "//*[@data-control-id='323222']";
        String divXpath = "//*[@data-control-id='324662']";
        String moveXpath = "//*[@data-control-id='326112']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath, 5, 5);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Покидание мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseLeave(){
        String event = "[Покидание мыши]";
        String buttonXpath = "//*[@data-control-id='298378']";
        String addXpath = "//*[@data-control-id='320458']";
        String subXpath = "//*[@data-control-id='321888']";
        String mulXpath = "//*[@data-control-id='323332']";
        String divXpath = "//*[@data-control-id='324772']";
        String moveXpath = "//*[@data-control-id='326222']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath, 5, 5);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, "//*[@data-control-id='326222']", 5, 5);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }

    @Description("Проверка действия [Установить параметр] вызываемого событием [Перемещение мыши]")
    @Links(value = {@Link(name = "TestProject", url = link)})
    @Epic(value = "События и действия")
    @Feature(value = "Действия")
    @Story(value = "Установить параметр")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void mouseMotion(){
        String event = "[Перемещение мыши]";
        String buttonXpath = "//*[@data-control-id='296609']";
        String addXpath = "//*[@data-control-id='320568']";
        String subXpath = "//*[@data-control-id='322002']";
        String mulXpath = "//*[@data-control-id='323442']";
        String divXpath = "//*[@data-control-id='324882']";
        String moveXpath = "//*[@data-control-id='326332']";

        tester.action.wait(driver, buttonXpath);
        recorder.addShot(driver);
        tester.event.mouseOver(driver, buttonXpath, 5, 5);
        tester.action.wait(500);
        recorder.addShot(driver);
        local.checkSettedParameters(driver, event, addXpath, subXpath, mulXpath, divXpath, moveXpath);
    }
}
