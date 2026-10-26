package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class login_base {
	

	public class loginbase {
		
		 public WebDriver d;
		
		 @BeforeMethod
		 
		 public void setup() {
			 d =new EdgeDriver();
			 d.get("https://practicetestautomation.com/practice-test-login/");
		 }
		 @AfterMethod
		 
		 public void closeDriver()
		 {
			 if(d!=null) {
				 d.close();
			 }
			 d.close();
		 }

	}

}
