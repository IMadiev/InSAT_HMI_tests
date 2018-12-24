package autotestDemoProjects.Common_consumption;

import io.qameta.allure.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebUITools;

public class CommonConsuptionTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/DemoProjects/CommonConsumption";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/7/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие стартовой страницы проекта")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/7/index.html");
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
    }

    @Description("Стандартный screenshot-based тест стартовой страницы")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Демо-проекты")
    @Feature(value = "Общее потребление")
    @Story(value = "Стартовая страница")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void start(){
        tester.action.wait(driver, "//*[@data-control-id = '31935']");
        tester.check.screenshotBasedTest(driver, PATH, "startPage");
    }

    @Description("Стандартный screenshot-based окна [Общая статистика]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Демо-проекты")
    @Feature(value = "Общее потребление")
    @Story(value = "Общая статистика")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void commonStatistics(){
        tester.action.wait(driver, "//*[@data-control-id = '51688']");
        tester.event.click(driver, "//*[@data-control-id = '51688']");
        tester.action.wait(driver, "//*[@data-control-id = '53850']");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "top", "0px");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "left", "0px");
        tester.check.screenshotBasedTest(driver, PATH, "commonStatistics", "//*[contains(@class, 'ui-dialog')]");
    }

    @Description("Стандартный screenshot-based окна [Электричество]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Демо-проекты")
    @Feature(value = "Общее потребление")
    @Story(value = "Общая статистика")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void electricity(){
        tester.action.wait(driver, "//*[@data-control-id = '32042']");
        tester.event.click(driver, "//*[@data-control-id = '32042']");
        tester.action.wait(driver, "//*[@data-control-id = '44256']");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "top", "0px");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "left", "0px");
        tester.action.removeElement(driver, "//*[@data-control-id = '47032']");
        tester.check.screenshotBasedTest(driver, PATH, "electricity", "//*[contains(@class, 'ui-dialog')]");
    }

    @Description("Стандартный screenshot-based окна [Отопление]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Демо-проекты")
    @Feature(value = "Общее потребление")
    @Story(value = "Общая статистика")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void heat(){
        tester.action.wait(driver, "//*[@data-control-id = '34227']");
        tester.event.click(driver, "//*[@data-control-id = '34227']");
        tester.action.wait(driver, "//*[@data-control-id = '48437']");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "top", "0px");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "left", "0px");
        tester.action.removeElement(driver, "//*[@data-control-id = '51322']");
        tester.check.screenshotBasedTest(driver, PATH, "heat", "//*[contains(@class, 'ui-dialog')]");
    }

    @Description("Стандартный screenshot-based окна [Водоснабжение]")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Демо-проекты")
    @Feature(value = "Общее потребление")
    @Story(value = "Общая статистика")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void water(){
        tester.action.wait(driver, "//*[@data-control-id = '34121']");
        tester.event.click(driver, "//*[@data-control-id = '34121']");
        tester.action.wait(driver, "//*[@data-control-id = '35921']");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "top", "0px");
        tester.set.elementStyleProperty(driver, "//*[contains(@class, 'ui-dialog')]", "left", "0px");
        tester.action.removeElement(driver, "//*[@data-control-id = '37860']");
        tester.check.screenshotBasedTest(driver, PATH, "water", "//*[contains(@class, 'ui-dialog')]");
    }
}
