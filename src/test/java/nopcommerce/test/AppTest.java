package nopcommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	static String username = "wolverinek11@rahulshetty.com";
	static String password = "Pwdselenium@1";

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");

		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		System.out.println(driver.getTitle());

		Thread.sleep(4000);

		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='userEmail']"));
		email.sendKeys(username);

		WebElement passwordf = driver.findElement(By.xpath("//input[@id='userPassword']"));
		passwordf.sendKeys(password);

		driver.findElement(By.xpath("//input[@name='login' or @type='search']")).click();

		/*
		 * String product=driver.findElement(By.className("product-name")).getText();
		 * System.out.println(product);
		 */
		Thread.sleep(7000);

		driver.quit();
	}
}
