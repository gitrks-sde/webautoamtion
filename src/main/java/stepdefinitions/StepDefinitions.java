package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObejctdesign.HomePage;
import pageObejctdesign.LoginPageLetShop;

public class StepDefinitions {

	static WebDriver driver;
	static LoginPageLetShop loginPageLetShop;
	static HomePage homepage;
	
	
	@Given("Application Lets Shop URL is loaded")
	public void application_url_is_loaded() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		loginPageLetShop=new LoginPageLetShop(driver);
		homepage=new HomePage(driver);
	}
	
	@Given("Application nop Commerce URL is loaded")
	public void applicationloading()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
	}
	
	
	@When("^user enter the email (.*)$")
	public void user_enters_the_email(String email) {
		loginPageLetShop.email.sendKeys(email);
	}

	@When("^user enter the password (.*)$")
	public void user_enters_the_password(String password) {
		loginPageLetShop.password.sendKeys(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPageLetShop.loginBtn.click();
	}
	
	@When("user select the product zara")
	public void user_select_zara()
	{
		homepage.selectProductZara();
	}
	
	@When("user select the product mobile")
	public void user_select_mobile()
	{
		homepage.selectProductMobile();
	}
	
	@Then("Close the browser")
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.quit();
	}

}
