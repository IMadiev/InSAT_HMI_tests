package autotestAccessRights;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class LocalSteps {
    InsatWebUITools tester = new InsatWebUITools();

    public static final String TOGGLE_BUTTON_XPATH = "//*[@data-control-id='58318']";
    public static final String COLOR_BUTTON_XPATH = "//*[@data-control-id='58341']";
    public static final String TEXTINPUT_XPATH = "//*[@data-control-id='58239']";
    public static final String TEXTOUTPUT_XPATH = "//*[@data-control-id='58253']";
    public static final String INCREMENT_XPATH = "//*[@data-control-id='58267']";
    public static final String GAUGE_XPATH = "//*[@data-control-id='58281']";
    public static final String BUTTON_XPATH = "//*[@data-control-id='58535']";
    public static final String BUTTON_POPUP_XPATH = "//*[@data-control-id='58568']";

    @Step ("Ожидание прогрузки страницы")
    public void loading(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TOGGLE_BUTTON_XPATH)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TOGGLE_BUTTON_XPATH)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(COLOR_BUTTON_XPATH)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(COLOR_BUTTON_XPATH)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TEXTINPUT_XPATH)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TEXTINPUT_XPATH)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TEXTOUTPUT_XPATH)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TEXTOUTPUT_XPATH)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(INCREMENT_XPATH)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INCREMENT_XPATH)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BUTTON_XPATH)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BUTTON_XPATH)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BUTTON_POPUP_XPATH)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BUTTON_POPUP_XPATH)));
        driver.switchTo().frame(driver.findElement(By.xpath(GAUGE_XPATH)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg")));
        driver.switchTo().defaultContent();
    }

    @Step ("Проверка недоступности управления и открытия окон по свойству disabled")
    public void checkInaccessibility (WebDriver driver, InsatWebRecorder recorder){
        loading(driver);
        recorder.addShot(driver);
        tester.check.elementProperty("Кнопка с фиксацией", driver, TOGGLE_BUTTON_XPATH, "disabled", "true");
        tester.check.elementProperty("Кнопка выбора цвета", driver, COLOR_BUTTON_XPATH, "disabled", "true");
        tester.check.elementProperty("Текстовый ввод", driver, TEXTINPUT_XPATH, "disabled", "true");
        tester.check.elementProperty("Текст", driver, TEXTOUTPUT_XPATH, "disabled", "true");
        tester.check.elementProperty("Инкремент", driver, INCREMENT_XPATH, "disabled", "true");
        tester.check.elementProperty("Стрелочный прибор", driver, GAUGE_XPATH, "disabled", "true");
        tester.check.elementProperty("Кнопка (Переход на окно)", driver, BUTTON_XPATH, "disabled", "true");
        tester.check.elementProperty("Кнопка (Открытия окна)", driver, BUTTON_POPUP_XPATH, "disabled", "true");
    }

    @Step ("Проверка взаимодействия контролов [Текст] и [Текстовый ввод]")
    public void textIn_To_TextOut (WebDriver driver, boolean controlConfirmation, InsatWebRecorder recorder){
        loading(driver);
        recorder.addShot(driver);
        tester.check.elementProperty("Текстовый ввод", driver, TEXTINPUT_XPATH, "disabled", null);
        driver.findElement(By.xpath(TEXTINPUT_XPATH)).sendKeys("Hello"+Keys.ENTER);
        recorder.addShot(driver);
        if (controlConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения управления, несмотря на попытку изменить текст текстового ввода", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить управление", "Exist", "None");
            }
        } else
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
                Assert.assertEquals("Присутствует окно подтверждения управления, несмотря на безусловное разрешение", "Exist", "None");
            } catch (Exception er) {   }
        tester.check.textOutput(driver, TEXTOUTPUT_XPATH, "ТекстHello");
    }

    @Step ("Проверка взаимодействия контролов [Инкремент] и [Стрелочный прибор]")
    public void increment_to_Gauge (WebDriver driver, boolean controlConfirmation, InsatWebRecorder recorder){
        recorder.addShot(driver);
        tester.check.elementProperty("Инкремент", driver, INCREMENT_XPATH, "disabled", null);
        tester.action.wait(driver, "//*[@data-control-id = '58281']");
        driver.findElement(By.xpath(INCREMENT_XPATH)).findElement(By.xpath("//*[@class = 'increment_input']")).sendKeys(Keys.BACK_SPACE+"17"+Keys.ENTER);
        recorder.addShot(driver);
        if (controlConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения управления, несмотря на попытку изменить значение инкремента вводом строки", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить управление", "Exist", "None");
            }
        } else
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
                Assert.assertEquals("Присутствует окно подтверждения управления, несмотря на безусловное разрешение", "Exist", "None");
            } catch (Exception er) {   }
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '58281']")));
        Assert.assertEquals("Изменение значения стрелочного прибора с помощью ввода строки в инкремент не сработало", "17", driver.findElement(By.cssSelector("#Text")).getText());

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(INCREMENT_XPATH)).findElement(By.xpath("//div[contains(@class, 'up')]")).click();
        recorder.addShot(driver);
        if (controlConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения управления, несмотря на попытку изменить значение инкремента нажатием кнопки вверх", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить управление", "Exist", "None");
            }
        } else
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
                Assert.assertEquals("Присутствует окно подтверждения управления, несмотря на безусловное разрешение", "Exist", "None");
            } catch (Exception er) {   }
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-control-id = '58281']")));
        Assert.assertEquals("Изменение значения стрелочного прибора с помощью кнопки [вверх] инкремента не сработало", "18", driver.findElement(By.cssSelector("#Text")).getText());
        driver.switchTo().defaultContent();
    }

    @Step ("Проверка взаимодействия контролов [Кнопка с фиксацией] и [Кнопка выбора цвета]")
    public void toggleButton_to_ColorButton (WebDriver driver, boolean controlConfirmation, InsatWebRecorder recorder){
        recorder.addShot(driver);
        tester.check.elementProperty("Кнопка с фиксацией", driver, TOGGLE_BUTTON_XPATH, "disabled", null);
        tester.event.click(driver, TOGGLE_BUTTON_XPATH);
        recorder.addShot(driver);
        if (controlConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения управления, несмотря на попытку изменить видимость кнопки выбора цвета кнопкой с фиксацией", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить управление", "Exist", "None");
            }
        } else
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
                Assert.assertEquals("Присутствует окно подтверждения управления, несмотря на безусловное разрешение", "Exist", "None");
            } catch (Exception er) {   }
        tester.check.elementCSSProperty("Кнопка выбора цвета", driver, COLOR_BUTTON_XPATH, "visibility", "hidden");
    }

    @Step ("Провека открытия всплывающего окна по клику на кнопку")
    public void openPopupWindow (WebDriver driver, boolean controlConfirmation, boolean windowConfirmation, InsatWebRecorder recorder){
        recorder.addShot(driver);
        tester.check.elementProperty("Кнопка", driver, BUTTON_POPUP_XPATH, "disabled", null);
        tester.event.click(driver, BUTTON_POPUP_XPATH);
        recorder.addShot(driver);
        if (controlConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения управления, несмотря на попытку открыть всплывающее окно", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить управление", "Exist", "None");
            }
        }
        if (windowConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения открытия окна, несмотря на попытку открыть всплывающее окно", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить открытие окна", "Exist", "None");
            }
        }
        try {
            driver.findElement(By.xpath("//button/span[text() = 'Закрыть']")).click();
        } catch (Exception er) {Assert.assertTrue("Не удалось закрыть всплывающее окно", false);}
    }

    @Step ("Проверка перехода на окно по клику кнопки")
    public void openWindow (WebDriver driver, boolean controlConfirmation, boolean windowConfirmation, InsatWebRecorder recorder){
        recorder.addShot(driver);
        tester.check.elementProperty("Кнопка", driver, BUTTON_XPATH, "disabled", null);
        tester.event.click(driver, BUTTON_XPATH);
        recorder.addShot(driver);
        if (controlConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения управления, несмотря на попытку осуществить переход на окно", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить управление", "Exist", "None");
            }
        }
        if (windowConfirmation) {
            try {
                driver.findElement(By.cssSelector("body > div.ui-dialog"));
            } catch (Exception er) {
                Assert.assertEquals("Отсутствует окно подтверждения открытия окна, несмотря на попытку осуществить переход на окно", "Exist", "None");
            }
            try {
                driver.findElement(By.xpath("//button/span[text() = 'Ок']")).click();
                recorder.addShot(driver);
            } catch (Exception er) {
                Assert.assertEquals("Не удалось подтвердить переход на окно", "Exist", "None");
            }
        }
        Assert.assertEquals("Не произошел переход на окно по клику кнопки", "http://127.0.0.1:8043/3/index.html?window=58382", driver.getCurrentUrl());
    }
}
