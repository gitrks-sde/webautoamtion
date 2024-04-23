package nopcommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropdown {

	public void dropdowns() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("window.scrollBy(0,950)", "");

		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		Actions action = new Actions(driver);

		// action.contextClick(element).perform();

		action.doubleClick(element).perform();
	}

	public void mouseActionDragAndDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		WebElement source = driver.findElement(By.xpath("//li[@id='fourth']"));

		WebElement destination = driver.findElement(By.xpath("//*[@id='amt7']"));

		WebElement source2 = driver.findElement(By.xpath("//*[@id='credit2']"));

		WebElement des2 = driver.findElement(By.xpath("//*[@id='bank']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)", "");

		Actions actions = new Actions(driver);

		actions.clickAndHold(source).moveToElement(destination).release().build().perform();

		actions.dragAndDrop(source2, des2).perform();
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-600)", "");

	}

	public static void main(String[] args) throws InterruptedException {

		PracticeDropdown practiceDropdown = new PracticeDropdown();
		practiceDropdown.mouseActionDragAndDrop();
	}

}
