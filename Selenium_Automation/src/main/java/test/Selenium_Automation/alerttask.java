package test.Selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alerttask {

	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			// for ok alert
			
			driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();

			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("button[onclick='alertbox()'][class='btn btn-danger']")).click();
			Thread.sleep(3000);
			
			Alert al=driver.switchTo().alert();
			
			al.accept();
			
			//for Alert with OK & Cancel
			
			driver.findElement(By.cssSelector("a.analystic[href='#CancelTab']")).click();
			
			driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			
			Alert al1=driver.switchTo().alert();
			
			Thread.sleep(2000);
			
			al1.accept();
			
			//for cancel
			
			driver.findElement(By.cssSelector("a.analystic[href='#CancelTab']")).click();
			
			driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			
			Alert al2=driver.switchTo().alert();
			
			Thread.sleep(2000);
			
			al2.dismiss();
			
			Thread.sleep(2000);

			
			//for Alert with text box
			
			driver.findElement(By.cssSelector("a[href='#Textbox'][class='analystic']")).click();
			
			driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
			
			Alert al3=driver.switchTo().alert();
			
			Thread.sleep(2000);

			
			al3.sendKeys("akshay holkar");
			Thread.sleep(2000);

			
			al3.accept();
			
			Thread.sleep(2000);

			
			// for move to Interactions 
			
			driver.findElement(By.cssSelector(".dropdown-toggle[href='Interactions.html']")).click();
			
			Thread.sleep(2000);

			
			driver.findElement(By.cssSelector("ul[class='dropdown-menu'] a[class='dropdown-toggle']")).click();
			
			Thread.sleep(2000);

			
			driver.findElement(By.cssSelector("a[href='Static.html'][style='color: white']")).click();
			
			Thread.sleep(2000);

			
			
			// for drag element
			
	        WebElement drag= driver.findElement(By.id("angular"));
	        
			Thread.sleep(2000);

	        
	        // for drop element
	        
	        WebElement drop= driver.findElement(By.id("droparea"));
	        
			Thread.sleep(2000);

	        
	        // for action
	        
	        Actions ac=new Actions(driver);
	        
	        ac.dragAndDrop(drag, drop).build().perform();
	        
			

	        
	        
	        // for second drag element
	        
	        WebElement drag1= driver.findElement(By.id("mongo"));
	        
			

	        
	        // for second element drop
	        
	        WebElement drop1= driver.findElement(By.id("droparea"));
	        
			

	        
	        // for action 2
	        
	        Actions ac1=new Actions(driver);
	        ac1.dragAndDrop(drag1, drop1).build().perform();
	        
			Thread.sleep(2000);

	        
	        //for element 3 drag
	        
	        WebElement drag2=driver.findElement(By.id("node"));
	        
			Thread.sleep(2000);

	        
	        //for drop element 3
	        
	        WebElement drop2=driver.findElement(By.id("droparea"));
	        
			Thread.sleep(2000);

	        
	        // for action 3
	        
	        Actions ac2=new Actions(driver);
	        ac2.dragAndDrop(drag2, drop2).build().perform();
	        
	       // for move to Interactions 
			
	       driver.findElement(By.cssSelector(".dropdown-toggle[href='Interactions.html']")).click();
	     			

	     			
	     	driver.findElement(By.cssSelector("ul[class='dropdown-menu'] a[class='dropdown-toggle']")).click();
	     			
	     	
			driver.findElement(By.cssSelector("a[href='Dynamic.html'][style='color: white']")).click();
			
			
			// for drag element
			
	        WebElement drag3= driver.findElement(By.id("angular"));
	        
			
            // for drop element dynamic 1
	        
	        WebElement drop3= driver.findElement(By.id("droparea"));
	        
			
			// for actions 
			
			Actions ac3=new Actions(driver);
			
			ac3.dragAndDrop(drag3, drop3).build().perform();
			

			
            // for drop element dynamic 2
			
	        WebElement drag4= driver.findElement(By.id("mongo"));
	        

	        
	        // for drop element 2
	        
	        WebElement drop4= driver.findElement(By.id("droparea"));
	        

	        
	        // for actions 2
	        
	        Actions ac4=new Actions(driver);
	        
	        ac4.dragAndDrop(drag4, drop4).build().perform();
	        

	        
	        // for drag element 3 dynamic
	        
	        WebElement drag5= driver.findElement(By.id("node"));
	        

	        
	        // for drop element
	        
	        WebElement drop5=driver.findElement(By.id("droparea"));
	        

	        
	        // for actions 
	        
	        Actions ac5=new Actions(driver);
	        
	        ac5.dragAndDrop(drag5, drop5).build().perform();
	        
	        
	        
	        driver.close();
	        
	        

	        

	        

			
			

			
			


	        
	        


			


			
			
			
			

			
			
	        
	     
	        


	}

}
