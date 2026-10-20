package test.Selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alerts_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		// All alerts
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(1000);
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(1000);
		Alert al2=driver.switchTo().alert();
		al2.accept();
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(1000);
		Alert al3=driver.switchTo().alert();
		al3.dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Thread.sleep(1000);
		Alert al4=driver.switchTo().alert();
		Thread.sleep(1000);
		al4.sendKeys("akshay");
		Thread.sleep(1000);
		al4.accept();
		
		// drag and drop
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions ac=new Actions(driver);
		
		ac.dragAndDrop(drag, drop).build().perform();
		
		// slider bar move X to Y and Y to X
		
		WebElement ls=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		
		Actions a5=new Actions(driver);
		
		a5.dragAndDropBy(ls, 80, 0).build().perform();
		
		WebElement rs=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		
		Actions a6=new Actions(driver);
		
		a5.dragAndDropBy(rs, 0, 80).build().perform();
		
	}

}
