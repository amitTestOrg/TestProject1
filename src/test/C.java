package test;

import org.testng.annotations.Test;

public class C {


	@Test(priority=0)
	public static void cClass()
	{
		String first = A.getZvalue();
		System.out.println("In class C: " + first);
	}
	
	@Test(priority=1, enabled=true, groups="smoke", suiteName="smoke suite")
	public static void sm()
	{
		System.out.println("This is smoke method in class C");
	}

}
