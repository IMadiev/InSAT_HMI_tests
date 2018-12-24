package autotestEvents;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebUITools;

public class LocalSteps {
    InsatWebUITools tester = new InsatWebUITools();

    @Step("Проверка возвращения параметров события {event}")
    public void checkEventParameters(WebDriver driver, String event, String x_xpath, String y_xpath, String lkm_xpath) {
        Assert.assertNotEquals("Не вернулось значение координаты Х события " + event, "0", driver.findElement(By.xpath(x_xpath)).getText());
        Assert.assertNotEquals("Не вернулось значение координаты Y события " + event, "0", driver.findElement(By.xpath(y_xpath)).getText());
        if (event != "[Захват мыши]" && event != "[Покидание мыши]" && event != "[Перемещение мыши]")
            Assert.assertNotEquals("Не вернулось сообщение о действии ЛКМ события " + event, "false", driver.findElement(By.xpath(lkm_xpath)).getText());
    }

    @Step("Проверка параметров, установленных действием по событию {event}")
    public void checkSettedParameters(WebDriver driver, String event, String addXpath, String subXpath, String mulXpath, String divXpath, String moveXpath) {
        tester.check.textOutput(driver, addXpath, "10");
        tester.check.textOutput(driver, subXpath, "7");
        tester.check.textOutput(driver, mulXpath, "4");
        tester.check.textOutput(driver, divXpath, "1");
        tester.check.textOutput(driver, moveXpath, "Работает");
    }

    @Step ("Проверка наличия сообщения по действию, вызванному событием {event}")
    public void checkMessage(WebDriver driver, String event){
        try {
            driver.findElement(By.xpath("//*[@id='popup_container']"));
        } catch (Exception er) {Assert.assertEquals("Окно сообщения отсутствует при вызове событием "+event, "Exist", "None");}
    }

    @Step ("Проверка применения/отключения Fullscreen по событию {event}, основанная на высоте фрейма")
    public void checkFrameHeight (WebDriver driver, boolean isFullscreenActive, int nonFullscreenHeight, String event){
        if (isFullscreenActive) {
            Assert.assertNotEquals("Высота окна в полноэкранном режиме равна обычной, полноэкранный режим не применился по событию "+event, nonFullscreenHeight, driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height);
        } else {
            Assert.assertEquals("Выход из полноэкранного режима не применился по событию "+event, nonFullscreenHeight, driver.findElement(By.xpath("//*[@data-control-role='Frame']")).getSize().height);
        }
    }

    @Step ("Проверка перехода по адресу по событию {event}")
    public void checkURL (WebDriver driver, String event){
        Assert.assertEquals("Не сработало действие [Открыть адрес] по событию "+event, "https://www.google.ru/", driver.getCurrentUrl());
    }

    @Step ("Проверка вызова ФБ событием {event}")
    public void checkFB(WebDriver driver, String event, String stXpath, String fbdXpath, String ldXpath, String sfcXpath){
        tester.check.textOutput(driver, stXpath, "вызвано");
        tester.check.textOutput(driver, fbdXpath, "вызвано");
        tester.check.textOutput(driver, ldXpath, "true");
        tester.check.textOutput(driver, sfcXpath, "вызвано");
    }

    @Step ("Проверка наличия всплывающего окна по событию {event}")
    public void checkPopup (WebDriver driver, String event){
        try {
            driver.findElement(By.xpath("//*[@role='dialog']"));
        } catch (Exception er) {Assert.assertEquals("Не появилось всплывающее окно по событию "+event, "Exist", "None");}
        try {
            driver.findElement(By.xpath("//*[@data-control-id='157264']"));
        } catch (Exception er) {Assert.assertEquals("Не отобразилось содержимое всплывающего окна по событию "+event, "Exist", "None");}
    }

    @Step ("Ожидание появления прогресса загрузки")
    public void waitPreloader (WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.preloaderBase.sheme-preloader")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.preloaderBase.sheme-preloader")));
    }
}
