package _13Array;

public class ThreeDimentionalArray 
{
	public static void main(String []args)
	{
		int num[][][] = new int [3][4][2];
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=3; j++)
			{				
				for(int k=0; k<=1; k++)
				{
					num[i][j][k] = (int)(Math.random() * 10);  /*In java Math.random will give us random values*/
					 										/*Math.random will give us boolean values, That's why we are doing Explicit conversion (int)*/
				}
			}
		}
		
		for(int i=0; i<=2; i++)             	/*The 1 & 2 both loops work same*/
		{
			for(int j=0; j<=3; j++)
			{
				for(int k=0; k<=1; k++)
				{
					System.out.print(num[i][j] + " ");
				}
			}
				System.out.println();
		}
		
		System.out.println();  /*This System.out.println(); is used to add the space between 2 loops*/ 
		 
		for(int i=0; i<=2; i++)             	/*The 1 & 2 both loops work same*/
		{
			for(int j=0; j<=3; j++)
			{
				for(int k=0; k<=1; k++)
				{
					System.out.print(num[i][j] + " ");
				}
			}
				System.out.println();
		}
	}

}
