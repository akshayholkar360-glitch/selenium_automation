package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practice_demosite {

	ChromeDriver dri = new ChromeDriver();

	@Given("practice form should launcgh")
	public void launch(){
		
	dri.get("https://demoqa.com/automation-practice-form");
	  
	 System.out.println("launch practice form: "+ dri.getCurrentUrl());
}
	@When("enter name, surname and email")
	public void enterdata() {
		
	WebElement name = dri.findElement(By.id("firstName"));
	name.sendKeys("Rakesh");
	WebElement surname= dri.findElement(By.id("lastName"));
	surname.sendKeys("Jadhav");
	WebElement email = dri.findElement(By.id("userEmail"));
	email.sendKeys("RakeshJadhav654@gmail.com");
	}
	@And("select male option succesfully,enter mobile number")
	public void data() {
	WebElement gen =dri.findElement(By.xpath("//*[@id=\"gender-radio-1\"]"));
	gen.click();
	dri.findElement(By.id("userNumber")).sendKeys("9876543210");
	}

	public void data2() {
	dri.findElement(By.id("dateOfBirthInput")).click();
	Select sel = new Select(dri.findElement(By.id("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/select")));
	sel.selectByVisibleText("January");
	
		
	System.out.println("data entered successfully : ");
	}
	@Then("name,surname and email should insert succesfully")
	public void verifyimported_data() {
	System.out.println("insrted data is : " );
	}
}
  

  