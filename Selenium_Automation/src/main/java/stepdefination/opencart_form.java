package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// Blue Code of cucumber

public class opencart_form {
	ChromeDriver d= new ChromeDriver();
	@Given("opencart website should be lunch")
	public void launch() 
	{
		d.manage().window().maximize();
		 d.get("https://www.opencart.com/");
	 }
	
	@When("click on register button on langing page")
	 public void click_register() {
		 d.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
		 System.out.println("Title of the link before register :" + d.getTitle());

	 }
	
	@And("enter username ,firstname, lastname")
	 public void enter_details() {
		 d.findElement(By.id("input-username")).sendKeys("Akshay#17");
		 d.findElement(By.id("input-firstname")).sendKeys("Akshay");
		 d.findElement(By.id("input-lastname")).sendKeys("Holkar");
		 
	 }
	@And("enter email,country and password")
	 public void enter_moredetails()
	 {
		 d.findElement(By.id("input-email")).sendKeys("akshayholkar360@gmail.com");
		 Select sel = new Select(d.findElement(By.id("input-country")));
		 sel.selectByVisibleText("India");
		 d.findElement(By.id("input-password")).sendKeys("Akshay@123");
	 }
	@And("click on register button")
	 public void click_registerbtn() {
		 d.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();
	 }
	@Then("user should create account and register should be successfull")
	 public void verifyedreg() {
		 System.out.println("Title of the link after register :" + d.getTitle());
	}
}
	
	// Scenario 2
	
//	@Given("opencart website should be login")
//	public void opencart_launch()
//	{
//		
//	}
//	@When("click on login button on landing page")
//	public void click_login()
//	{
//		
//	}
//	@And("enter email and password")
//	public void enter_credentails()
//	{
//		
//	}
//	@And("click on login button")
//	public void click_button()
//	{
//		
//	}
//	@When("user login should be successfull")
//	public void user_login()
//	{
//		
//	}
//}
