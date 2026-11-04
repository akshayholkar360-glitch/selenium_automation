package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign_instest {

	

	static ChromeDriver driver;//declare the reference variable of chromedriver
		//driver=null
		public static void main(String[] args) {
			sign_instest obj =new sign_instest();
			obj.launch();
			obj.entercredentials();
		    pressbutton();
		}
	void launch()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/SignIn.html");
		}
		void entercredentials()
		{
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("pavan@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pavan@123");
		}
		static void pressbutton()
		{
			driver.findElement(By.id("enterbtn")).click();
		}
	}
