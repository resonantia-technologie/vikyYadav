package seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemoTakesScreenshot {

	public void takeShotFromSelenium() {
		try {

			WebDriver driver = new ChromeDriver();
			File fileSHot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fileSHot, new File("//screenshot.png"));
			System.out.println("Screenshot captured successfully");
			
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}

	public String getPropertyFromFile(String key) {
		String value = "";
		Properties prop = null;
		try {
			FileInputStream fis = new FileInputStream(".//Test.properties");
			prop= new Properties();
			prop.load(fis);
			

		} catch (Exception e) {
			System.out.println("CHeck FIle path or check the key is present or not");
		}
		return value = prop.getProperty(key);	}

}
