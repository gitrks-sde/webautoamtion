package practice.testNG;

import org.testng.annotations.Test;

public class Practice8 {
	@Test
	public void iternateInt() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("'''"+i+"'''");
			Thread.sleep(1000);
		}
	}
	@Test
	public void iternateInk() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("@@@"+i+"@@@");
			Thread.sleep(1000);
		}
	}
}
