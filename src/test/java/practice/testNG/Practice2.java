package practice.testNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice2 extends BasePractice {

	
	@Test(groups= {"HealthCheck"})
	public void method3()
	{
		System.out.println("Belongs to HC group");
		System.out.println("Practice2.method1");
	}
	@Test(groups= {"Smoke"})
	public void method2()
	{
		System.out.println("Practice2.method2");
	}
	@Test(groups= {"Smoke"})
	@Parameters({"breadth"})
	public void method1(int breadth)
	{
		System.out.println("Practice2.method3");
		System.out.println("Length: "+breadth);
	}
	
	
}
