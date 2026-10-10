package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class cssSELECTORS {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// cssselectors=tagname[attribute='value'].sendkey();
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Aditya Joshi");
		
		driver.findElement(By.cssSelector("input[id = 'email']")).sendKeys("Aditya123@gmail.com");
		
		Select sel=new Select(driver.findElement(By.id("country")));
		
		sel.selectByValue("india");
	}

}
