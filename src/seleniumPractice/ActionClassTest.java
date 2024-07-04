package seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTest {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Actions act = new Actions(driver);
		WebElement t = driver.findElement(By.xpath(""));
		act.dragAndDrop(t, t);		
		Robot bot =new Robot();
		//bot.keyPress(Keys.ADD);

	}
}
