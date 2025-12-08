//-->> We can use same method Name in Next method but the values or parameters not to be same.
//
// -->> We can use same number of parameters(values) with different type.
// 
 
package _12_1Method_OverLoading;

class Calculator 
{
	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public double add(double n1, int n2)
	{
		return n1+n2;
	}
}

public class Code1 {
	public static void main(String []args)
	{
		int n1 =3;
		int n2 =5;
		int n3 =4;
		
		Calculator cal = new Calculator();
		
		int result = cal.add(n1, n2);
		int result1 = cal.add(n1, n2, n3);
		double result3 = cal.add(n1, n2);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result3);
	}

}
