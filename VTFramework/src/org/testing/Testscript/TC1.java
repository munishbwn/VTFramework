package org.testing.Testscript;
import org.openqa.selenium.By;
import org.testing.Assertions.Assertt;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.utilities.Logs;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC1 extends Base {

	@Test
	
	public void  marketing()
	{
		Login Lgn =new Login(driver,pr);
		Lgn.signin("admin", "admin");
		Logs.takeLogs("TC1", "Login successfully");
		driver.findElement(By.linkText(pr.getProperty("markting"))).click();
		String expexted_url = "http://localhost:8888/index.php?module=Campaigns&action=index&parenttab=Marketing";
		Assert.assertTrue(Assertt.assert1(driver.getCurrentUrl(), expexted_url));
		
		//Assert.assertEquals(driver.getCurrentUrl(), expexted_url);  // Hard Assertion
		Logs.takeLogs("TC1", "TC-1 Pass successfully");
		
			
	}
	
	
}
