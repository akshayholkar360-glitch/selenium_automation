package test.Selenium_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class automation_task_ {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("(//option[@value='white'])")).click();
		driver.findElement(By.xpath("(//option[@value='cheetah'])")).click();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		driver.findElement(By.id("txtDate")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		sel.selectByVisibleText("Jan");
		
		Select sel2=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		sel2.selectByVisibleText("2027");
		driver.findElement(By.xpath("//a[text()='10' and @class='ui-state-default']")).click();
		
		WebElement el= driver.findElement(By.id("start-date"));
		
		el.sendKeys("01/01/2027");

		WebElement el2= driver.findElement(By.id("end-date"));
		el2.sendKeys("31/03/2027");
		driver.findElement(By.xpath("//button[@onclick='calculateRange()']")).click();
		
		//copy and paste keyboard actions
		
		WebElement el3=driver.findElement(By.id("field1"));
		
		el3.sendKeys(Keys.CONTROL+"A");
		el3.sendKeys(Keys.CONTROL+"C");
		
		WebElement el4=driver.findElement(By.id("field2"));
		
		el4.sendKeys(Keys.CONTROL+"V");
		
		// double click
		
		WebElement el5=driver.findElement(By.xpath("//h2[text()='Double Click']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(el5).build().perform();
		
	// single file upload
		
		WebElement el6=driver.findElement(By.id("singleFileInput"));
		el6.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\1st test case.png");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		// multiple file upload
		
		WebElement el7=driver.findElement(By.id("multipleFilesInput"));
		el7.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 194840.png"+"\n"+"C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 234210.png");
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		
		System.out.println("total rows :"+ rows.size());
}
}
