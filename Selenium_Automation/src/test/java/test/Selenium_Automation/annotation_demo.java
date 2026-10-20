package test.Selenium_Automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation_demo {
	@AfterTest
	public void name()
	{
		System.out.println("akshay");
	}
	@Test
	public void surname()
	{
		System.out.println("holkar");
	}
	@BeforeTest
	public void fullname()
	{
		System.out.println("akshay holkar");
	}
}
