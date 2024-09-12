package pagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	
	By kfirstname=By.name("customer[first_name]");
	By klastname=By.name("customer[last_name]");
	By kemail=By.id("RegisterForm-email");
	By kpswd=By.id("RegisterForm-password");
	By kcreate=By.xpath("//*[@id=\"create_customer\"]/button");
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String firstname,String lastname,String email,String pswd)
	{
		driver.findElement(kfirstname).sendKeys(firstname);
		driver.findElement(klastname).sendKeys(lastname);
		driver.findElement(kemail).sendKeys(email);
		driver.findElement(kpswd).sendKeys(pswd);
	}
	
	public void create()
	{
		driver.findElement(By.xpath("/html/body/main/div/div/form/button")).click();
		driver.findElement(kcreate).click();
	}
	
	
	

}
