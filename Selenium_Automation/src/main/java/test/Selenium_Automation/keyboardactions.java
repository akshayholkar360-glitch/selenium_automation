package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class keyboardactions {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement search= driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		search.sendKeys("Mobile");
		
		// for press Enter button of keyboard
		
		search.sendKeys(Keys.ENTER);
		
		// for copy - paste method from keyboard
		
		WebElement name= driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Akshay");
		
		// for select
		
		name.sendKeys(Keys.CONTROL+"A"); 
		//for copy name
		
		name.sendKeys(Keys.CONTROL+"C");
		
		// for paste create a webelement where to paste 
		
		WebElement last=driver.findElement(By.xpath("//input[@id='email']"));
		
		//for paste name in last
		
		last.sendKeys(Keys.CONTROL+"V");
	}

}
