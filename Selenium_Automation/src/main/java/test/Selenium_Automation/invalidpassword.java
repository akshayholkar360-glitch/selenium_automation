package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidpassword {

	public static void main(String[] args) throws InterruptedException {
			
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("student ");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("incorrectPassword ");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("submit")).click();
	}
}
