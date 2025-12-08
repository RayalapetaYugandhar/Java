package _4typeConversionAndCasting;

public class Code1 {
	public static void main(String []args)
	{
//		int x = 5.6;           // It will not work
		float f = 5.6f;
		int x = (int)f;          // Explicit conversion 
		System.out.println(x);
	}

}

//If we do Explicit conversion of float or double value, we lost the point values (5.6) will get only 5 