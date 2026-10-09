package test.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {
public static void main(String args[]) throws InterruptedException
{
	// set properties of webdriver
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\eclipse-workspace\\Selenium_Automation\\DriverResourses\\chromedriver.exe");
	System.out.println("1. webdriver configuration done !");
	
	// create a object of a chromedriver/intislize chromedriver .
	ChromeDriver driver=new ChromeDriver();
	System.out.println("2.Initialize ChromeDriver");
	driver.get("https://www.myntra.com/");
	Thread.sleep(1000);
	driver.close();
}
}  
 