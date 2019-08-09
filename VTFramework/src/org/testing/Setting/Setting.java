package org.testing.Setting;

import org.openqa.selenium.By;

import org.testing.Base.Base;
import org.testing.Pages.Login;


import org.testng.annotations.Test;

public class Setting extends Base {
	
@Test
	
	public void  marketing()
	{
		Login Lgn =new Login(driver,pr);
		Lgn.signin("admin", "admin");
		
		driver.findElement(By.linkText(pr.getProperty("markting"))).click();
				
		System.out.println("Munish Setting class done");
		
			
	}

}
