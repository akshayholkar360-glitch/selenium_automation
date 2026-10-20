package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Task {
	
	static ChromeDriver driver;
	@Test
	void sitelaunch()
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		}
	@Test
	void sel()
	{
		driver.findElement(By.xpath("//option[@value='yellow']")).click();
	}
	


		
}

