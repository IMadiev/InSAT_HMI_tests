package testingTools;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InsatWebRecorder {

    private final String PATH = System.getProperty("user.dir")+"/TEMP";

    ImageOutputStream output;
    GifSequenceWriter writer;

    public void start(WebDriver driver){
        File tempDirectory = new File(PATH);
        if (tempDirectory.exists()) {
            try {
                FileUtils.deleteDirectory(new File(PATH));
            } catch (IOException er) {er.printStackTrace();}
        }
        createDirectory(PATH);
        Screenshot temp = takeScreenshot(driver);
        try{
            output = new FileImageOutputStream(new File(PATH + "/temp.gif"));
            writer = new GifSequenceWriter(output, temp.getImage().getType(), 1000, true);
            writer.writeToSequence(temp.getImage());
        } catch (IOException er) {er.printStackTrace();}
    }

    public void stop() {
        try {
            writer.close();
            output.close();
            getBytes(PATH+"/temp.gif");
            FileUtils.deleteDirectory(new File(PATH));
        } catch (IOException er){er.printStackTrace();}
    }

    public void addShot(WebDriver driver){
        Screenshot temp = takeScreenshot(driver);
        try{
            writer.writeToSequence(temp.getImage());
        } catch (IOException er) {er.printStackTrace();}
    }

    /**Добавить файл к баг-репорту*/
    @Attachment(value = "Приложение")
    public byte[] getBytes(String path) throws IOException {
        return Files.readAllBytes(Paths.get(path));
    }

    public Screenshot takeScreenshot(WebDriver driver)
    {
        Screenshot shot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver);
        return shot;
    }

    public void createDirectory(String path)
    {
        File testScreen = new File(path);
        if (!testScreen.exists()) {
            try {
                Files.createDirectories(Paths.get(path));
            } catch (IOException er) {er.printStackTrace();}
        }
    }
}
