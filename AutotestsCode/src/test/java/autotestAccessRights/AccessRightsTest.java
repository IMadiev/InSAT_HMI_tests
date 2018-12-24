package autotestAccessRights;

import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class AccessRightsTest {
    private static WebDriver driver;
    InsatWebUITools tester = new InsatWebUITools();
    InsatWebRecorder recorder = new InsatWebRecorder();
    LocalSteps local = new LocalSteps();

    public static final String RIZZOMA_LINK = "https://rizzoma.com/topic/a5401aa56126296ade37c5461e469e7b/0_b_8l7d_75q1i/";
    public static final String TPROJECT_LINK = "http://10.0.1.96:8043/3/index.html";

    @BeforeClass
    public static void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Step("Открытие страницы аутентификации")
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/3/index.html");
        recorder.start(driver);
    }

    @Step("Закрытие браузера")
    @After
    public void tearDown() {
        driver.quit();
        recorder.stop();
    }

    @Description("Пользователь (без явных настроек) без группы")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с правами по умолчанию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _0(){
        tester.action.loginAs(driver, "0", "");
        local.checkInaccessibility(driver, recorder);
    }

    @Description("Пользователь (явный запрет) без группы")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка явных настроек пользователя без группы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _1(){
        tester.action.loginAs(driver, "1", "");
        local.checkInaccessibility(driver, recorder);
    }

    @Description("Пользователь (явный запрет окна и разрешение управления) без группы")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка явных настроек пользователя без группы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _2(){
        tester.action.loginAs(driver, "2", "");
        local.textIn_To_TextOut(driver, false, recorder);
        local.increment_to_Gauge(driver, false, recorder);
        local.toggleButton_to_ColorButton(driver, false, recorder);
    }

    @Description("Пользователь (разрешение управления и открытия окон) без группы")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка явных настроек пользователя без группы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _3(){
        tester.action.loginAs(driver, "3", "");
        local.textIn_To_TextOut(driver, false, recorder);
        local.increment_to_Gauge(driver, false, recorder);
        local.toggleButton_to_ColorButton(driver, false, recorder);
        local.openPopupWindow(driver, false, false, recorder);
        local.openWindow(driver, false, false, recorder);
    }

    @Description("Пользователь (разрешение с подтверждением) без группы")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка явных настроек пользователя без группы")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _4(){
        tester.action.loginAs(driver, "4", "");
        local.textIn_To_TextOut(driver, true, recorder);
        local.increment_to_Gauge(driver, true, recorder);
        local.toggleButton_to_ColorButton(driver, true, recorder);
        local.openPopupWindow(driver, true, true, recorder);
        local.openWindow(driver, true, true, recorder);
    }

    @Description("Пользователь (без явных настроек) в группе [Запрещено]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя только с групповыми настройками")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _5(){
        recorder.addShot(driver);
        tester.action.loginAs(driver, "5", "");
        recorder.addShot(driver);
        local.checkInaccessibility(driver, recorder);
    }

    @Description("Пользователь (без явных настроек) в группе [Разрешено]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя только с групповыми настройками")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _6(){
        tester.action.loginAs(driver, "6", "");
        local.textIn_To_TextOut(driver, false, recorder);
        local.increment_to_Gauge(driver, false, recorder);
        local.toggleButton_to_ColorButton(driver, false, recorder);
        local.openPopupWindow(driver, false, false, recorder);
        local.openWindow(driver, false, false, recorder);
    }

    @Description("Пользователь (без явных настроек) в группе [Подтверждение]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя только с групповыми настройками")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _7(){
        tester.action.loginAs(driver, "7", "");
        local.textIn_To_TextOut(driver, true, recorder);
        local.increment_to_Gauge(driver, true, recorder);
        local.toggleButton_to_ColorButton(driver, true, recorder);
        local.openPopupWindow(driver, true, true, recorder);
        local.openWindow(driver, true, true, recorder);
    }

    @Description("Пользователь (без явных настроек) в группе [Запрещено] и [Разрешено]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _8(){
        tester.action.loginAs(driver, "8", "");
        local.checkInaccessibility(driver, recorder);
    }

    @Description("Пользователь (без явных настроек) в группе [Подтверждение] и [Разрешено]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _9(){
        tester.action.loginAs(driver, "9", "");
        local.textIn_To_TextOut(driver, true, recorder);
        local.increment_to_Gauge(driver, true, recorder);
        local.toggleButton_to_ColorButton(driver, true, recorder);
        local.openPopupWindow(driver, true, true, recorder);
        local.openWindow(driver, true, true, recorder);
    }

    @Description("Пользователь (явное разрешение) в группе [Запрещено]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп и пользователя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _10(){
        tester.action.loginAs(driver, "10", "");
        local.textIn_To_TextOut(driver, false, recorder);
        local.increment_to_Gauge(driver, false, recorder);
        local.toggleButton_to_ColorButton(driver, false, recorder);
        local.openPopupWindow(driver, false, false, recorder);
        local.openWindow(driver, false, false, recorder);
    }

    @Description("Пользователь (явный запрет) в группе [Разрешено]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп и пользователя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _11(){
        tester.action.loginAs(driver, "11", "");
        local.checkInaccessibility(driver, recorder);
    }

    @Description("Пользователь (явное разрешение) в группе [Подтверждение]")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп и пользователя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _12(){
        tester.action.loginAs(driver, "12", "");
        local.textIn_To_TextOut(driver, false, recorder);
        local.increment_to_Gauge(driver, false, recorder);
        local.toggleButton_to_ColorButton(driver, false, recorder);
        local.openPopupWindow(driver, false, false, recorder);
        local.openWindow(driver, false, false, recorder);
    }

    @Description("Пользователь (без явных настроек) в группе без заданных настроек")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с правами по умолчанию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _13(){
        tester.action.loginAs(driver, "13", "");
        local.checkInaccessibility(driver, recorder);
    }

    @Description("Пользователь (явное разрешение) в группе без заданных настроек")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп и пользователя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _14(){
        tester.action.loginAs(driver, "14", "");
        local.textIn_To_TextOut(driver, false, recorder);
        local.increment_to_Gauge(driver, false, recorder);
        local.toggleButton_to_ColorButton(driver, false, recorder);
        local.openPopupWindow(driver, false, false, recorder);
        local.openWindow(driver, false, false, recorder);
    }

    @Description("Пользователь (явный запрет) в группе без заданных настроек")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп и пользователя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _15(){
        tester.action.loginAs(driver, "15", "");
        local.checkInaccessibility(driver, recorder);
    }

    @Description("Пользователь (явное разрешение с подтверждением) в группе без заданных настроек")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с конфликтом настроек групп и пользователя")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _16(){
        tester.action.loginAs(driver, "16", "");
        local.textIn_To_TextOut(driver, true, recorder);
        local.increment_to_Gauge(driver, true, recorder);
        local.toggleButton_to_ColorButton(driver, true, recorder);
        local.openPopupWindow(driver, true, true, recorder);
        local.openWindow(driver, true, true, recorder);
    }

    @Description("Пользователь (подтверждение без разрешения) без группы")
    @Links(value = {@Link(name = "Rizzoma", url = RIZZOMA_LINK), @Link(name = "TestProject", url = TPROJECT_LINK)})
    @Epic(value = "Права доступа и безопасность")
    @Feature(value = "Права доступа")
    @Story(value = "Проверка пользователя с правами по умолчанию")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void _17(){
        tester.action.loginAs(driver, "17", "");
        local.checkInaccessibility(driver, recorder);
    }
}
