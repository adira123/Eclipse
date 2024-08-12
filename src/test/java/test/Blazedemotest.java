package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazedemo;



public class Blazedemotest {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void testlogin()
	{
		Blazedemo ob=new Blazedemo(driver);
		ob.setvalues("Anu", "abc", "an@gmail.com", "abcds", "abcds");
		ob.register();
		
		
	}

}
