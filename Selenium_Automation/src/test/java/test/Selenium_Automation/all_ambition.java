package test.Selenium_Automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class all_ambition {
	@AfterSuite					//9
	public void town()
	{
		System.out.println("bhoom");
	}
	@Test           		//5
	public void dist()
	{
		System.out.println("dharashiv");
	}
	@BeforeClass			//3
	public void state()
	{
		System.out.println("maharastra");
	}
	@AfterMethod				//6
	public void fullname()
	{
		System.out.println("chauhan ram");
	}
	@BeforeTest
	public void sirname()    //2
	{
		System.out.println("chauhan");
	}
	@AfterClass						//7
	public void name()
	{
		System.out.println("ram");
	}
	@BeforeMethod 				//4
	public void father()
	{
		System.out.println("suryakant");
	}
	@AfterTest					//8
	public void grandfather()
	{
		System.out.println("shivaji");
	}
	@BeforeSuite        //1
	public void son()
	{
		System.out.println("akshay");
	}
}
