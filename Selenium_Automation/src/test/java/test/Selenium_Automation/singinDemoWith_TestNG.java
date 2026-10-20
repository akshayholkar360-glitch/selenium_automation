package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class singinDemoWith_TestNG {
			static ChromeDriver driver;
			
			@Test
			void demolaunch()
			{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/SignIn.html");
			}
			@Test
			void entercredentails()
			{
			driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("Akshay1@gmail.com");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		    }
			
			@Test
			static void pressbutton()
		    {
			driver.findElement(By.id("enterbtn")).click();
		    }
	}


