import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class swaglablogin {
  @Test(dataProvider = "data_provider")
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
}

  @DataProvider
  public Object[][] data_provider() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "locked_out_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },

    };
  }
}
