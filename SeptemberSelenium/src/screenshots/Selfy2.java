package screenshots;

import java.awt.List;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy2 {

	
	public static void main(String[] args) throws Exception
	{
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://google.com");
		  java.util.List<WebElement> links = driver.findElements(By.linkText("rajinikanth"));
		  if(links.size()==0) {
		   
	File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileHandler.copy(srcfile, new File("C:\\Users\\SREE\\Desktop\\ss\\google.png"));
		  }
		}

	}


