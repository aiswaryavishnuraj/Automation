package testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagee.Register;

public class Testregister {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://9skin.in/account/register");
	}
	
	@Test
	public void test1()
	{
		Register ob=new Register(driver);
		ob.setvalues("meera", "babu", "meera@gmail.com", "meera123");
		ob.create();
	}

}
