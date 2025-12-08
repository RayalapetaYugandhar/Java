package _6Increment_DecrementOperators;

public class Post_Pre_Decrement {
	public static void main(String []args)
	{
		int num = 7;
		int results = num--;  			//First it will fetch the value of num (7)and then it will Decrease the value of num by (1) in next condition		
		int results1 = num--;     		// num = 7; in previous line it Decreased by 1 = 7-1; = 6;  and here it will Decrease value of num by 1 in next condition
		int results2 = --num;           // num =6; = 6-1;= 5;  ++num; 1-5 = 4;
		System.out.println(results);
		System.out.println(results1);
		System.out.println(results2);
	
	}

}
