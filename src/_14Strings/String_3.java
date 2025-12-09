package _14Strings;

public class String_3 {
	public static void main(String []a)
	{
		String s1 = "Yugandhar";
		String s2 = "Yugandhar";
		String s3 = "yugandhar";
		
		System.out.println(s1==s2);
		System.out.println(s1!=s2);
		System.out.println(s2==s3);
		System.out.println(s2!=s3);
	}

}


/*
 * 		Here s1 = "Yugandhar", First it will check Yugandhar in String pool, 
 * If it is not present then it will store or create the value in Heap memory in some Address.
 * 
 * 	 For example Address is 103 then stack memory refer the 103 Address. 
 * 
 * 
 * 		s2 = "Yugandhar", First it will check Yugandhar in String pool, 
 * If it is present then it will not store or create the value and it directly use the reference Address.
 * 
 * 
 * 
 * 	  s3 = "yugandhar", First it will check 'yugandhar' in String pool, 
 * If it is not present then it will store or create the value in Heap memory in some Address.
 * 
 * 	 For example Address is 103, then stack memory refer the 103 Address. 
 * 
 * 
 * 
 */