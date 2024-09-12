package testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://9skin.in/");
	}
	
	@Test
	public void test()
	{
		//product search
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--21236517634362__header\"]/sticky-header/header/div[1]/details-modal/details/summary/span/span/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Search-In-Modal\"]")).sendKeys("ILLUMINATE Glow Serum");
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--21236517634362__header\"]/sticky-header/header/div[1]/details-modal/details/div/div[2]/predictive-search/form/div[1]/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"CardLink--8641120108858\"]")).click();
	    
	    
	    //ADD TO CART
	    driver.findElement(By.xpath("//*[@id=\"ProductSubmitButton-template--23108844749114__main\"]")).click();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.navigate().back();
	    
	
	
	}
	
	
	

}
