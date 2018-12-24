package testingTools;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

/**
 * Автологируемый (Allure) вспомогательный класс для упрощения повседневных задач автоматизации тестирования web UI в компании ИнСАТ.
 * @author IMadiev
 * @version 1.2
 */
public class InsatWebUITools {

    /**Поле для установки значения контролам группы [Диалог] MasterSCADA 4*/
    public SetControl set = new SetControl();
    /**Поле для симуляции событий пользователя в браузере с объектами MasterSCADA 4*/
    public Events event = new Events();
    /**Поле, содержащее методы для автоматизации наиболее часто встречающихся задач при написании автотестов для MasterSCADA 4*/
    public Act action = new Act();
    /**Поле, содержащее стандартные проверки при написании автотестов для MasterSCADA 4*/
    public Verifications check = new Verifications();

    /** Вложенный класс для установки значения контролам группы [Диалог] MasterSCADA 4*/
    public class SetControl{

        @Step("Запись строки {value} в текстовый ввод, найденный по XPath: {xPath}")
        public void textInput(WebDriver driver, String xPath, String value)
        {
            /*driver.findElement(By.xpath(xPath)).clear();
            driver.findElement(By.xpath(xPath)).sendKeys(value + Keys.ENTER);*/
            driver.findElement(By.xpath(xPath)).sendKeys(Keys.CONTROL + "a" + Keys.DELETE );
            driver.findElement(By.xpath(xPath)).sendKeys(value + Keys.ENTER);


        }

        @Step("Запись строки {password} в поле для пароля, найденному по XPath: {xPath}")
        public void passwordBox(WebDriver driver, String xPath, String password)
        {
            /*driver.findElement(By.xpath(xPath)).clear();
            driver.findElement(By.xpath(xPath)).sendKeys(password + Keys.ENTER);*/
            driver.findElement(By.xpath(xPath)).sendKeys(Keys.CONTROL + "a" + Keys.DELETE );
            driver.findElement(By.xpath(xPath)).sendKeys(password + Keys.ENTER);
        }

        @Step("Выбор значения {value} в комбобоксе, найденному по XPath: {xPath}")
        public void comboBox(WebDriver driver, String xPath, String value)
        {
            Select selectElement = new Select(driver.findElement(By.xpath(xPath)));
            selectElement.selectByValue(value);
        }

        @Step("Установка значения {value} инкременту, найденному по XPath: {xPath}")
        public void increment(WebDriver driver, String xPath, String value)
        {
            /*driver.findElement(By.xpath(xPath+"//*[@class = 'increment_input']")).clear();
            driver.findElement(By.xpath(xPath+"//*[@class = 'increment_input']")).sendKeys(Keys.BACK_SPACE+value+Keys.ENTER);*/
            driver.findElement(By.xpath(xPath)).sendKeys(Keys.CONTROL + "a" + Keys.DELETE );
            driver.findElement(By.xpath(xPath)).sendKeys(value + Keys.ENTER);
            driver.findElement(By.xpath(xPath)).click();
        }

        @Step("Смещение курсора кнопки выбора цвета, найденной по XPath: {xPath}, на {x} пикселей вправо и {y} пикселей вниз")
        public void colorButton(WebDriver driver, String xPath, int x, int y)
        {
            driver.findElement(By.xpath(xPath)).click();
            action.wait(500);
            Actions builder = new Actions(driver);
            builder
                    .dragAndDropBy(driver.findElement(By.cssSelector("body > div.cp-color-picker > div.cp-xy-slider > div.cp-xy-cursor")), x, y)
                    .build()
                    .perform();
            driver.findElement(By.cssSelector("body")).click();
        }

        @Step("Установка курсора кнопки выбора цвета, найденной по XPath: {xPath}, в середину поля")
        public void colorButton(WebDriver driver, String xPath)
        {
            driver.findElement(By.xpath(xPath)).click();
            (new WebDriverWait(driver, 240))
                    .until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.cp-color-picker > div.cp-xy-slider > div.cp-white")));
            driver.findElement(By.cssSelector("body > div.cp-color-picker > div.cp-xy-slider > div.cp-white")).click();
            driver.findElement(By.cssSelector("body")).click();
        }

