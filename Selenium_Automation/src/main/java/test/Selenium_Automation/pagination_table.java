package test.Selenium_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class pagination_table {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		for (int page = 1; page <= 5; page++) {

			// find Element
			List<WebElement> checkboxes = driver.findElements(By.xpath("//td/input"));

			// click checkboxes
			for (WebElement c : checkboxes) {

				if (c.isDisplayed() && c.isEnabled() && !c.isSelected()) {

					c.click();
				}
			}

			Thread.sleep(2000);

			driver.findElement(By.xpath("//ul[@id='pagination']//a[normalize-space()='" + page + "']")).click();
			Thread.sleep(2000);

		}

	}
}
