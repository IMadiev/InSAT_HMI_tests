package autotestSVG.IndustrialIcons.Electricity;

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

public class ElectricityDirConIconColorTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    private static final String PATH = System.getProperty("user.dir")+"/Screenshots/SVG/IndustrialIcons/Electricity/DirectConversation";

    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/28/index.html";     public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/973b0e21b0e350c3885280154107d8c2/0_b_9q2l_8od2k/";

    @Step("Открытие страницы [Электричество (прямая)]")
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '269270']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '269270']")));
        driver.findElement(By.xpath("//*[@data-control-id = '269270']")).click();
        InsatWebUITools tester = new InsatWebUITools();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id = '188744']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-control-id = '188744']")));
        tester.set.colorButton(driver, "//*[@data-control-id = '188744']");
        //Ожидание прогрузки SVG
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189138']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189150']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189162']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189174']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189186']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189198']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189210']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189222']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189234']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189246']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189260']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189272']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189284']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189296']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189308']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '189320']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Слой_1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Слой_1")));
        driver.switchTo().defaultContent();
    }


    @Step("Закрытие браузера")
    @AfterClass
    public static void oneTimeTearDown() {
        driver.quit();
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Вольт, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Вольт")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void volt(){
        tester.check.screenshotBasedTest(driver, PATH, "volt_icon", "//*[@data-control-id = '189138']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Дом в сети, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Дом в сети")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void domVSeti(){
        tester.check.screenshotBasedTest(driver, PATH, "domVSeti_icon", "//*[@data-control-id = '189150']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Дом с вышкой, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Дом с вышкой")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void domSVishkoy(){
        tester.check.screenshotBasedTest(driver, PATH, "domSVishkoy_icon", "//*[@data-control-id = '189162']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Измерительный прибор, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Измерительный прибор")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void izmeritelniyPribor(){
        tester.check.screenshotBasedTest(driver, PATH, "izmeritelniyPribor_icon", "//*[@data-control-id = '189174']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Измерительный прибор 2, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Измерительный прибор 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void izmeritelniyPribor2(){
        tester.check.screenshotBasedTest(driver, PATH, "izmeritelniyPribor2_icon", "//*[@data-control-id = '189186']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Инструменты, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Инструменты")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void instrumenti(){
        tester.check.screenshotBasedTest(driver, PATH, "instrumenti_icon", "//*[@data-control-id = '189198']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Контакты, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Контакты")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void kontakti(){
        tester.check.screenshotBasedTest(driver, PATH, "kontakti_icon", "//*[@data-control-id = '189210']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочка, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Лампочка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochka(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochka_icon", "//*[@data-control-id = '189222']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Лампочки, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Лампочки")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void lampochki(){
        tester.check.screenshotBasedTest(driver, PATH, "lampochki_icon", "//*[@data-control-id = '189234']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Опасность поражения током, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Опасность поражения током")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void opasnostPorazheniyaTokom(){
        tester.check.screenshotBasedTest(driver, PATH, "opasnostPorazheniyaTokom_icon", "//*[@data-control-id = '189246']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Поражение током, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Поражение током")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void porazheniyeTokom(){
        tester.check.screenshotBasedTest(driver, PATH, "porazheniyeTokom_icon", "//*[@data-control-id = '189260']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Розетка, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Розетка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void rozetka(){
        tester.check.screenshotBasedTest(driver, PATH, "rozetka_icon", "//*[@data-control-id = '189272']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Счетчик, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Счетчик")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void schetchik(){
        tester.check.screenshotBasedTest(driver, PATH, "schetchik_icon", "//*[@data-control-id = '189284']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Счетчик 2, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Счетчик 2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void schetchik2(){
        tester.check.screenshotBasedTest(driver, PATH, "schetchik2_icon", "//*[@data-control-id = '189296']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Электрик, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Электрик")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void electrik(){
        tester.check.screenshotBasedTest(driver, PATH, "electrik_icon", "//*[@data-control-id = '189308']");
    }

    @Description("Сравнение скриншота актуальной страницы с эталоном (Электрическая вилка, прямая конвертация, проверка корректности цвета иконки после динамизации)")
    @Links(value = {@Link(name = "TestProject", url = TPROJECT_LINK), @Link(name = "Rizzoma", url = RIZZOMA_LINK)})
    @Epic(value = "Библиотека [Industrial Icons]")
    @Feature(value = "Электричество")
    @Story(value = "Электрическая вилка")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void electricheskayaVilka(){
        tester.check.screenshotBasedTest(driver, PATH, "electricheskayaVilka_icon", "//*[@data-control-id = '189320']");
    }
}
