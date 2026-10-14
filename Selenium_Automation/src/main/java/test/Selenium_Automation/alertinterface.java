package test.Selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertinterface {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.cssSelector("button[id='promptBtn']")).click();
		
		//for enter a name in pop up window
		
		Alert al = driver.switchTo().alert();

        al.sendKeys("akshay holkar");

        al.accept();
        
        //simple alert
        
//        driver.findElement(By.cssSelector("button[id='alertBtn']")).click();
//        
//        Alert al2= driver.switchTo().alert();
        
        //drag
        
        WebElement drag= driver.findElement(By.id("draggable"));
        
        //drop
        
        WebElement drop= driver.findElement(By.id("droppable"));
        
        //Action class
        
        Actions ac= new Actions(driver);
        
        ac.dragAndDrop(drag, drop).build().perform();
        
        
	}

}
