package Selenium4Features;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsDemo {
	@Test
	public void testLocators() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement nameBox = driver.findElement(By.xpath("//input[@name='name']"));
		String str = driver.findElement(with(By.tagName("label")).above(nameBox)).getText();
		System.out.println(str);
	}
}
