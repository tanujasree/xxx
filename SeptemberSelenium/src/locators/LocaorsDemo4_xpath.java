package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaorsDemo4_xpath 
{

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\SREE\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//Absolute xpath
//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("T-shirts");
//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
		//Relativexpath
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//xpath or
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox1' or @name='field-keywords']")).sendKeys("t-shirts");
		
		//xpath and
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords1']")).sendKeys("t-shirts");
		//xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@id,'searchtextbox')]")).sendKeys("T-shirts");
		//xpath with start with
		//driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("T-shirts");
		//xpath with text()
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		
		
		
		
		
		
}

}
