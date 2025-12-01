
/* 
 * Increment and decrement operators are unary operators that increase or decrease their operand by one. 
 * languages feature two versions (pre- and post-) of each operator with slightly different semantics.
 * 
 */

/*
 *   // num++;
 *   when you are doing Increment or Decrement after the variable. It is called as 
 *   							Post - Increment
 *   							Post - Decrement
 *   // ++num;
 *when you are doing Increment or Decrement before the variable. It is called as 
 *   							Pre - Increment
 *   							Pre - Decrement
 * 
 *
 * 
 * EX:-
 * 
	 * int num = 7;
	 * num = num+2;           // O/p:- 9
	 * 
	 * This is called as adding the number by itself. We can use short cuts let's see..............
	 * 
	 * num = num+2;          // 9
	 * 
	 * num =num+1;            // 8
	 * 
	 * Here we can do this operation in different way.....
	 * 
	 * num ++;              // 8     // Post-increment
	 * num --;              // 7     // Post-Decrement
	 * 
 * 
 * 
 * ------------------------------------------------
 * EX:-
 * 		num++;              //8
 * 		++num;              //8
 * 
 *		 We might think, Both values are same then why we have different Syntax.
 * 	This 2 Operations will behave differently when you fetch the values. 
 * 
 * 
 *  	int num= 7;
 *  .	
 *  	int results = ++num;         // O/P:- 8
 *  	
 *  	int results = num++;         // O/P:- 7
 *  
 *  Both are Behaving differently when we are trying to fetch the value.
 * -----------------------------------------------------------
 * 
 * Note:-
 * 		int num = 7;
 * 		int results = num++; 
 * 
 * 	First it will fetch the value of num (7)and then it will increment the value of num by (1)
 * 
 * 		int results = ++num;
 * 
 * First it will increase the value by (1) and then it will fetch the value.
 * 
 */
