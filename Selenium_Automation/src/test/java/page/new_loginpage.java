package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class new_loginpage {
WebDriver dr;
	
	public new_loginpage(WebDriver dr){
		this.dr=dr;
		
	}
	public void radiobutton(){
		dr.findElement(By.id("male")).click();
		}
	
	public void cheakbox(){
		dr.findElement(By.id("sunday")).click();
		dr.findElement(By.id("monday")).click();
		dr.findElement(By.id("tuesday")).click();
		dr.findElement(By.id("wednesday")).click();
		dr.findElement(By.id("thursday")).click();
		dr.findElement(By.id("friday")).click();
		dr.findElement(By.id("saturday")).click();
	}
}
