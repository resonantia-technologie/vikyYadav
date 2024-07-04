package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotDemo {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		File fis = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fis,new File("/dsd"));
		System.out.println("Screenshot done successfully");
	}
}
