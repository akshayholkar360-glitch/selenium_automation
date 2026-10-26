package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
	WebDriver d;
	
	public login_page(WebDriver d){
		this.d=d;
		
	}
	public void enterUsername(String UName) {
		d.findElement(By.id("username")).sendKeys("admin");
		}
	
	public void enterPassword(String pass) {
		d.findElement(By.id("password")).sendKeys("password");
	}
	public void loginBtn() {
		d.findElement(By.id("submit")).click();
	}
}
