package _13Array;

public class MultiDimentionalArray 
{
	public static void main(String []args)
	{
		int num [][] = new int[3][4];
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=3; j++)
			{
				num[i][j] = (int)(Math.random() * 10);
			}
		}
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=3; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
