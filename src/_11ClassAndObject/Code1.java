package _11ClassAndObject;

class Calculator {                     /*Here we created a class*/
	
	int a;                          /* Variable*/   /*We have to assign the variable inside the 'CLASS' and outside the 'METHOD'  */
	
	public int add()                /*Method*/
	{
		System.out.println("In Add");
		return 0;
	}
}

public class Code1 {
	public static void main(String []args)
	{
		int num1=4;
		int num2=5;
		
		Calculator Calc = new Calculator();           /*'Calculator' is the Class Type and 'Calc' is the Variable
		 													'new Calculator' is the object*/
		
		int results= Calc.add();
		
		System.out.println(results);
	}
	
}
