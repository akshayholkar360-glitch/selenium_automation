package test.Selenium_Automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brocken_links {




	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> blinks=driver.findElements(By.partialLinkText("Errorcode"));
		
		for(int i=0;i<blinks.size();i++)
		{
			WebElement l=blinks.get(i);
			System.out.println(l.getText());
			Thread.sleep(1000);
		}
	}
	}

