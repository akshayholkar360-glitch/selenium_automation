package parallel_testing;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class test2 {

	
	@Test
		public void testing2() {	
			EdgeDriver driver = new EdgeDriver();
		driver.get("https://smartbear.com/learn/automated-testing/test-automation-frameworks/");
		
			System.out.println("this is test  block:"+ Thread.currentThread().getId());
		}
	}
