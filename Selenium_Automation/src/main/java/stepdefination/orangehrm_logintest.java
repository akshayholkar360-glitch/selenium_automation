package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrm_logintest {
	ChromeDriver d =new ChromeDriver();
	@Given("launch orangehrm website")
	public void launch_orangehrm()
	{
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	@When("enter username as \"Admin\" also enter password as \"admin123\"")
	public void crediantials()
	{
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("admin123");
	}
	@And("click on login button of orangehrm website")
	public void click_btn()
	{
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	@Then("orangehrm login should be successfull")
	
	public void current_url()
	{
		System.out.println("current url is :"+ d.getCurrentUrl());
	}
	
}
