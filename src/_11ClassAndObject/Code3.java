package _11ClassAndObject;

class Checking {                     /*Here we created a class*/
	
	int a;                          /* Variable*/
	
	public int add()                /*Method*/
	{
		System.out.println("In Add");
		return 0;
	}
}

public class Code3 {
	public static void main(String []args)
	{
		int num1=4;
		int num2=5;
		
		Checking Calc = new Checking();           /*'Calculator' is the Class Type and 'Calc' is the Variable
		 													'new Calculator' is the object*/
		
		Calc.add();        /*Manaki results vasthunyi, A vachina results ni store chesukovadaniki vaka variable create cheyali
		 					/*	like this --->>		int result = Calc.add();*/
		
//		int result = Calc.add();
		//		System.out.println(results);
	}
	
}
