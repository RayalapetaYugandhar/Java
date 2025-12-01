package _7ConditionalStatement;

public class ElseIf1 {
	public static void main(String []args)
	{
		int x = 8;
		int y = 7;
		int z = 6;
		
		if (x<y && x>z)
			System.out.println("If conition is true");
		else if (y<x && x>z)
			System.out.println("If condition is false");
		else
			System.out.println("Both If and Else if is wrong");
		
	}

}
