package parallel_testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test

	public void testing1() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("this is test 1 block:" + Thread.currentThread().getId());
	}

}
