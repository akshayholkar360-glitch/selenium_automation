package test.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class sliderevents {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	}

}
