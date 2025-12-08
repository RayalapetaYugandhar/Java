package _10Loops;

public class WhileLoop2 {
	public static void main(String []args)
	{
		int i =1;
		while(i<=4)
		{
			System.out.println("Hi" + i);
			i++;
		}
		System.out.println("Bye" +i);
	}


}


/*Here we got false on value '5', While loop stops printing.
* int i =1;  'i' is declare outside the loop, the value will be maintained. That's why we got output as 'Bye5'
*/