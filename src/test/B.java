package test;

import org.testng.annotations.Test;

public class B {


	@Test(priority=0)
	public static void div()
	{
		String first = A.getZvalue();
		System.out.println("In class B: " + first);
		
	}
	@Test(priority=1, enabled=true, groups="smoke", suiteName="smoke suite")
	public static void sm()
	{
		System.out.println("This is smoke method in class B");
	}

}
