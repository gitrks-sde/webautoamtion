package nopcommerce.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import nopcommerce.webautomation.BaseTest;
import pageObejctdesign.ClientLoginPage;
import pageObejctdesign.HomePage;

public class TestCase01 extends BaseTest {
	static String username = "wolverinek11@rahulshetty.com";
	static String password = "Pwdselenium@1";

	@Test
	public void login() {
		ClientLoginPage clientLoginPage = new ClientLoginPage(driver);

		clientLoginPage.login(username, password);
	}
	
	@Test(dependsOnMethods="login")
	public void productAdding() {

		HomePage homePage = new HomePage(driver);

		homePage.selectCategoryFashion();

		homePage.selectCategoryElectronics();
	}

	@AfterSuite
	public void classend() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}
