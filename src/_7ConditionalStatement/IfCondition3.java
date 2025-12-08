package _7ConditionalStatement;

public class IfCondition3 {
	public static void main(String []args)
	{
		int x =7;
		int y =9;
		
		if (x<y)  // if condition is false then it will go to else 
		{
			System.out.println("If condition is true");  // If we are printing only one statement then no need to add brackets.
			System.out.println("No_need_to_go_in_else_condition");
		}
		else
			System.out.println("Hey Hi it's me else condition");
	}

}