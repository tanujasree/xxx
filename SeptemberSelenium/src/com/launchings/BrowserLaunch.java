package com.launchings;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		
	
		WebDriverManager.chromedriver().setup();
//System.setProperty("webdriver.chrome.driver","C:\\Users\\SREE\\Desktop\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();	
         driver.get("https://www.amazon.in");

	}

}
