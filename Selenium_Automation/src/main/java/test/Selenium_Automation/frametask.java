package test.Selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frametask {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
	
		driver.findElement(By.cssSelector("[class='analystic'][href='#Multiple']")).click();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akshay");
	}

}
