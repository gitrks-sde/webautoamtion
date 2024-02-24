package nopcommerce.test;

import org.testng.annotations.Test;

import nopcommerce.webautomation.BaseTest;
import nopcommerce.webautomation.LoginPage;

public class TC_Login extends BaseTest{

	@Test
	public void login()
	{
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterEmail("wolverinek11@rahulshetty.com");
		loginPage.enterPassword("Pwdselenium@1");
		loginPage.clickOnLogin();
	}
}
