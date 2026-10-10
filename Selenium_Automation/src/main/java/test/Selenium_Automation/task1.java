package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Name'and @id='name']")).sendKeys("Aditya Joshi");
		
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Aditya123@gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'phone' or @placeholder='Enter Phone']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//div/textarea")).sendKeys("At Post Shivaji Nagar, Pune");
		
		driver.findElement(By.xpath("//input[@id ='male']")).click();
		
		// handling multiple webelements
		
		List
		
	}
}


