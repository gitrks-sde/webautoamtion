package nopcommerce.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		Actions a = new Actions(driver);

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));

		a.moveToElement(name).perform();
		a.keyDown(Keys.LEFT_SHIFT)
		.sendKeys(name,"s")
		.keyUp(Keys.LEFT_SHIFT)
		.sendKeys("elenium")
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.ENTER)
		.build()
		.perform();
		
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		
		String alerttext=alert.getText();
		
		System.out.println(alerttext);
		
		alert.dismiss();
	}

}
