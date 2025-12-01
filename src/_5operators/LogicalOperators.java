package _5operators;

public class LogicalOperators {
	public static void main(String []args)
	{
		int x = 7;
		int y = 5;
		int a = 5;
		int b = 9;
		boolean results = x<y;          // Here we can't use 'int' why we are trying to print true or false. int will use for storing the digits. 
		//boolean results = x > y;      // we can right like this but it will take more time and more lines of code
		System.out.println(x>y && a<b);
		System.out.println(x<y && b<a);
		System.out.println(a>y && x<b);
		System.out.println(x>y || a<b);
		System.out.println(x<y || a<b);
		System.out.println(b>y || a<b);
		System.out.println(x<y || a<b || a>1);
		System.out.println(x<y);	
		System.out.println(!results);
		
	}

}
