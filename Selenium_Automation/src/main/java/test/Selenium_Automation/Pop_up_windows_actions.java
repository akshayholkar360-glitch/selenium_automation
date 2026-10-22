package test.Selenium_Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_windows_actions {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        
	        // open link
	        
	        driver.get("https://testautomationpractice.blogspot.com/");
	        System.out.println("url is : "+ driver.getTitle());
	        
	        // Main window ID

	        String parent = driver.getWindowHandle();
	        
	        driver.findElement(By.id("PopUp")).click();
	        
	        Thread.sleep(2000);
	        
	        Set<String> windows = driver.getWindowHandles();
	        
	        List<String> tabs = new ArrayList<>(windows);
	        
	        // First new window
	        driver.switchTo().window(tabs.get(1));
	        System.out.println(driver.getTitle());
	        driver.close();
	        
	        Thread.sleep(2000);

	        
	     // Second new window
	        driver.switchTo().window(tabs.get(2));
	        System.out.println(driver.getTitle());
	        driver.close();
	        
	        Thread.sleep(2000);

	        
	     // Return to main window
	        driver.switchTo().window(parent);



	}

}
