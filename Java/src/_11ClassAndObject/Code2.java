package _11ClassAndObject;

class Addition 
{                     /*Here we created a class*/
	
	int a;                          /* Variable*/
	
	public int add(int n1, int n2)                /*Method*/
	{
		int r = n1 + n2;           /*= n1 - n2; = n1 * n2; = n1 / n2; = n1 % n2;*/
		return r;
	}
}

public class Code2 {
	public static void main(String []args)
	{
		int num1=4;
		int num2=5;
		
		Addition Calc = new Addition();           /*'Addition' is the Class Type and 'Calc' is the Variable
		 													'new Addition' is the object*/
		
		int result= Calc.add(num1 , num2);
		
		System.out.println(result);
	}
	
}
