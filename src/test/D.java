package test;

import org.testng.annotations.Test;

public class D {

	@Test(priority=0, enabled=true, groups="smoke", suiteName="smoke suite")
	public static void sm()
	{
		System.out.println("This is smoke method in class D");
	}
}