package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("akshay");
	}

}
