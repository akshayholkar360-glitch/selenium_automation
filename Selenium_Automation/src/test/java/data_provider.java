import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class data_provider {
  @Test(dataProvider = "data_providers")
  public void login_details(String user_name, String pass) throws InterruptedException {
	  EdgeDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys(user_name);
	  Thread.sleep(1000);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  Thread.sleep(1000);
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  driver.close();
}

  @DataProvider
  public Object[][] data_providers() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "visual_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },

    };
  }
}
