package test.Selenium_Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshottask {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		// take screenshot interface
		
		// get screenshot method
		
		File src= (File)driver.getScreenshotAs(OutputType.FILE);
		
		// path of screenshot 
		
		File dest=new File("C:\\Users\\aksha\\git\\automation\\Selenium_Automation\\screenshots\\myntra.png");
		
		Files.copy(src, dest);
		
		// logo and other single screenshot 
		
		driver.navigate().to("https://beardo.in/");
		
		WebElement logo=driver.findElement(By.className("header__logo-img"));
		
		File src1=logo.getScreenshotAs(OutputType.FILE);
		
		File dest1=new File("C:\\Users\\aksha\\git\\automation\\Selenium_Automation\\screenshots\\beardo logo.png");
		
		Files.copy(src1, dest1);
		
		
		
		
		
	}

}
