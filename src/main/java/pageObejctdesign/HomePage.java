package pageObejctdesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//label[text()='fashin']/preceding-sibling::input)[2]")
	public WebElement fashionCBX;
	
	@FindBy(xpath="(//label[text()='electronics']/preceding-sibling::input)[2]")
	public WebElement electronicsCBX;
	
	By iphone=By.xpath("//b[contains(text(),'IPHONE')]/../following-sibling::button[text()=' Add To Cart']/i");
	
	@FindBy(xpath="//b[contains(text(),'ZARA')]/../following-sibling::button[text()=' Add To Cart']")
	public WebElement productZara;
	
	@FindBy(xpath="//b[contains(text(),'ADIDAS')]/../following-sibling::button[text()=' Add To Cart']")
	public WebElement productMobile;
	
	
	public void selectCategoryFashion()
	{
		fashionCBX.click();
	}
	
	public void selectCategoryElectronics()
	{
		electronicsCBX.click();
	}
	
	public void selectProductZara()
	{
		productZara.click();
	}
	
	public void selectProductMobile()
	{
		productMobile.click();
	}

}
