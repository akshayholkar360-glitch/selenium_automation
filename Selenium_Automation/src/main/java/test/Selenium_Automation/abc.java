package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/register");
		
		//1. xpath: //tagname[@attribute='value'];
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abhay");
		driver.findElement(By.xpath("//input[@id = 'lastname']")).sendKeys("abhay123");
		
		//2. xpath://parentname/childtagname
		// driver.findElement(By.xpath("//div/input")).sendkeys("abhay123");
		
		//3.xpath://tagname([@attribute='value' and @attribute='value']
		
		driver.findElement(By.xpath("//input[@type='text' and @id ='userName']")).sendKeys("abhay123@gmail.com");
		
		driver.findElement(By.xpath("//input[@id ='password' and @type='password']")).sendKeys("abhay@1234");
		
		driver.findElement(By.xpath("//button[@type ='button' and @id = 'register']")).click();

}
}