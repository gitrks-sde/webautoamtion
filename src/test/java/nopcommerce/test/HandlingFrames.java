package nopcommerce.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.getTitle());

		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1550)", "");
		
		//driver.switchTo().frame("iframe-name");
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(frameElement);
		
		WebElement courseBtn=driver.findElement(By.xpath("(//a[text()='Practice'])[1]"));
		
		courseBtn.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement inputFElement=driver.findElement(By.id("displayed-text"));
		
		inputFElement.sendKeys("automation");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);

	}

}
