package pageObejctdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLetShop {

	WebDriver driver;
	
	public LoginPageLetShop(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='userEmail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='userPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	public WebElement loginBtn;
	
}
