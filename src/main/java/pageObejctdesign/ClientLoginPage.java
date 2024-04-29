package pageObejctdesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientLoginPage {
	WebDriver driver;
	
	public ClientLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By emailField=By.id("userEmail");
	By passwordField=By.id("userPassword");
	By loginBtn=By.id("login");
	By registerLink=By.linkText("Register");
	
	public void login(String email, String password)
	{
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginBtn).click();
	}
	
	public void clickOnRegister()
	{
		driver.findElement(registerLink).click();
	}

}
