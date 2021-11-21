package screenshots;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy4 
{

	public static void main(String[] args)
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		Date dt=new Date();
		System.out.println(dt);
		String d=dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(d);
		
		
		

	}

}
