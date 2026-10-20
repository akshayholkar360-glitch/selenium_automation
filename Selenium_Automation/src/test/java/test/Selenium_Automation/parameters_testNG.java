package test.Selenium_Automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters_testNG {
	@Parameters({"B"})
	@Test
	public void display_num(int num)
	{
		System.out.println("num is :"+num);
	}
}
