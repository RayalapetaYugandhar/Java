package _13Array;

public class MultiDimentionalArray_1
{
	public static void main(String []a)
	{
		int num [][] = new int [3][4];
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=3; j++)
			{
				num[i][j] = (int)(Math.random() * 10);  /*In java Math.random will give us random values*/
				 										/*Math.random will give us boolean values, That's why we are doing Explicit conversion (int)*/
			}
		}
		
		for(int i=0; i<=2; i++)             	/*The 1 & 2 both loops work same*/
		{
			for(int j=0; j<=3; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();  /*This System.out.println(); is used to add the space between 2 loops*/ 
		 
		for(int n[]: num)  /*Enhanced for loop or for each loop*/     /*The 1 & 2 both loops work same*/
		{
			for(int m:n)
			{
				System.out.print(m+ " ");
			}
			System.out.println();
		}
	}

}
