package test.Selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orengehrmdemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		// for waiting load the website
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//
		
		
		
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Thread.sleep(3000); //it is a static 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //it is a dynamic

			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.className("oxd-userdropdown-tab")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/web/index.php/auth/logout']")));
			ele.click();
			
			Thread.sleep(3000);
			driver.close();
			
			
		}
		}
	
