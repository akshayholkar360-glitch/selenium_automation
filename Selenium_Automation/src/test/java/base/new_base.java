package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class new_base {

	public class loginbase {
		
		 public WebDriver dr;
		
		 @BeforeMethod
		 
		 public void setup() {
			 dr =new EdgeDriver();
			 dr.get("https://testautomationpractice.blogspot.com/");
		 }
		 @AfterMethod
		 
		 public void closeDriver()
		 {
			 if(dr!=null) {
				 dr.close();
			 }
			 dr.close();
		 }
	}
}
