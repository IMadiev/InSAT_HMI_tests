package autotestSVG.IndustrialIcons.Energetics;

import autotestSVG.LocalSteps;
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

public class EnergeticsDirectConversationTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Energetics/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Энергетика (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '269105']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '269105']")));
        driver.findElement(By.xpath("//*[@data-control-id = '269105']")).click();
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189892']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189904']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189916']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189928']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189940']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189952']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189964']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189976']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189988']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190002']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190014']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190026']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190038']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190050']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190062']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190074']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190086']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190098']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190110']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190122']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190134']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190146']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190158']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190170']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190182']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190194']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190206']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190218']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190230']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190242']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190254']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190266']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190278']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190290']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190302']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190314']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190326']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190338']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190350']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190362']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '190374']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Аккумулятор, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Аккумулятор")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void akkumulator(){
        tester.check.screenshotBasedTest(driver, PATH, "akkumulator", "//*[@data-control-id = '189892']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Атомная энергетика, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Атомная энергетика")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void atomnayaEnergetika(){
        tester.check.screenshotBasedTest(driver, PATH, "atomnayaEnergetika", "//*[@data-control-id = '189904']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Баржа, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Баржа")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void barzha(){
        tester.check.screenshotBasedTest(driver, PATH, "barzha", "//*[@data-control-id = '189916']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Безопасная энергия, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Безопасная энергия")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void bezopasnayaEnergiya(){
        tester.check.screenshotBasedTest(driver, PATH, "bezopasnayaEnergiya", "//*[@data-control-id = '189928']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Вагон, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Вагон")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vagon(){
        tester.check.screenshotBasedTest(driver, PATH, "vagon", "//*[@data-control-id = '189940']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Ветряная мельница, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Ветряная мельница")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vetryanayaMelnitsa(){
        tester.check.screenshotBasedTest(driver, PATH, "vetryanayaMelnitsa", "//*[@data-control-id = '189952']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Высоковольтка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Высоковольтка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void visokovoltka(){
        tester.check.screenshotBasedTest(driver, PATH, "visokovoltka", "//*[@data-control-id = '189964']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Высоковольтные столбы, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Высоковольтные столбы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void visokovoltniyeStolbi(){
        tester.check.screenshotBasedTest(driver, PATH, "visokovoltniyeStolbi", "//*[@data-control-id = '189976']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Газовая вышка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Газовая вышка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gazovayaVishka(){
        tester.check.screenshotBasedTest(driver, PATH, "gazovayaVishka", "//*[@data-control-id = '189988']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Гидроэлектростанция, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Гидроэлектростанция")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void gidroelectrostantsiya(){
        tester.check.screenshotBasedTest(driver, PATH, "gidroelectrostantsiya", "//*[@data-control-id = '190002']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Доставка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Доставка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void dostavka(){
        tester.check.screenshotBasedTest(driver, PATH, "dostavka", "//*[@data-control-id = '190014']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Завод")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod", "//*[@data-control-id = '190026']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод 2, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Завод 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod2(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod2", "//*[@data-control-id = '190038']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Завод 3, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Завод 3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavod3(){
        tester.check.screenshotBasedTest(driver, PATH, "zavod3", "//*[@data-control-id = '190050']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Заводские трубы, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Заводские трубы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zavodskiyeTrubi(){
        tester.check.screenshotBasedTest(driver, PATH, "zavodskiyeTrubi", "//*[@data-control-id = '190062']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Заправочная колонка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Заправочная колонка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zapravochnayaKolonka(){
        tester.check.screenshotBasedTest(driver, PATH, "zapravochnayaKolonka", "//*[@data-control-id = '190074']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Заряд батареи, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Заряд батареи")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zaryadBatarei(){
        tester.check.screenshotBasedTest(driver, PATH, "zaryadBatarei", "//*[@data-control-id = '190086']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Зарядка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Зарядка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zaryadka(){
        tester.check.screenshotBasedTest(driver, PATH, "zaryadka", "//*[@data-control-id = '190098']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Капля, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Капля")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kaplya(){
        tester.check.screenshotBasedTest(driver, PATH, "kaplya", "//*[@data-control-id = '190110']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Коммуникации городские, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Коммуникации городские")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kommunikatsiiGorodskiye(){
        tester.check.screenshotBasedTest(driver, PATH, "kommunikatsiiGorodskiye", "//*[@data-control-id = '190122']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Коммуникации, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Коммуникации")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kommunikatsii(){
        tester.check.screenshotBasedTest(driver, PATH, "kommunikatsii", "//*[@data-control-id = '190134']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Костер, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Костер")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void koster(){
        tester.check.screenshotBasedTest(driver, PATH, "koster", "//*[@data-control-id = '190146']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кукуруза, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Кукуруза")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kukuruza(){
        tester.check.screenshotBasedTest(driver, PATH, "kukuruza", "//*[@data-control-id = '190158']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочки, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Лампочки")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochki(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochki", "//*[@data-control-id = '190170']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Атом, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Атом")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void atom(){
        tester.check.screenshotBasedTest(driver, PATH, "atom", "//*[@data-control-id = '190182']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Нефтяная вышка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Нефтяная вышка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void neftanayaVishka(){
        tester.check.screenshotBasedTest(driver, PATH, "neftanayaVishka", "//*[@data-control-id = '190194']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Нефтяной насос, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Нефтяной насос")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void neftanoyNasos(){
        tester.check.screenshotBasedTest(driver, PATH, "neftanoyNasos", "//*[@data-control-id = '190206']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Радиация, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Радиация")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void radiatsiya(){
        tester.check.screenshotBasedTest(driver, PATH, "radiatsiya", "//*[@data-control-id = '190218']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Розетка, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Розетка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rozetka(){
        tester.check.screenshotBasedTest(driver, PATH, "rozetka", "//*[@data-control-id = '190230']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Солнечная батарея, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Солнечная батарея")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solnechnayaBatareya(){
        tester.check.screenshotBasedTest(driver, PATH, "solnechnayaBatareya", "//*[@data-control-id = '190242']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Солнечная батарея 2, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Солнечная батарея 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solnechnayaBatareya2(){
        tester.check.screenshotBasedTest(driver, PATH, "solnechnayaBatareya2", "//*[@data-control-id = '190254']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Солнце, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Солнце")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void solntse(){
        tester.check.screenshotBasedTest(driver, PATH, "solntse", "//*[@data-control-id = '190266']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Углекислый газ, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Углекислый газ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void uglekisliyGaz(){
        tester.check.screenshotBasedTest(driver, PATH, "uglekisliyGaz", "//*[@data-control-id = '190278']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Удар током, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Удар током")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void udarTokom(){
        tester.check.screenshotBasedTest(driver, PATH, "udarTokom", "//*[@data-control-id = '190290']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Хранилище, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Хранилище")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hranilische(){
        tester.check.screenshotBasedTest(driver, PATH, "hranilische", "//*[@data-control-id = '190302']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Хранилище 2, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Хранилище 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void hranilische2(){
        tester.check.screenshotBasedTest(driver, PATH, "hranilische2", "//*[@data-control-id = '190314']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Цистерна, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Цистерна")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void cisterna(){
        tester.check.screenshotBasedTest(driver, PATH, "cisterna", "//*[@data-control-id = '190326']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Цистерна и вагон, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Цистерна и вагон")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void cisternaIVagon(){
        tester.check.screenshotBasedTest(driver, PATH, "cisternaIVagon", "//*[@data-control-id = '190338']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Шкала, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Шкала")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shkala(){
        tester.check.screenshotBasedTest(driver, PATH, "shkala", "//*[@data-control-id = '190350']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Штурвал, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Штурвал")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void shturval(){
        tester.check.screenshotBasedTest(driver, PATH, "shturval", "//*[@data-control-id = '190362']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Экология, прямая конвертация, проверка корректности начального отображения)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Энергетика")
    @Story(value = "Экология")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ecologiya(){
        tester.check.screenshotBasedTest(driver, PATH, "ecologiya", "//*[@data-control-id = '190374']");
    }
}
