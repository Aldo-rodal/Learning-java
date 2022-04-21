package demooop;

//	This program is made to easy understand
//	the polymorphism in Java.  
public class DemoOverload 
{
	
	void add(int a, int b)
	{
		int rs = a + b;
		System.out.println("result "+rs);
	}

	void add(int a, int b, int c)
	{
		int rs = a + b + c;
		System.out.println("result "+rs);
	}
	public static void main(String[] args) 
	{

		DemoOverload dv = new DemoOverload();
//	Same name of method but different number of variables
				dv.add(4, 5);
				dv.add(4, 5, 6);
	}

}
