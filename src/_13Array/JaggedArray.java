/*If the Array size is different from each Array then we will use 'jagged Array'*/

/* num[0] = new int [4];  --- >>Here we have '1row' and '4column'*/

package _13Array;

public class JaggedArray {
	public static void main(String []args)
	{
		int num[][] = new int[3][];  /*int[3] is row size and [] column is empty here*/
		
		num[0] = new int [3];   /*Here we have '0row' and '3 Elements' in the '0st' column*/
		num[1] = new int [4];   /*Here we have '1row' and '4 Elements' in the '1st' column*/
		num[2] = new int [2];   /*Here we have '2row' and '2 Elements' in the '2nd' column*/
		
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				num[i][j] = (int)(Math.random() * 10);
			}
		}
		
		for(int n[]: num)
		{
			for(int m: n)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}

}
