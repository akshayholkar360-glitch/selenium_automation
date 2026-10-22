package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file_demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// single file upload
		
		WebElement el=driver.findElement(By.id("singleFileInput"));
		el.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\1st test case.png");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		// multiple file upload
		
		WebElement el2=driver.findElement(By.id("multipleFilesInput"));
		el2.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 194840.png"+"\n"+"C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 234210.png");
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		//		Thread.sleep(1000);
//		el2.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 234210.png");
//		driver.findElement(By.id("multipleFilesForm")).click();
	}

}
