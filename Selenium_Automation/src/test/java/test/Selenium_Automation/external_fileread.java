package test.Selenium_Automation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class external_fileread {
	@Test 
	void filereadtest() throws IOException, InterruptedException {
		// used for file reading
		FileReader fr =new FileReader("C:\\Users\\aksha\\git\\automation\\Selenium_Automation\\base.properties");
		// used to load file properties reading
		Properties pr = new Properties();
		pr.load(fr);
		
		ChromeDriver driver= new ChromeDriver();
		driver.get(pr.getProperty("flipkart"));
		Thread.sleep(1000);
		driver.close();
		
	}
}
