package seleniumPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotAndPropertyFile {
	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		File fis = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fis, new File("/f.png"));
//---------------------------------------------------------------------------------//
		FileInputStream fise=new FileInputStream(fis);
		Properties prop=new Properties();
		prop.load(fise);
		String value=prop.getProperty("kails");
		System.out.println(value);
	}
}
