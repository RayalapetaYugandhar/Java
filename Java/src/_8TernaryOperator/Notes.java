/*
 *   condition ? expression1 : expression2; 
 * 					|              | 				 
 * 				   True		     False		 
 * 	If the condition is true it will execute 'expression1' and if the condition is false it will execute 'expression2'  
 * 
 * 	EX:-
 * 		int n = 4;
 * 		results = n%2 == 0? 10 : 20;
 * 		
 * 						  2)4(2
 * 							4
 * 						   ---
 * 							0   modulus = 0 
 * 						   ---
 * 	  -->> Here condition is true then it will print 10;
 * 	EX:-
 * 		int n = 5;
 * 		results = n%2 == 0? 10 : 20;
 * 		
 * 						  2)5(2
 * 							4
 * 						   ---
 * 							1   modulus = 1
 * 						   ---
 *		-->> Here condition is false then it will print 20;
 *
 *
 *--------------------------------------------------------------------------------------
 *
 //package _8TernaryOperator;
//
//public class Example {
//	public static void main(String []args)
//	{
//		int n = 4;
//		int results = 0;
//		
//		if(n%2==0)
//			results = 10;
//		else
//			results = 20;
//		System.out.println(results);
//	}
//}
-------------------------------------------------------------------
 *    we can writ same code in less line by using Ternary operator 
 *
 *-----------------------------------------------------------------
 //package _8TernaryOperator;
//
//public class TernaryOperator 
//{
//	public static void main(String []args)
//	{
//		int n = 4;
//		int results = 0;
//		
//		results =n%2==0?10:20;   				-->> Ternary operator
//		System.out.println(results);
//	}
//
//}
 * 
 * Here condition is true that's why it executes 1nd Expression 
--------------------------------------------------------------------------
//
//package _8TernaryOperator;
//
//public class TernaryOperator2 {
//	public static void main(String []args)
//	{
//		int n =5;
//		int results = 0;
//		
//		results = n%2 == 0? 10:20;
//		System.out.println(results);
//		
//	}
//
//}

*	Here condition is false that's why it executes 2nd Expression
*
*/
