package _13Array;

public class SingleDimentionalArray_1 {
	public static void main(String []args)
	{
		int num[] = {3, 4, 5, 6};
		
		num[2] = 8;  /*Here we are replacing the value '8' with '5' */
		
		
//		System.out.println(num[2] );  /*We can write like this but it will print only one line, That's why we used for loop*/
		
		
		for(int i=0; i<=3; i++ )
		{
			
			System.out.println(num[i] );
		}
		
	}

}
