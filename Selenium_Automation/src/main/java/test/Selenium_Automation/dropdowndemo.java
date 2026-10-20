package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Select sel=new Select(driver.findElement(By.id("country")));
		
		sel.selectByVisibleText("India");
	}

}
