package test.Selenium_Automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation_newmethods {
	@AfterMethod
	public void name()
	{
		System.out.println("akshay");
	}
	@Test
	public void town()
	{
		System.out.println("bhoom");
	}
	@BeforeMethod
	public void dist()
	{
		System.out.println("dharashiv");
	}
}
