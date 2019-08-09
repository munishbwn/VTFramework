package org.testing.Testscript;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC3 extends Base {

	@Test
	
	public void  support()
	{
		new Login(driver, pr).signin("admin", "admin");
		driver.findElement(By.linkText(pr.getProperty("support"))).click();
		System.out.println("TC-3 Tested");
	}
	
}
