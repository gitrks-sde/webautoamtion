package practice.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice3 extends BasePractice {

	@Test(groups= {"HealthCheck","Smoke"})
	public void method3()
	{
		System.out.println("Belongs to HC group");
		System.out.println("Practice3.method1");
	}
	@Test(groups= {"Smoke"})
	public void method2()
	{
		System.out.println("Practice3.method2");
	}
	@Test(groups= {"HealthCheck"})
	public void method1()
	{
		System.out.println("Belongs to HC group");
		System.out.println("Practice3.method3");
	}
	
	@Test
	@Parameters({"length","breadth"})
	public void areaOfRectangle(int length, int breadth)
	{
		int area=length*breadth;
		System.out.println("Area of rectangle: "+area);
	}
}
