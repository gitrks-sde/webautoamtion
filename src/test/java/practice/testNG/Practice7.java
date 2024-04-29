package practice.testNG;

import org.testng.annotations.Test;

public class Practice7 {

	@Test
	public void iternateInt() throws InterruptedException
	{
		for(int i=1;i<=30;i++)
		{
			System.out.println("---"+i+"---");
			Thread.sleep(1000);
		}
	}
}
