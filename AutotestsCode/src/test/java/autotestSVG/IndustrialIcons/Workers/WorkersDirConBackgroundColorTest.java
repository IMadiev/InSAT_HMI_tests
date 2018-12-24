package autotestSVG.IndustrialIcons.Workers;

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

public class WorkersDirConBackgroundColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Workers/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Рабочие (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '278577']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '278577']")));
        driver.findElement(By.xpath("//*[@data-control-id = '278577']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '185936']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '185936']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '185936']");
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186947']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186755']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186959']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186779']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186911']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186899']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186815']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186827']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186839']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186851']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186863']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186875']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186887']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186767']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186803']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186791']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186743']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186935']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '186923']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Строитель, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Строитель")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void stroitel(){
        tester.check.screenshotBasedTest(driver, PATH, "stroitel_background", "//*[@data-control-id = '186947']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Инструменты, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Инструменты")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void instrumenti(){
        tester.check.screenshotBasedTest(driver, PATH, "instrumenti_background", "//*[@data-control-id = '186755']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Удар по голове, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Удар по голове")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void udarPoGolove(){
        tester.check.screenshotBasedTest(driver, PATH, "udarPoGolove_background", "//*[@data-control-id = '186959']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Кирпичная стена, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Кирпичная стена")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kirpichnayaStena(){
        tester.check.screenshotBasedTest(driver, PATH, "kirpichnayaStena_background", "//*[@data-control-id = '186779']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 10, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 10")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy10(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy10_background", "//*[@data-control-id = '186911']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 9, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 9")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy9(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy9_background", "//*[@data-control-id = '186899']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 2, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy2(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy2_background", "//*[@data-control-id = '186815']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 3, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy3(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy3_background", "//*[@data-control-id = '186827']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 4, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 4")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy4(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy4_background", "//*[@data-control-id = '186839']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 5, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 5")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy5(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy5_background", "//*[@data-control-id = '186851']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 6, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 6")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy6(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy6_background", "//*[@data-control-id = '186863']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 7, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 7")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy7(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy7_background", "//*[@data-control-id = '186875']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий 8, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий 8")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy8(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy8_background", "//*[@data-control-id = '186887']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Каска, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Каска")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kaska(){
        tester.check.screenshotBasedTest(driver, PATH, "kaska_background", "//*[@data-control-id = '186767']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Рабочий")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy_background", "//*[@data-control-id = '186803']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Предупреждение, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Предупреждение")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void preduprezhdenie(){
        tester.check.screenshotBasedTest(driver, PATH, "preduprezhdenie_background", "//*[@data-control-id = '186791']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Дорожный конус, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Дорожный конус")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void dorozhniyKonus(){
        tester.check.screenshotBasedTest(driver, PATH, "dorozhniyKonus_background", "//*[@data-control-id = '186743']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Сигнальщик, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Сигнальщик")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void signalschik(){
        tester.check.screenshotBasedTest(driver, PATH, "signalschik_background", "//*[@data-control-id = '186935']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Ремонт, прямая конвертация, проверка корректности цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Рабочие")
    @Story(value = "Ремонт")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void remont(){
        tester.check.screenshotBasedTest(driver, PATH, "remont_background", "//*[@data-control-id = '186923']");
    }
}
