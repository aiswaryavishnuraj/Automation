package testt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://9skin.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--21236517568826__footer\"]/footer/div[1]/div[2]/div[3]/ul/li[2]/a")).click();
		
	}
	
	

}
