package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class footer_links {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");


		driver.findElement(By.linkText("Hidden Elements & AJAX")).click();

		driver.navigate().back();
	}
}
