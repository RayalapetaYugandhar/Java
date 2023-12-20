package _6Increment_DecrementOperators;

public class Post_Decrement {
	public static void main(String []args)
	{
		int num =6;
		int results = num--;         // num =6; it will decrease the value in next condition		
		int results1 = num --;       // num =6; 6-1 =5; For this line it will decrease the value in next condition
		int results2 = num --;		// num =5; 5-1 =4; For this line it will decrease the value in next condition
		int results5 = --num;       // In previous condition num = 4-1 = 3; --3 = 2;
		System.out.println(results);
		System.out.println(results1);
		System.out.println(results2);
		System.out.println(results5);
		
	}

}
