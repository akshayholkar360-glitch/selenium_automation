package test.Selenium_Automation;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newtab_new_window_handle {

	public static void main(String[] args) {
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			System.out.println("current url of site"+driver.getCurrentUrl());
			
			//for open new tab
			
			driver.switchTo().newWindow(WindowType.TAB);
			
			// to navigate new tab 
			
			driver.navigate().to("https://www.cravitaindia.com/");
			
			driver.close();
			
			EdgeDriver driver1=new EdgeDriver();
			driver1.get("https://demo.automationtesting.in/Register.html"); 
			
			// close all windows of drivers and browser
			
			driver.quit(); // firefox driver
			
			driver1.quit(); // edge driver
	}

}
