package testt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {
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
	public void test() throws Exception
	{
	 WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"CardLink-template--21236517077306__featured_collection-8641118306618\"]"));
	 File src=dayelement.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src, new File("./screenshot//Elementscreenshot.png"));
	}
	

}
