package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FIndDuplicateusingSet {

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 44, 44, 3 };
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(a));
		Set<Integer> linkedHs = new HashSet<Integer>(numbers);
		System.out.println(linkedHs);
		WebDriver driver = new ChromeDriver();
		WebElement ele = driver.findElement(By.xpath(""));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
}
