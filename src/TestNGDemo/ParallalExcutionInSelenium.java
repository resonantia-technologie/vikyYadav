package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallalExcutionInSelenium {
	@Test(threadPoolSize = 5)
	@Parameters("browser")
	public void selectAndOpenBrowser(String browser) {
		WebDriver driver;
		switch (browser) {
		case "chrome":
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();
		default:
			System.err.println("Invalid browsers:");
			break;
		}

	}
}
