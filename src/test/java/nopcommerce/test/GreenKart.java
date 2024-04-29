package nopcommerce.test;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public void addProduct(WebDriver driver, String product) {
		WebElement element = driver
				.findElement(By.xpath("//h4[contains(text(),'" + product + "')]/parent::div/div[3]/button"));
		element.click();
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		GreenKart greenKart = new GreenKart();

		/*
		 * driver.findElement(By.
		 * linkText("Limited offer - FREE Core Java & QA Resume course")).click();
		 * 
		 * driver.findElement(By.partialLinkText("FREE Core Java")).click();
		 * 
		 * String text=driver.findElement(By.tagName("div")).getText();
		 * System.out.println(text);
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//h4[contains(text(),'Potato')]/parent::div/div[3]/button")));

		greenKart.addProduct(driver, "Apple");

		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//h4[contains(text(),'Orange')]/parent::div/div[3]/button")));

		greenKart.addProduct(driver, "Strawberry");

		String currentwindow = driver.getWindowHandle();

		System.out.println(currentwindow);

		/*
		 * driver.findElement(By.partialLinkText("Limited offer")).click();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * Set<String> tablist=driver.getWindowHandles();
		 * 
		 * for(String s:tablist) { if(!currentwindow.contentEquals(s)) {
		 * driver.switchTo().window(s); break; } }
		 * 
		 * String window1 = driver.getWindowHandle();
		 * 
		 * System.out.println(window1); Thread.sleep(3000); WebElement courses =
		 * driver.findElement(By.xpath("//a[contains(text(),'Courses')]"));
		 * courses.click();
		 */
		Thread.sleep(2000);
		WebElement cartIcon=driver.findElement(By.xpath("//img[@alt='Cart']"));
		cartIcon.click();
		WebElement proceedBtn=driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		proceedBtn.click();
		Thread.sleep(2000);
		
		WebElement couponCode=driver.findElement(By.xpath("//input[@class='promoCode']"));
		couponCode.sendKeys("OFF120%");
		
		WebElement applybuElement=driver.findElement(By.xpath("//button[text()='Apply']"));
		applybuElement.click();
				
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		String msg=driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		
		System.out.println(msg);
		
	}

}
