package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderevents {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
//		
//		WebElement ls= driver.findElement(By.xpath("//span[@style='left: 15%;']"));
//		
//		Actions ac=new Actions(driver);
//		 ac.dragAndDropBy(ls, 10, 50).build().perform();
	
		 WebElement rs= driver.findElement(By.xpath("//span[@style='left: 60%;']"));
		 
		 Actions ac1=new Actions(driver);
		 
		 ac1.dragAndDropBy(rs, 0, 100).build().perform();
	
	
	}

}
