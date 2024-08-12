package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemo {
	
	WebDriver driver; //null
	By blazename=By.id("name");
	By blazecompany=By.id("company");
	By blazemail=By.id("email");
	By blazepass=By.id("password");
	By blazeconfpass=By.id("password-confirm");
	By blazereg=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazedemo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpassword)
	{
		driver.findElement(blazename).sendKeys(name);
		driver.findElement(blazecompany).sendKeys(company);
		driver.findElement(blazemail).sendKeys(email);
		driver.findElement(blazepass).sendKeys(password);
		driver.findElement(blazeconfpass).sendKeys(confirmpassword);
		
	
	}
	
	public void register()
	{
		driver.findElement(blazereg).click();
	}

}
