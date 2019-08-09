package org.testing.Testscript;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC4 extends Base {

	
	@Test
	
	public void  analytics()
	{
		new Login(driver, pr).signin("admin", "admin");
		driver.findElement(By.linkText(pr.getProperty("analytics"))).click();
		System.out.println("TC-4 Tested");
	}
	
	
}
