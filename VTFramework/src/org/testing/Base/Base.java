package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver  driver;
	public Properties pr;
	@BeforeMethod
	public void openbrowser() throws IOException
	{
		File f=new File("..//VTFramework//src//or.properties");
		FileInputStream finput =new FileInputStream(f);
		pr = new Properties();
		pr.load(finput);
		ChromeOptions options = new ChromeOptions();// Need to understand why chromeOptions is required ?
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		
	}
@AfterMethod
	
	public void browserclose()
	{
		driver.close();
	}

}
