package autotestWindows;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingTools.InsatWebUITools;

public class LocalSteps {
    InsatWebUITools tester = new InsatWebUITools();

    @Step("Проверка всплывающей подсказки")
    public void tooltipCheck (WebDriver driver, String xPath, String tooltipText){
        tester.event.mouseOver(driver, xPath, 5, 5);
        tester.check.presenceOfElement(driver, "Всплывающая подсказка", "//*[contains(@class, 'ui-tooltip-content')]");
        tester.check.elementProperty("Всплывающая подсказка", driver, "//*[contains(@class, 'ui-tooltip-content')]", "textContent", tooltipText);
    }

    @Step ("Проверка ввода русской клавиатуры")
    public void russianKeyboardInput (WebDriver driver){
        String keys[] = {"ё", "1","2","3","4","5","6","7","8","9","0","-","=","й","ц","у","к","е","н","г","ш","щ","з", "х","ъ","\\","ф","ы","в","а","п","р","о","л","д","ж","э","я","ч","с","м","и","т","ь","б","ю","."};
        for (int i=0; i<keys.length; i++) {
            tester.event.click(driver, "//*[@data-control-id = '59461']");
            tester.action.wait(50);
            tester.event.click(driver, "//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '"+keys[i]+"']");
            tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59461']", "value", keys[i]);
            tester.set.textInput(driver, "//*[@data-control-id = '59461']", "");
        }

        tester.event.click(driver, "//*[@data-control-id = '59461']");
        tester.action.wait(50);
        tester.event.click(driver, "//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'а']");
        tester.action.wait(50);
        tester.event.click(driver, "//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'bksp']");
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59461']", "value", "");
        tester.set.textInput(driver, "//*[@data-control-id = '59461']", "");

        tester.event.click(driver, "//*[@data-control-id = '59461']");
        tester.action.wait(50);
        tester.event.click(driver, "//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'а']");
        tester.event.click(driver, "//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'accept']");
        tester.action.wait(50);
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59461']", "value", "а");
        tester.set.textInput(driver, "//*[@data-control-id = '59461']", "");

        tester.event.click(driver, "//*[@data-control-id = '59461']");
        tester.action.wait(50);
        tester.event.click(driver, "//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'а']");
        tester.action.wait(50);
        tester.event.click(driver, "//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'cancel']");
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59461']", "value", "");
    }

    @Step ("Проверка ввода английской клавиатуры")
    public void englishKeyboardInput (WebDriver driver){
        String keys[] = {"`", "1","2","3","4","5","6","7","8","9","0","-","=","q","w","e","r","t","y","u","i","o","p","[","]","\\","a","s","d","f","g","h","j","k","l",";","z","x","c","v","b","n","m",",", ".", "/"};
        for (int i=0; i<keys.length; i++) {
            tester.event.click(driver, "//*[@data-control-id = '59474']");
            tester.action.wait(50);
            driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '"+keys[i]+"']")).click();
            tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59474']", "value", keys[i]);
            tester.set.textInput(driver, "//*[@data-control-id = '59474']", "");
        }

