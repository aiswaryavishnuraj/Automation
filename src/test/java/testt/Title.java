package testt;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
		
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://9skin.in/");
	
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	String expected=("9SKIN");
	if (actualtitle.equals(expected))
		
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	

	}
}
