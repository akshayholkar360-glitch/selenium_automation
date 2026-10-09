package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.facebook.com/login.php/");
		Thread.sleep(1000);
		
		//find out the email textbox
		
		driver.findElement(By.id("email")).sendKeys("akshay1213@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("123654987");
		
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
