package seleniumPractice;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinkFromPage {
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://indianexpress.com/todays-paper/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link	: links) {
			String url=link.getAttribute("href");
			if(url!=null && !url.isEmpty()) {
				HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
				connection.connect();
				int responseCode=connection.getResponseCode();
				if(responseCode>=200 && responseCode<=400) {
					System.out.println(url+": is valid");
				}
				else
					System.out.println(url+" Broken url url: "+responseCode	);
			}
		}
	
	}
}
