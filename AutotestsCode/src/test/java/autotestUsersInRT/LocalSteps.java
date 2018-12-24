package autotestUsersInRT;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingTools.InsatWebRecorder;
import testingTools.InsatWebUITools;

public class LocalSteps {
    InsatWebUITools tester = new InsatWebUITools();

    public static final String LOGIN_XPATH = "//*[@id='login']";
    public static final String PASSWORD_XPATH = "//*[@id='password']";

    @Step ("Ожидание исчезновения прелоадера на странице")
    public void waitPreloader(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, ' preloader')]")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@class, ' preloader')]")));
        tester.action.wait(2000);
    }


    @Step ("Создать пользователя {login} с паролем {password} в группе {group}")
    public void createUser(WebDriver driver, String login, String password, String group, InsatWebRecorder recorder){
        tester.action.wait(driver, "//*[@data-control-id='58976']");
        tester.set.textInput(driver, "//*[@data-control-id='58976']", login);
        tester.action.wait(driver, "//*[@data-control-id='58848']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.set.textInput(driver, "//*[@data-control-id='59002']", password);
        tester.action.wait(driver, "//*[@data-control-id='58848']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.set.textInput(driver, "//*[@data-control-id='60972']", group);
        tester.action.wait(driver, "//*[@data-control-id='58848']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(driver, "//*[@data-control-id='59040']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='59040']");
        tester.action.wait(1000);
        recorder.addShot(driver);
    }

    public void deleteTrash(WebDriver driver, String login){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8043/1/index.html");
        tester.action.loginAs(driver, "ARamazanova", "");
        waitPreloader(driver);
        tester.action.wait(driver, "//*[@data-control-id='59072']");
        tester.set.textInput(driver, "//*[@data-control-id='59072']", login);
        tester.action.wait(driver, "//*[@data-control-id='58848']");
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(driver, "//*[@data-control-id='59869']");
        tester.event.click(driver, "//*[@data-control-id='59869']");
        tester.action.wait(1000);
        driver.quit();
    }

    @Step ("Проверка недоступности контролов")
    public void checkInaccessibility (WebDriver driver, InsatWebRecorder recorder){
        recorder.addShot(driver);
        tester.check.elementProperty("Текстовый ввод", driver, "//*[@data-control-id='58976']", "disabled", "true");
        tester.check.elementProperty("Текст", driver, "//*[@data-control-id='58848']", "disabled", "true");
        tester.check.elementProperty("Кнопка", driver, "//*[@data-control-id='59040']", "disabled", "true");
    }

    @Step ("Проверка доступности контролов")
    public void checkAccessibility (WebDriver driver, InsatWebRecorder recorder){
        recorder.addShot(driver);
        tester.check.elementProperty("Текстовый ввод", driver, "//*[@data-control-id='58976']", "disabled", null);
        tester.check.elementProperty("Текст", driver, "//*[@data-control-id='58848']", "disabled", null);
        tester.check.elementProperty("Кнопка", driver, "//*[@data-control-id='59040']", "disabled", null);
    }

    @Step ("Проверка наличия пользователя в выпадающем списке логина и попытка войти. Проверка применения прав группы")
    public void checkUserExist(WebDriver driver, String login, String password, String group, InsatWebRecorder recorder){
        tester.action.wait(driver, LOGIN_XPATH);
        Select selectElement = new Select(driver.findElement(By.xpath(LOGIN_XPATH)));
        recorder.addShot(driver);
        try {
            selectElement.selectByValue(login);
            recorder.addShot(driver);
        } catch (Exception er) {Assert.assertTrue("Выпадающий список не содержит пользователя "+login, false);}
        tester.action.loginAs(driver, login, password);
        recorder.addShot(driver);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-control-id='58976']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-control-id='58976']")));
        if (group=="Разрешить") {
            checkAccessibility(driver, recorder);
        } else if (group=="Подтверждение") {
            checkAccessibility(driver, recorder);
            driver.findElement(By.xpath("//*[@data-control-id='59072']")).sendKeys("login"+ Keys.ENTER);
            tester.action.wait(2000);
            try {
                driver.findElement(By.xpath("//*[contains(@class, 'ui-dialog')]"));
            } catch (Exception er) {
                Assert.assertEquals("Не появилось окно подтверждения управления, хотя это подразумевалось группой", "Exist", "None");
            }
        } else {
            checkInaccessibility(driver,recorder);
        }
    }

    @Step("Удаление пользователя [{login}]")
    public void deleteUser(WebDriver driver, String login, InsatWebRecorder recorder){
        tester.action.wait(driver, "//*[@data-control-id='59072']");
        tester.set.textInput(driver, "//*[@data-control-id='59072']", login);
        tester.action.wait(driver, "//*[@data-control-id='58848']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(driver, "//*[@data-control-id='59869']");
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='59869']");
        tester.action.wait(1000);
        recorder.addShot(driver);
    }

    @Step ("Проверка отсутствия пользователя в выпадающем списке логина")
    public void checkUserDelete(WebDriver driver, String login, InsatWebRecorder recorder){
        tester.action.wait(driver, LOGIN_XPATH);
        Select selectElement = new Select(driver.findElement(By.xpath(LOGIN_XPATH)));
        recorder.addShot(driver);
        try {
            selectElement.selectByValue(login);
            recorder.addShot(driver);
            Assert.assertTrue("Выпадающий список содержит пользователя "+login+" после его удаления", false);
        } catch (Exception er) { }
    }

    @Step ("Переименовать пользователя [{name}] в [{newName}]")
    public void renameUser (WebDriver driver, String name, String newName, InsatWebRecorder recorder){
        tester.action.wait(driver, "//*[@data-control-id='59605']");
        tester.set.textInput(driver, "//*[@data-control-id='59605']", name);
        tester.action.wait(driver, "//*[@data-control-id='59621']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='59621']", newName);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='59711']");
        tester.action.wait(1000);
        recorder.addShot(driver);
    }

    @Step ("Сменить пароль пользователя [{name}] на [{password}]")
    public void changePassword (WebDriver driver, String name, String password, InsatWebRecorder recorder){
        tester.action.wait(driver, "//*[@data-control-id='59250']");
        tester.set.textInput(driver, "//*[@data-control-id='59250']", name);
        tester.action.wait(driver, "//*[@data-control-id='59264']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='59264']", password);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='59309']");
        tester.action.wait(1000);
        recorder.addShot(driver);
    }


    @Step ("Установить пользователю {login} группы {groups}")
    public void setGroups (WebDriver driver, String login, String groups, InsatWebRecorder recorder) {
        tester.action.wait(driver, "//*[@data-control-id='59357']");
        tester.set.textInput(driver, "//*[@data-control-id='59357']", login);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(driver, "//*[@data-control-id='59371']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='59371']", groups);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(driver, "//*[@data-control-id='59403']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='59403']");
        tester.action.wait(1000);
        recorder.addShot(driver);
    }

    @Step ("Проверка списка групп пользователя {login}")
    public void checkGroups (WebDriver driver, String login, String delimeter, String expected, InsatWebRecorder recorder){
        tester.action.wait(driver, "//*[@data-control-id='59505']");
        tester.set.textInput(driver, "//*[@data-control-id='59505']", login);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(driver, "//*[@data-control-id='59521']");
        recorder.addShot(driver);
        tester.set.textInput(driver, "//*[@data-control-id='59521']", delimeter);
        tester.event.click(driver, "//*[@data-control-id='58848']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.event.click(driver, "//*[@data-control-id='59552']");
        tester.action.wait(1000);
        recorder.addShot(driver);
        tester.check.textOutput(driver, "//*[@data-control-id='59537']", expected);
    }
}
