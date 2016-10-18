package test;

import org.testng.annotations.Test;

public class A {
    public static  String z;
	
	@Test(priority=0)
	public static void sum()
	{
		z = CreateUniqueNumber.Generate_Unique_String("AR");
		System.out.println("In class A method sum: " + z);
		//return z;
	}
	
	@Test(priority=1)
	public static String getZvalue(){
		System.out.println();
		return z;
	}
	
	@Test(priority=2, enabled=true, groups={"smoke", "regression"}, suiteName="smoke suite")
	public static void sm()
	{
		System.out.println("This is smoke method in class A");
	}
	
	@Test(priority=2, enabled=true, groups="smoke", suiteName="smoke suite")
	public static void sm2()
	{
		System.out.println("This is smoke method2 in class A");
	}
}