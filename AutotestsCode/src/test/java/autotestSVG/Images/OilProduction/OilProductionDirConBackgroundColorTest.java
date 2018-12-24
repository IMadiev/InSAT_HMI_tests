package autotestSVG.Images.OilProduction;

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

public class OilProductionDirConBackgroundColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/Images/Oil/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";
    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Нефтедобыча (прямая)]")
    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/28/index.html");
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '467909']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '467909']")));
        driver.findElement(By.xpath("//*[@data-control-id = '467909']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '248206']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '248206']")));
        driver.findElement(By.xpath("//*[@data-control-id = '248206']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '245634']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '245634']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '245634']");
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245377']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245391']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245405']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245419']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245433']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245447']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245461']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245475']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245489']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245504']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245518']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245532']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245546']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245560']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245574']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '245588']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
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

    @Description("Сравнение скриншота актуальной страницы с эталоном (Баржа, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Баржа")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void barzha(){
        tester.check.screenshotBasedTest(driver, PATH, "barzha_background", "//*[@data-control-id = '245377']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бензовоз, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Бензовоз")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void benzovoz(){
        tester.check.screenshotBasedTest(driver, PATH, "benzovoz_background", "//*[@data-control-id = '245391']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Бочка, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Бочка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void bochka(){
        tester.check.screenshotBasedTest(driver, PATH, "bochka_background", "//*[@data-control-id = '245405']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Вышка, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Вышка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vishka(){
        tester.check.screenshotBasedTest(driver, PATH, "vishka_background", "//*[@data-control-id = '245419']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Вышки, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Вышки")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void vishki(){
        tester.check.screenshotBasedTest(driver, PATH, "vishki_background", "//*[@data-control-id = '245433']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Задвижка, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Задвижка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void zadvizhka(){
        tester.check.screenshotBasedTest(driver, PATH, "zadvizhka_background", "//*[@data-control-id = '245447']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Источник, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Источник")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void istochnik(){
        tester.check.screenshotBasedTest(driver, PATH, "istochnik_background", "//*[@data-control-id = '245461']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Канистра, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Канистра")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kanistra(){
        tester.check.screenshotBasedTest(driver, PATH, "kanistra_background", "//*[@data-control-id = '245475']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Капля, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Капля")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kaplya(){
        tester.check.screenshotBasedTest(driver, PATH, "kaplya_background", "//*[@data-control-id = '245489']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Колонка, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Колонка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kolonka(){
        tester.check.screenshotBasedTest(driver, PATH, "kolonka_background", "//*[@data-control-id = '245504']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Насос, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Насос")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void nasos(){
        tester.check.screenshotBasedTest(driver, PATH, "nasos_background", "//*[@data-control-id = '245518']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Пистолет, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Пистолет")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void pistolet(){
        tester.check.screenshotBasedTest(driver, PATH, "pistolet_background", "//*[@data-control-id = '245532']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Рабочий, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Рабочий")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rabochiy(){
        tester.check.screenshotBasedTest(driver, PATH, "rabochiy_background", "//*[@data-control-id = '245546']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Резервуар, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Резервуар")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void reservoir(){
        tester.check.screenshotBasedTest(driver, PATH, "reservoir_background", "//*[@data-control-id = '245560']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Центр нефтяной, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Центр нефтяной")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void centrNeftyanoy(){
        tester.check.screenshotBasedTest(driver, PATH, "centrNeftyanoy_background", "//*[@data-control-id = '245574']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Цистерна, прямая конвертация, проверка корректности отображения цвета фона после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Images]")
    @Feature(value = "Нефтедобыча")
    @Story(value = "Цистерна")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void cisterna(){
        tester.check.screenshotBasedTest(driver, PATH, "cisterna_background", "//*[@data-control-id = '245588']");
    }
}
