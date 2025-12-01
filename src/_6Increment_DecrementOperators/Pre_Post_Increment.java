package _6Increment_DecrementOperators;

public class Pre_Post_Increment {
	public static void main(String []args)
	{
		int num = 5;
		int results = num++;  			//First it will fetch the value of num (5)and then it will increment the value of num by (1) in next condition		
		int results1 = num++;     		// num = 5; in previous line it increased by 1 = 5+1; = 6;  and here it will add in next condition
		int results2 = ++num;           // num =6; = 6+1;= 7;  ++num; 1+7 = 8;
		System.out.println(results);
		System.out.println(results1);
		System.out.println(results2);
	
	}

}
