package practice.testNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Practice1 extends BasePractice {

	@Test(enabled=true, groups= {"HealthCheck"},timeOut=300)
	public void C()
	{
		System.out.println("Belongs to HC group");
		System.out.println("Practice1.method1");
	}
	@Test(dependsOnMethods="C")
	public void B()
	{
		System.out.println("Practice1.method2");
	}
	@Test(description="testNG method",groups= {"HealthCheck"})
	public void A()
	{
		System.out.println("Belongs to HC group");
		System.out.println("Practice1.method3");
	}
	
	@BeforeGroups
	public void afterGroup()
	{
		System.out.println("Groud Execution Completed");
	}
	
}
