package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_without_TestNG {
	
	static ChromeDriver driver;  // declare the reference variable of chrome driver
	
	public static void main(String[] args) {
		
		testcase_without_TestNG obj= new testcase_without_TestNG();  // for access class and new class object
		
		obj.launch();                   // for actions
		obj.entercredentails();
		obj.pressbutton();
		
	}
	
	void launch() {
	
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/SignIn.html");
	}
		
		void entercredentails(){
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("Akshay1@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
	}
	
	static void pressbutton()
	{
		driver.findElement(By.id("enterbtn")).click();
	}

}
