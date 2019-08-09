package org.testing.Testscript;
import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC2 extends Base {

	
	@Test
	
	public void  sales()
	{
		new Login(driver, pr).signin("admin", "admin");
		driver.findElement(By.linkText(pr.getProperty("sales"))).click();
		System.out.println("TC-2 Tested");
	}
	


}
