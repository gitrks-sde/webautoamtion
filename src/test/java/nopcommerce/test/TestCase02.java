package nopcommerce.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObejctdesign.ClientLoginPage;

public class TestCase02 {

	static String username = "wolverinek11@rahulshetty.com";
	static String password = "Pwdselenium@1";

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");

		System.out.println(driver.getTitle());

		Thread.sleep(4000);
		
		ClientLoginPage clientLoginPage=new ClientLoginPage(driver);
		
		clientLoginPage.clickOnRegister();
	}

}