        tester.event.click(driver, "//*[@data-control-id = '59474']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'a']")).click();
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'bksp']")).click();
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59474']", "value", "");
        tester.set.textInput(driver, "//*[@data-control-id = '59474']", "");

        tester.event.click(driver, "//*[@data-control-id = '59474']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'a']")).click();
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'accept']")).click();
        tester.action.wait(50);
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59474']", "value", "a");
        tester.set.textInput(driver, "//*[@data-control-id = '59474']", "");

        tester.event.click(driver, "//*[@data-control-id = '59474']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'a']")).click();
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'cancel']")).click();
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59474']", "value", "");
    }

    @Step ("Проверка ввода цифровой клавиатуры")
    public void numericKeyboardInput (WebDriver driver){
        String keys[] = {"1","2","3","4","5","6","7","8","9","0","-","=","+","(",")","*","/"};
        for (int i=0; i<keys.length; i++) {
            tester.event.click(driver, "//*[@data-control-id = '59488']");
            tester.action.wait(50);
            driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '"+keys[i]+"']")).click();
            tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59488']", "value", keys[i]);
            tester.set.textInput(driver, "//*[@data-control-id = '59488']", "");
        }

        tester.event.click(driver, "//*[@data-control-id = '59488']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'dec']")).click();
        tester.action.wait(50);
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59488']", "value", ".");
        tester.set.textInput(driver, "//*[@data-control-id = '59488']", "");

        tester.event.click(driver, "//*[@data-control-id = '59488']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '1']")).click();
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'bksp']")).click();
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59488']", "value", "");
        tester.set.textInput(driver, "//*[@data-control-id = '59488']", "");

        tester.event.click(driver, "//*[@data-control-id = '59488']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '1']")).click();
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'clear']")).click();
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59488']", "value", "");
        tester.set.textInput(driver, "//*[@data-control-id = '59488']", "");

        tester.event.click(driver, "//*[@data-control-id = '59488']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '1']")).click();
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'sign']")).click();
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59488']", "value", "-1");
        tester.set.textInput(driver, "//*[@data-control-id = '59488']", "");

        tester.event.click(driver, "//*[@data-control-id = '59488']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '1']")).click();
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'accept']")).click();
        tester.action.wait(50);
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59488']", "value", "1");
        tester.set.textInput(driver, "//*[@data-control-id = '59488']", "");

        tester.event.click(driver, "//*[@data-control-id = '59488']");
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = '1']")).click();
        tester.action.wait(50);
        driver.findElement(By.xpath("//*[contains(@class, 'ui-keyboard-has-focus')]/div[@name = 'normal']/button[@data-name = 'cancel']")).click();
        tester.check.elementProperty("TextInput", driver, "//*[@data-control-id = '59488']", "value", "");
    }

    @Step ("Открыть всплывающее окно")
    public void openPopupWindow (WebDriver driver){
        tester.event.click(driver, "//*[@data-control-id = '62729']");
        tester.action.wait(driver, "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]");
    }

    @Step ("Закрыть всплывающее окно")
    public void closePopupWindow (WebDriver driver){
        tester.event.click(driver, "//*[contains(@class, 'ui-dialog-titlebar-close')]");
    }

    @Step ("Проверка изменяемости размеров всплывающего окна")
    public void checkResizability (WebDriver driver){
        Assert.assertTrue("Класс всплывающего окна не содержит значения [ui-resizable]", driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]")).getAttribute("class").contains("ui-resizable"));
        tester.check.presenceOfElement(driver, "Правый язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-e')]" );
        tester.check.presenceOfElement(driver, "Левый язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-w')]" );
        tester.check.presenceOfElement(driver, "Верхний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-n')]" );
        tester.check.presenceOfElement(driver, "Нижний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-s')]" );
        tester.check.presenceOfElement(driver, "Правый верхний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-ne')]" );
        tester.check.presenceOfElement(driver, "Правый нижний изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-se')]" );
        tester.check.presenceOfElement(driver, "Левый верхний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-nw')]" );
        tester.check.presenceOfElement(driver, "Левый нижний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-sw')]" );
    }

    @Step ("Проверка неизменяемости размеров всплывающего окна")
    public void checkUnresizability (WebDriver driver){
        tester.check.unpresenceOfElement(driver, "Правый язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-e')]" );
        tester.check.unpresenceOfElement(driver, "Левый язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-w')]" );
        tester.check.unpresenceOfElement(driver, "Верхний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-n')]" );
        tester.check.unpresenceOfElement(driver, "Нижний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-s')]" );
        tester.check.unpresenceOfElement(driver, "Правый верхний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-ne')]" );
        tester.check.unpresenceOfElement(driver, "Правый нижний изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-se')]" );
        tester.check.unpresenceOfElement(driver, "Левый верхний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-nw')]" );
        tester.check.unpresenceOfElement(driver, "Левый нижний язычок изменения размера всплывающего окна", "//*[contains(@class, 'ui-dialog') and contains(@class, 'ui-widget')]/div[contains(@class, 'ui-resizable-sw')]" );
    }

    @Step ("Проверка текста заголовка")
    public void checkTitle (WebDriver driver, String expected){
        tester.check.elementProperty("Заголовок всплывающего окна", driver, "//span[contains(@class, 'ui-dialog-title')]", "textContent", expected);
    }
}
