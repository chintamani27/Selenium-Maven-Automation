import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class swaglablogintest {
  @Test(dataProvider = "data")
  public void verifylogin(String uname, String pass) {
	EdgeDriver  d= new EdgeDriver();
		d.get("https://www.saucedemo.com/");
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys(uname);
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys(pass);
		
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
		
	 
	  
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" }
    };
  }
}
