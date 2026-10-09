package test.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class basicautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open website on chrome browser
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		//to jump another website
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(1000);
		
		//to click on back button
		driver.navigate().back();
		Thread.sleep(1000);
		
		//to click forward button
		driver.navigate().forward();
		Thread.sleep(1000);
		
		// to click refresh button
		driver.navigate().refresh();
	}

}
