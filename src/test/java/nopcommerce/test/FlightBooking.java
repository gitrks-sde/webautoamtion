package nopcommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		WebElement roundtripBtn=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		
		roundtripBtn.click();
		
		boolean status=roundtripBtn.isSelected();
		
		System.out.println("Radio Button selected: "+status);
		
		WebElement familyChkBx=driver.findElement(By.xpath("//div[@id='familyandfriend']/child::input"));
		
		familyChkBx.click();
		
		WebElement studentChkBx=driver.findElement(By.xpath("//div[@id='StudentDiv']/child::input"));
		
		studentChkBx.click();
		
		

	}

}
