package test.Selenium_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestNG_Task1 {

	static ChromeDriver driver;
	@Test
	void launch() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");	
	}
	@Test
	void sel() {
			
		driver.findElement(By.xpath("(//option[@value='white'])")).click();
		driver.findElement(By.xpath("(//option[@value='cheetah'])")).click();
	}
	
	void date()
	{
		driver.findElement(By.id("id")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover' and [text='14']]")).click();
		
	}
} 