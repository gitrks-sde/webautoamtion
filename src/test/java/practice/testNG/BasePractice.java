package practice.testNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BasePractice {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("-----Beefore Method-----");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("-----After method-----");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("****Before Class****");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("===Test Finished===");
		System.out.println();
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println(">>>>Suite is Executing<<<<");
	}
	
	
}
