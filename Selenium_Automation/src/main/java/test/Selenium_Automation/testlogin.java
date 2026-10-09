package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlogin {

	public static void main(String[] args) {

			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			driver.findElement(By.id("username")).sendKeys("student");
			
			driver.findElement(By.id("password")).sendKeys("Password123");
			
			driver.findElement(By.id("submit")).click();
			
			// to verify that new page url contains practicetestautomation.com /log in successfully 
			
			System.out.println("URL after login"+driver.getCurrentUrl());
			
			// to verify that new page contains expected text (congratulations or successfully login )
			WebElement greet_text=driver.findElement(By.tagName("strong"));
			System.out.println("Greet Text after login"+greet_text.getTagName());
			
			//to verify that button log out is displayed on the new page
			
			WebElement islogout=driver.findElement(By.linkText("Log out"));
			System.out.println("Logout text:"+islogout.getText());
			
			
			
			
	}

}
