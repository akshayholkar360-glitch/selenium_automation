package test.Selenium_Automation.Conceptsof_Listener;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(test.Selenium_Automation.Conceptsof_Listener.Lisiner_script.class)
public class OrangeHRM {

	ChromeDriver driver;
	@Test(priority=1)
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Test(priority=2 ,retryAnalyzer=Lisiner_script.class)
	void verify_launch()
	{
		String actual=driver.getCurrentUrl();
		String Expect="https://opensource-demo.orangehrmlive.com/web/index.php/auth/";
		
		Assert.assertEquals(actual, Expect ,"URL not match");
		
	}
	@Test(priority=3)
	void login() throws InterruptedException
	{
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin3");
		
		Thread.sleep(1000);
		//click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		String e_url="dashboardurl.com";
		String A_url=driver.getCurrentUrl();
		Assert.assertEquals(A_url, e_url);
		
	}
	
	@Test(dependsOnMethods= {"login"})
	void logout()
	{
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		System.out.println("current URL:"+driver.getCurrentUrl());
		
	}
	
	
	
	
	
}