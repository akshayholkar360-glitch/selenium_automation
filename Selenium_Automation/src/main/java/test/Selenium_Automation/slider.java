package test.Selenium_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class slider {

	

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//left slider
		WebElement leftslider=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(leftslider, 80, 0).build().perform();
		
		//Right slider
	}
	}

