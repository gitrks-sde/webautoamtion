package com.sikuli;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliAutomation {

	static WebDriver driver;
	
	@Test
	public void customerDelete() throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("542346");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(4000);
		
		String path="C:\\My_Workspace\\";		
		Screen s=new Screen();		
		Pattern btnOK=new Pattern(path+"sukuli_okBtn.jpg");
		s.wait(btnOK,5);
		s.click(btnOK);
		
		
		
	}
}
