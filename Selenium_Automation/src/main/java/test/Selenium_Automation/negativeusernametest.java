package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class negativeusernametest {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("incorrectUser ");
		
		driver.findElement(By.id("password")).sendKeys("Password123 ");
		
		driver.findElement(By.id("submit")).click();		
	}

}
