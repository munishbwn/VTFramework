package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login  {
	
	WebDriver driver;
	Properties pr;

	public Login(WebDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	
	public void signin(String userid, String password)
	{
		driver.findElement(By.name(pr.getProperty("username"))).sendKeys(userid);
		driver.findElement(By.name(pr.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(pr.getProperty("loginbtn"))).click();
	}
}
