package test_1;

import org.testng.annotations.Test;

import base.login_base;
import page.login_page;

public class login_test extends login_base {
	login_page  page= new login_page(d);
	
	@Test
	
	public void verifyLogin()
	{
		page = new login_page(d);
		// called enterUsername(String uName) method of page class
		page.enterUsername("admin");
	
		//called enterPassword (String pass) method of page class
		
		page.enterPassword("password");
	
		//called loginBtn()method page class
		
		page.loginBtn();
	}
}
