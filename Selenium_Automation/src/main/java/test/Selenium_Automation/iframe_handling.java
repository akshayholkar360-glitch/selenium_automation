package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_handling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		// iframe
		// 1.index
		// 2.idorname
		// 3webelement
		// driver.switchTo().frame(0);
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Pratiksha");

	}
}