        @Step("Установка значения контролу [Время]: {hours}:{minutes}:{seconds}:{millis}")
        public void timePicker (WebDriver driver, String xPath, String hours, String minutes, String seconds, String millis){
            driver.findElement(By.xpath(xPath)).click();
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role = 'dialog' and contains(@class, 'mbsc-fr-bubble')]")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role = 'dialog' and contains(@class, 'mbsc-fr-bubble')]")));
            if (millis!="") {
                int expected = Integer.parseInt(millis);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Мсек' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Мсек' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Мсек' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (seconds!="") {
                int expected = Integer.parseInt(seconds);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Секунды' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Секунды' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Секунды' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (minutes!="") {
                int expected = Integer.parseInt(minutes);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Минуты' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Минуты' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Минуты' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (hours!="") {
                int expected = Integer.parseInt(hours);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Часы' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Часы' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Часы' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            driver.findElement(By.xpath("//*[@role = 'button' and contains(@class, 'mbsc-fr-btn0')]")).click();
            action.wait(200);
        }

        @Step("Установка значения контролу [ДатаВремя]: {day}-{month}-{year} {hours}:{minutes}:{seconds}:{millis}")
        public void dateTimePicker (WebDriver driver, String xPath, String day, String month, String year, String hours, String minutes, String seconds, String millis){
            driver.findElement(By.xpath(xPath)).click();
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role = 'dialog' and contains(@class, 'mbsc-fr-bubble')]")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role = 'dialog' and contains(@class, 'mbsc-fr-bubble')]")));
            if (millis!="") {
                int expected = Integer.parseInt(millis);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Мсек' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Мсек' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Мсек' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (seconds!="") {
                int expected = Integer.parseInt(seconds);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Секунды' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Секунды' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Секунды' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (minutes!="") {
                int expected = Integer.parseInt(minutes);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Минуты' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Минуты' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Минуты' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (hours!="") {
                int expected = Integer.parseInt(hours);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Часы' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Часы' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Часы' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (day!="") {
                int expected = Integer.parseInt(day);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='День' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='День' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='День' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (month!="") {
                int expected = Integer.parseInt(month);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Месяц' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                int data_index = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Месяц' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-index"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        String next_di = Integer.toString(++data_index+12);
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Месяц' and @role = 'listbox']//*[@data-val = '"+next+"' and @data-index = '"+next_di+"']")));
                        driver.findElement(By.xpath("//*[@aria-label='Месяц' and @role = 'listbox']//*[@data-val = '"+next+"' and @data-index = '"+next_di+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        String next_di = Integer.toString(--data_index+12);
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Месяц' and @role = 'listbox']//*[@data-val = '"+next+"' and @data-index = '"+next_di+"']")));
                        driver.findElement(By.xpath("//*[@aria-label='Месяц' and @role = 'listbox']//*[@data-val = '"+next+"' and @data-index = '"+next_di+"']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            if (year!="") {
                int expected = Integer.parseInt(year);
                int actual = Integer.parseInt(driver.findElement(By.xpath("//*[@aria-label='Год' and @role = 'listbox']//*[@aria-selected='true']")).getAttribute("data-val"));
                if (expected>actual) {
                    for (; actual<expected; actual++) {
                        String next = Integer.toString(actual+1);
                        driver.findElement(By.xpath("//*[@aria-label='Год' and @role = 'listbox']//*[@data-val = '"+next+"']")).click();
                        action.wait(200);
                    }
                } else if (expected<actual) {
                    for (; actual > expected; actual--) {
                        String next = Integer.toString(actual - 1);
                        driver.findElement(By.xpath("//*[@aria-label='Год' and @role = 'listbox']//*[@data-val = '" + next + "']")).click();
                        action.wait(200);
                    }
                } else {}
            }
            driver.findElement(By.xpath("//*[@role = 'button' and contains(@class, 'mbsc-fr-btn0')]")).click();
            action.wait(200);
        }

        @Step ("Установить кнопку с фиксацией в положение {state}")
        public void toggleButton (WebDriver driver, String xPath, boolean state){
            boolean actual_state = driver.findElement(By.xpath(xPath)).getCssValue("border-style").contains("inset");
            if (actual_state!=state){
                driver.findElement(By.xpath(xPath)).click();
            }
        }

        @Step ("Установить чекбокс в положение {state}")
        public void checkBox (WebDriver driver, String xPath, boolean state){
            boolean actual_state = driver.findElement(By.xpath(xPath+"//*[local-name()='g']")).getCssValue("display").contains("inline");
            if (actual_state!=state){
                driver.findElement(By.xpath(xPath)).click();
            }
        }

        @Step ("Для элемента ({xPath}) присвоить параметру стиля [{parameter}] значение [{value}]")
        public void elementStyleProperty (WebDriver driver, String xPath, String parameter, String value){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(By.xpath(xPath));
            js.executeScript("arguments[0].style."+parameter+" = '"+value+"'", element);
        }

        @Step ("Для элемента ({xPath}) присвоить свойству [{parameter}] значение [{value}]")
        public void elementProperty (WebDriver driver, String xPath, String parameter, String value){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(By.xpath(xPath));
            js.executeScript("arguments[0]."+parameter+" = '"+value+"'", element);
        }
    }

    /** Вложенный класс для симуляции событий пользователя в браузере с объектами MasterSCADA 4*/
    public class Events{

        @Step("Клик ЛКМ по элементу, найденному по XPath: {xPath}")
        public void click(WebDriver driver, String xPath)
        {
            driver.findElement(By.xpath(xPath)).click();
        }

        @Step("Двойной клик ЛКМ по элементу, найденному по XPath: {xPath}")
        public void doubleClick(WebDriver driver, String xPath)
        {
            Actions dc = new Actions(driver);
            dc.doubleClick(driver.findElement(By.xpath(xPath))).perform();
        }

        @Step("Наведение указателя мыши на элемент страницы, найденный по XPath: {xPath}")
        public void mouseOver(WebDriver driver, String xPath, int x, int y)
        {
            Actions act = new Actions(driver);
            act.moveToElement(driver.findElement(By.xpath(xPath)), x, y).build().perform();
        }

        @Step("Клик ПКМ по элементу, найденному по XPath: {xPath}")
        public void rightClick(WebDriver driver, String xPath)
        {
            Actions act = new Actions(driver);
            act.contextClick(driver.findElement(By.xpath(xPath))).perform();
        }

        @Step("Нажатие ЛКМ на элемент, найденный по XPath: {xPath}")
        public void mouseDown(WebDriver driver, String Xpath)
        {
            Actions act = new Actions(driver);
            act.clickAndHold(driver.findElement(By.xpath(Xpath))).perform();
        }

        @Step("Отжатие ЛКМ элемента, найденного по XPath: {xPath}")
        public void mouseUp(WebDriver driver, String xPath)
        {
            Actions act = new Actions(driver);
            act.release(driver.findElement(By.xpath(xPath))).perform();
        }

        @Step("Клик по элементу, найденному по XPath: {xPath} и нажатие кнопки {key}")
        public void keyDown (WebDriver driver, String xPath, Keys key)
        {
            Actions act = new Actions(driver);
            driver.findElement(By.xpath(xPath)).click();
            act.keyDown(key).perform();
        }

        @Step("Клик по элементу, найденному по XPath: {xPath} и отпускание кнопки {key}")
        public void keyUp(WebDriver driver, String xPath, Keys key)
        {
            Actions act = new Actions(driver);
            driver.findElement(By.xpath(xPath)).click();
            act.keyUp(key).perform();
        }

        @Step("Клик по элементу, найденному по XPath: {xPath} и ввод символа [a]")
        public void inputSymbol(WebDriver driver, String xPath)
        {
            Actions act = new Actions(driver);
            driver.findElement(By.xpath(xPath)).click();
            act.sendKeys("a").perform();
        }

        @Step ("Перетащить элемент ({xPath}) на {x} пикселей вправо и {y} пикселей вниз")
        public void dragAndDrop (WebDriver driver, String xPath, int x, int y){
            Actions actions = new Actions(driver);
            actions.dragAndDropBy(driver.findElement(By.xpath(xPath)), x, y)
                    .build()
                    .perform();
        }
    }

    /**Вложенный класс, содержащий методы для автоматизации наиболее часто встречающихся задач при написании автотестов*/
    public class Act{

        @Step ("Ожидание прогрузки/активности элемента, найденного по XPath: {xPath}")
        public void wait(WebDriver driver, String xPath)
        {
            WebDriverWait wait = new WebDriverWait(driver, 240);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        }

        @Step ("Ожидание {milliseconds} мсек")
        public void wait(int milliseconds)
        {
            try {
                Thread.sleep(milliseconds);
            } catch (Exception er) {er.printStackTrace(); Assert.assertTrue("Превышено время ожидания", false);}
        }

        @Step ("Ожидание прогрузки/активности SVG - элемента, расположенного в embed с XPath: {embedXPath}")
        public void waitSVG (WebDriver driver, String embedXPath){
            try {
                WebDriverWait wait = new WebDriverWait(driver, 240);
                driver.switchTo().frame(driver.findElement(By.xpath(embedXPath)));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg")));
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg")));
                driver.switchTo().defaultContent();
            } catch (Exception er) {driver.switchTo().defaultContent();}
        }

        @Step ("Создание папки на компьютере при условии ее отсутствия")
        public void createDirectory(String path)
        {
            File testScreen = new File(path);
            if (!testScreen.exists()) {
                try {
                    Files.createDirectories(Paths.get(path));
                } catch (IOException er) {er.printStackTrace();}
            }
        }

        @Step ("Взятие скриншота всей страницы в буфер в формате Screenshot")
        public Screenshot takeScreenshot(WebDriver driver)
        {
            Screenshot shot = new AShot()
                    .shootingStrategy(ShootingStrategies.viewportPasting(100))
                    .takeScreenshot(driver);
            return shot;
        }

        @Step ("Взятие скриншота элемента страницы, найденного по XPath: {xPath}")
        public Screenshot takeScreenshot(WebDriver driver, String xPath)
        {
            Screenshot shot = new AShot()
                    .coordsProvider(new WebDriverCoordsProvider())
                    .takeScreenshot(driver, driver.findElement(By.xpath(xPath)));
            return shot;
        }

        @Step ("Сохранение изображения {name} в директории {path}")
        public void saveImage(BufferedImage img, String path, String name)
        {
            Assert.assertTrue("Имя файла не содержит подстроку [.png]", name.contains(".png"));
            File outFile = new File(path+"/"+name);
            try {
                createDirectory(path);
                ImageIO.write(img, "png", outFile);
            }
            catch (IOException e) {
                e.printStackTrace();
                Assert.assertTrue("Не удалось сохранить файл", false);
            }
        }

        @Step ("Чтение изображения {name} в директории {path}")
        public Screenshot readImage (String path, String name)
        {
            Assert.assertTrue("Имя файла не содержит подстроку [.png]", name.contains(".png"));
            try {
                Screenshot expectedShot = new Screenshot(ImageIO.read(new File(path + "/"+ name)));
                return expectedShot;
            } catch (IOException e) {
                e.printStackTrace();
                Assert.assertTrue("Не найден файл для чтения", false);
                return null;
            }
        }

        /**Метод, собирающий изображения в gif файл. Использует класс testingTools.GifSequenceWriter
         * @param paths Массив строк, содержащий пути к изображениям, из которых собирается gif. Порядок изображений в массиве определяет порядок показа в gif
         * @param path_to_save Путь до директории, в которой планируется сохранить gif
         * @param name Имя сохраняемого файла gif, вида ["images.gif"]
         * */
        @Step ("Сборка и сохранение gif")
        public void makeGif (String[] paths, String path_to_save, String name) {
            Assert.assertTrue("Имя файла не содержит подстроку [.gif]", name.contains(".gif"));
            try {
                if (paths.length > 1) {
                    BufferedImage firstImage = ImageIO.read(new File(paths[0]));
                    createDirectory(path_to_save);
                    ImageOutputStream output =
                            new FileImageOutputStream(new File(path_to_save + "/" + name));
                    GifSequenceWriter writer = new GifSequenceWriter(output, firstImage.getType(), 1000, true);
                    writer.writeToSequence(firstImage);
                    for (int i = 1; i < paths.length; i++) {
                        BufferedImage nextImage = ImageIO.read(new File(paths[i]));
                        writer.writeToSequence(nextImage);
                    }
                    writer.close();
                    output.close();
                } else {
                    System.out.println("Usage: java testingTools.GifSequenceWriter [list of gif files] [output file]");
                }
            } catch (Exception er) {er.printStackTrace();}
        }

        @Step ("Вход под пользователем [{login}], пароль {password}")
        public void loginAs (WebDriver driver, String login, String password){
            final String LOGIN_XPATH = "//*[@id='login']";
            final String PASSWORD_XPATH = "//*[@id='password']";
            wait(driver, LOGIN_XPATH);
            Select selectElement = new Select(driver.findElement(By.xpath(LOGIN_XPATH)));
            selectElement.selectByValue(login);
            wait(driver, PASSWORD_XPATH);
            driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys(password+Keys.ENTER);
        }

        /**Добавить файл к баг-репорту*/
        @Attachment (value = "Приложение")
        public byte[] getBytes(String path) throws IOException {
            return Files.readAllBytes(Paths.get(path));
        }

        @Step ("Эталон для Screenshot-based теста отсутствует. Создание нового.")
        public void addNewEthalon (Screenshot actual, String pathToSaveFiles, String fileName){
            createDirectory(pathToSaveFiles+"/Expected");
            saveImage(actual.getImage(), pathToSaveFiles+"/Expected", fileName+".png");
            try {
                getBytes(pathToSaveFiles+"/Expected/"+ fileName +".png");
            } catch (IOException er) {er.printStackTrace();}
        }

        @Step ("Удалить элемент ({xPath}) со страницы")
        public void removeElement(WebDriver driver, String xPath){
            ((JavascriptExecutor) driver).executeScript("arguments[0].remove();", driver.findElement(By.xpath(xPath)));
        }
    }

    /**Вложенный класс, содержащий стандартные проверки при написании автотестов для MasterSCADA 4*/
    public class Verifications{

        @Step ("Проверка наличия элемента [{elementName}] на странице")
        public void presenceOfElement (WebDriver driver, String elementName,String xPath){
            try {
                driver.findElement(By.xpath(xPath));
            } catch (Exception er) {Assert.assertTrue("На странице отсутствует элемент ["+elementName+"]", false);}
        }

        @Step ("Проверка отсутствия элемента [{elementName}] на странице")
        public void unpresenceOfElement (WebDriver driver, String elementName,String xPath){
            try {
                driver.findElement(By.xpath(xPath));
                Assert.assertTrue("На странице присутствует элемент ["+elementName+"]", false);
            } catch (Exception er) {}
        }

        /**Метод для проверки текста контрола [Текст]
         * @param expected Ожидаемое значение*/
        @Step("Проверка соответствия ожидаемого и реального текста контрола [Текст], найденного по XPath: {xPath}")
        public void textOutput(WebDriver driver, String xPath, String expected){
            Assert.assertEquals("Значение контрола [Текст] не соответствует ожиданию", expected, driver.findElement(By.xpath(xPath)).getText());
        }

        /**Метод для проверки свойства контрола controlType
         * @param controlName Имя/обозначение контрола для удобства тестировщика
         * @param property Проверяемое свойство
         * @param expected Ожидаемое значение*/
        @Step("Проверка соответствия ожидаемого и реального свойства {property} контрола {controlName}")
        public void elementProperty(String controlName, WebDriver driver, String xPath, String property, String expected){
            Assert.assertEquals("Значение свойства ["+property+"] контрола ["+controlName+"] не соответствует ожиданию", expected, driver.findElement(By.xpath(xPath)).getAttribute(property));
        }

        /**Метод для проверки свойства стиля контрола controlType
         * @param controlName Имя/обозначение контрола для удобства тестировщика
         * @param property Проверяемое свойство
         * @param expected Ожидаемое значение*/
        @Step("Проверка соответствия ожидаемого и реального CSS свойства {property} контрола {controlName}")
        public void elementCSSProperty(String controlName, WebDriver driver, String xPath, String property, String expected){
            Assert.assertEquals("Значение свойства стиля (CSS) ["+property+"] контрола ["+controlName+"] не соответствует ожиданию", expected, driver.findElement(By.xpath(xPath)).getCssValue(property));
        }

        /**Метод для проверки соответствия ожидаемого и реального скриншотов
         * @param tolerance Погрешность сравнения скриншотов, число пикселей
         * @param pathToActualShot Путь до папки с актуальным скриншотом
         * @param pathToExpectedShot Путь до папки с эталонным скриншотом
         * @param pathToSaveMarkedShot Путь, куда класть png-репорты сравнения
         * @param pathToSaveGif Путь, куда класть gif-репорты
         * @param actualShotName Имя файла со скриншотом реальной ситуации без формата
         * @param expectedShotName Имя файла со скриншотом эталона без формата
         * @param reportName Имена gif и png создаваемых при несовпадении скриншотов*/
        @Step("Проверка соответствия ожидаемого и реального скриншотов")
        public void screenshots(WebDriver driver, Screenshot expectedShot, Screenshot actualShot, int tolerance, String pathToExpectedShot, String expectedShotName, String pathToActualShot, String actualShotName, String pathToSaveMarkedShot, String pathToSaveGif, String reportName){
            ImageDiff difference = new ImageDiffer().makeDiff(expectedShot, actualShot);
            if (difference.getDiffSize()>tolerance) {
                action.saveImage(difference.getMarkedImage(), pathToSaveMarkedShot, reportName+".png");
                String[] paths = {pathToExpectedShot+"/"+expectedShotName+".png",
                        pathToActualShot+"/"+actualShotName+".png",
                        pathToSaveMarkedShot+"/"+reportName+".png"};
                action.makeGif(paths, pathToSaveGif, reportName+".gif");
                try{
                    action.getBytes(pathToSaveGif+"/"+ reportName +".gif");
                } catch (Exception er) {er.printStackTrace();}
            }
            else {
                try{
                    action.getBytes(pathToActualShot+"/"+ actualShotName +".png");
                } catch (Exception er) {er.printStackTrace();}
            }
            Assert.assertTrue("Отличия в скриншотах превышают допустимую погрешность", difference.getDiffSize()<=tolerance);
        }

        @Step("Стандартный screenshot-based тест элемента, найденного по XPath: {xPath}")
        public void screenshotBasedTest (WebDriver driver, String pathToSaveFiles, String fileName, String xPath) {
            Screenshot actual = action.takeScreenshot(driver, xPath);
            action.createDirectory (pathToSaveFiles+"/Actual");
            action.saveImage(actual.getImage(), pathToSaveFiles+"/Actual", fileName+".png");
            File testScreen = new File(pathToSaveFiles+"/Expected/"+fileName+".png");
            if (!testScreen.exists()){
                action.addNewEthalon(actual, pathToSaveFiles, fileName);
                return;
            }
            Screenshot expected = action.readImage(pathToSaveFiles+"/Expected", fileName+".png");
            screenshots(driver, expected, actual, 50, pathToSaveFiles+"/Expected", fileName, pathToSaveFiles+"/Actual", fileName, pathToSaveFiles+"/MarkedImages", pathToSaveFiles+"/ReportGIF", fileName);
        }

        @Step("Стандартный screenshot-based тест страницы")
        public void screenshotBasedTest (WebDriver driver, String pathToSaveFiles, String fileName) {
            Screenshot actual = action.takeScreenshot(driver);
            action.createDirectory (pathToSaveFiles+"/Actual");
            action.saveImage(actual.getImage(), pathToSaveFiles+"/Actual", fileName+".png");
            File testScreen = new File(pathToSaveFiles+"/Expected/"+fileName+".png");
            if (!testScreen.exists()){
                action.addNewEthalon(actual, pathToSaveFiles, fileName);
                return;
            }
            Screenshot expected = action.readImage(pathToSaveFiles+"/Expected", fileName+".png");
            screenshots(driver, expected, actual, 50, pathToSaveFiles+"/Expected", fileName, pathToSaveFiles+"/Actual", fileName, pathToSaveFiles+"/MarkedImages", pathToSaveFiles+"/ReportGIF", fileName);
        }
    }
}
