package pagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
WebDriver driver;

By kemail=By.id("CustomerEmail");
By kpswd=By.id("CustomerPassword");
By ksingin=By.id("//*[@id=\"customer_login\"]/button");

 
public Loginpage(WebDriver driver)
{
	this.driver=driver;
}

public void  setvalues(String email,String pswd)
{
	driver.findElement(kemail).sendKeys(email);
	driver.findElement(kpswd).sendKeys(pswd);
}
public void login()
{
	driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/button")).click();
	driver.findElement(ksingin);
}







}