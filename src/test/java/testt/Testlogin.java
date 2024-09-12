package testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagee.Loginpage;

public class Testlogin {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://9skin.in/account/login");
	}
	
	@Test
	public void test2()
	{
		Loginpage obj=new Loginpage(driver);
		obj.setvalues("meera@gmail.com", "meera123");
		obj.login();
	}

}
