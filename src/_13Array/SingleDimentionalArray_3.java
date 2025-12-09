package _13Array;

public class SingleDimentionalArray_3 {
	public static void main(String []args)
	{
		int num[] = new int[6];
		num[0] = 1;
		num[1] = 3;
		num[2] = 6;
		num[3] = 2;
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}


		for(int n : num)    // both will work same
		{
			System.out.println(n);
		}
		
	}

}


/* 
 Note:-
 		int num[] = new int[6];
 							
 							|
 					Here we entered '6' but we have only '4' values. 
 					
 			In that case we can use 'length' keyword .
 			
 			Array having 'inbit' property of 'length' 
 			
 				If we didn't specify or Assign values then Automatically it will take '0' 



 */