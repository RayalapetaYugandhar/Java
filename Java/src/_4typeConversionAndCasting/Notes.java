/* 	
 * byte b = 127;
 * int a = 256;
 * 
 *   b = a;         It is not possible
 * 	 a = b; 		We can store byte value in integer, But we can't store integer value in byte
 * 
 * 
 * byte b = 150;
 * int a = 10;
 *  	
 *  	b = a; Not possible
 *  	a = b; possible 
 *  					 If the value of integer is less also we can't store integer value into byte value. 
 *  					  Why because in generally integer size more than byte
 * 
 * 
 * 
 *   => There is an way to convert byte value into integer. That method is called as Casting or Explicit conversion 
 * 																					  ---------------------------
 * 
 * 
 * byte b =127;
 * int a = 150;
 * 
 * 			b = a; Not possible.
 * 			
 * 			b= (byte)a;               Possible - This is called as Explicit conversion
 * 		
 * 			a = b;                    Possible - This is called as Implicit conversion 
 * 
 * 
 * 
 * 
 * --->> We can't store Character value into a boolean
 * 
 * --->> Integer, Float, long and Double will works for Conversion.
 * 
 * 
 * int x = 5.6;
 * double d = 5.6;
 * 
 * 		x = d; We can't convert double value into int like this
 * 	   
 * 		int x =(int)d;  Possible
 * 		
 * 
 * 
 */