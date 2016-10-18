package test2;

public abstract class X{

	public static void main(String[] args) {
		System.out.println('a'==97.0);
		System.out.println('a');
	
		Thread t = new Thread();
		Object o = new Object();
		String s = new String("amit");
		System.out.println(o==t);
		
      
	}
	
	public void y()
	{
		System.out.println("a");
	}
	
	public void z()
	{
		System.out.println("b");
	}
	
	public abstract void i();

}
