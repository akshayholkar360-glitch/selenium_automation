package test.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class calculator_test {
	WebDriver driver;
	@BeforeClass
	void display() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.calculator.net/");
		System.out.println("Browser launched successfully");
		Thread.sleep(1000);
	}
	
	
	@Test
	void AdditionTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();	
		driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		System.out.println("Addition done");
		Thread.sleep(2000);
	}
	
	@Test
	void SubtractionTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();	
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		System.out.println("subtraction done");
		Thread.sleep(2000);
	}
	@Test
	void MultiplicationTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();	
		driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		System.out.println("Multiplication done");
		Thread.sleep(2000);
	}
	@Test
	void DevisionTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();	
		driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		System.out.println("Devision done");
		Thread.sleep(2000);
	}
	@Test
	void sinTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();

		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[@onclick=\"r(')')\"]")).click();
		 driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		 Thread.sleep(1000);
		 System.out.println("Sin Test Done");
	}
	@Test
	void cosTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick=\"r('cos')\"]")).click();

		 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[@onclick=\"r(')')\"]")).click();
		 driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		 Thread.sleep(2000);
		 System.out.println("cos Test Done");
	}
	@Test
	void tanTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick=\"r('tan')\"]")).click();

		 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 driver.findElement(By.xpath("//span[@onclick=\"r(')')\"]")).click();
		 driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		 Thread.sleep(1000);
		 System.out.println("tan Test Done");
	}
	
	
}
