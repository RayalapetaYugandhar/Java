package _10Loops;

public class NestedWhileLoop {
	public static void main(String []args)
	{
		int i =1;
		while(i<=4)
		{
			System.out.println("Hi" + i);
			int j =1;
			while(j<=3) {
				System.out.println("Hello" +j);
				j++;
			}
			i++;
		}
	}
}

/*
 *    First it will check outer while loop then it will goes inside while loop, 
 * If inner while loop it completed then it will go to outer while loop and again it will check inner loop.  
 * The loop checking is continuously going on up-to outer loop is completed.
 */