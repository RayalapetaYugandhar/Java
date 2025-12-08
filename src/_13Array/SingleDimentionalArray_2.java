package _13Array;

public class SingleDimentionalArray_2 
{
	public static void main(String []args)
	{
		int num[] = new int[4];  /*Here we wrote the size of the values*/
		
		num[0] = 2;   /*We are to make it dynamic that's why we added values here*/
		num[1] = 4;
		num[2] = 6;
		num[3] = 1;
		
//		System.out.println(num[0]);   /*Here we writing same step in multiple lines, 
//		System.out.println(num[1]);        To reduces the time and lines of code we used loops*/
//		System.out.println(num[2]);
//		System.out.println(num[3]);
		
		/*Both will give us same output*/
		
		for(int i=0; i<=3; i++)   
		{
			System.out.println(num[i]);
		}

	}

}
