package test.Selenium_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		// for First Name
		
		driver.findElement(By.xpath("//input [@type='text' and @placeholder='First Name']")).sendKeys("Nana");
		
		Thread.sleep(2000);
		
		//for last name
		
		driver.findElement(By.xpath("//input [@type='text' and @placeholder='Last Name']")).sendKeys("Patekar");
		
		Thread.sleep(2000);
		
		//for address

		
		driver.findElement(By.tagName("textarea")).sendKeys("304, Sheetal Building, Apna Ghar Society, Samarth Nagar, Andheri West, Mumbai.");
		
		Thread.sleep(2000);
		
		//for email Id


		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nanapatekar1951@gmail.com");
		
		Thread.sleep(2000);
		
		//for phone number

		
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9856147896");
		
		Thread.sleep(2000);
		
		
		//for select male

		
		driver.findElement(By.cssSelector("input[type='radio'][value='Male']")).click();
		
		Thread.sleep(2000);
		
		//for select Hobbies

		
		driver.findElement(By.cssSelector("input[type='checkbox'][value='Cricket']")).click();
		
		Thread.sleep(2000);
		
		//for select language

		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();


		driver.findElement(By.xpath("//a[text()='English']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body")).click();
		
		//for select skills
		
		Select sel=new Select(driver.findElement(By.id("Skills")));

		
		sel.selectByIndex(3);
		
		Thread.sleep(2000);
		
		//for select countries

		
		driver.findElement(By.id("countries")).click();		// there is no options to select any countries in drop down there is a bug.
		
		driver.findElement(By.xpath("//body")).click();
		
		Thread.sleep(2000);
		
		//for select country
		
		driver.findElement(By.xpath("//span [@role ='combobox' and @class='select2-selection select2-selection--single']")).click();
		
		driver.findElement(By.xpath("//li[text()='Australia']")).click();
		
		//for select year
		
		
		Select sel2 = new Select(driver.findElement(By.id("yearbox")));
		sel2.selectByValue("1951");
		
		//for select month
		
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		sel3.selectByValue("January");
		
		//for select day
		
		Select sel4 = new Select(driver.findElement(By.id("daybox")));
		sel4.selectByValue("1");
		
		//for create password
		
		driver.findElement(By.id("firstpassword")).sendKeys("1234567890");
		
		//for conform password
		
		driver.findElement(By.cssSelector("input[id='secondpassword'][type='password']")).sendKeys("1234567890");
		
		
		//for click on submit button
		
		driver.findElement(By.cssSelector("button[name='signup']")).click();
		
		// for refresh button click
		
		driver.findElement(By.cssSelector("button[id='Button1'][value='Refresh']")).click();
				

		
		
	}

}
