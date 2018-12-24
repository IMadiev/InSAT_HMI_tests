package autotestSVG.IndustrialIcons.TanksTest;

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

public class TanksDirConIconColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Tanks/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Емкости (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '284046']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '284046']")));
        driver.findElement(By.xpath("//*[@data-control-id = '284046']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '184819']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '184819']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '184819']");
        //Ожидание прогрузки SVG
        tester.action.waitSVG(driver, "//*[@data-control-id = '185137']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185149']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185161']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185173']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185185']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185197']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185209']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185221']");
        tester.action.waitSVG(driver, "//*[@data-control-id = '185233']");
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бутыли, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Бутыли")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void butili(){
        tester.check.screenshotBasedTest(driver, PATH, "butili_icon", "//*[@data-control-id = '185137']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Канистра, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Канистра")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kanistra(){
        tester.check.screenshotBasedTest(driver, PATH, "kanistra_icon", "//*[@data-control-id = '185149']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Масленка, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Масленка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void maslenka(){
        tester.check.screenshotBasedTest(driver, PATH, "maslenka_icon", "//*[@data-control-id = '185161']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Масленка2, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Масленка2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void maslenka2(){
        tester.check.screenshotBasedTest(driver, PATH, "maslenka2_icon", "//*[@data-control-id = '185173']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Разбрызгиватель, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Разбрызгиватель")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void razbrizgivatel(){
        tester.check.screenshotBasedTest(driver, PATH, "razbrizgivatel_icon", "//*[@data-control-id = '185185']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Распылитель, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Распылитель")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void raspilitel(){
        tester.check.screenshotBasedTest(driver, PATH, "raspilitel_icon", "//*[@data-control-id = '185197']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Салфетка для стекол, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Салфетка для стекол")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void salfetka(){
        tester.check.screenshotBasedTest(driver, PATH, "salfetka_icon", "//*[@data-control-id = '185209']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Тара для машинного масла, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Тара для машинного масла")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void tara(){
        tester.check.screenshotBasedTest(driver, PATH, "tara_icon", "//*[@data-control-id = '185221']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Флакон, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Емкости")
    @Story(value = "Флакон")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void flacon(){
        tester.check.screenshotBasedTest(driver, PATH, "flacon_icon", "//*[@data-control-id = '185233']");
    }
}
