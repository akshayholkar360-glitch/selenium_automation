package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class shodow_dom {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		// shadowdom
		SearchContext shadow = driver.findElement(By.id("shadow_host")).getShadowRoot();

		WebElement blog = shadow.findElement(By.linkText("Blog"));
		// blog.click();
		// click on blog
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", blog);

	}
}
