package nopcommerce.webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	public WebElement loginLink;
	
	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	public WebElement signInPage;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement emailField;
	
	@FindBy(xpath="//input[@id='Password']")
	public WebElement passwordField;

	@FindBy(xpath="//button[text()='Log in']")
	public WebElement loginBtn;

	@FindBy(xpath="//input[@id='userEmail']")
	public WebElement email;

	@FindBy(xpath="//input[@id='login']")
	public WebElement loginbutton;

	@FindBy(xpath="//input[@id='userPassword']")
	public WebElement password;

	
	
	public void clickOnLogInLink()
	{
		loginLink.click();
	}
	
	public void verifySignInPageLoaded()
	{
		signInPage.isDisplayed();
	}
	
	public void enterEmailnop(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPasswordnop(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		loginBtn.click();
	}
	
	public void enterEmail(String useremail)
	{
	email.sendKeys(useremail);	
	}
	
	public void enterPassword(String userpassword)
	{
		password.sendKeys(userpassword);
	}
	
	public void clickOnLogin()
	{
		loginbutton.click();
	}

}
