package _14_1_StringBuffer;

//public class Demo {
//	public static void main(String []a)
//	{
//		StringBuffer sb = new StringBuffer();
//		
//		System.out.println(sb.capacity());
//	}
//
//}


/*String Buffer will give you the size of the buffer, which is 16 bytes */

/*Comment the upper part of code and try this as well*/

//public class Demo {
//	public static void main(String []a)
//	{
//		StringBuffer sb = new StringBuffer("Yugandhar");
//		
//		System.out.println(sb.capacity());
//	}
//
//}

/*Comment the upper part of code and try this as well*/

//public class Demo {
//	public static void main(String []a)
//	{
//		StringBuffer sb = new StringBuffer("Yugandhar");
//		sb.append(" Babu");
//		
//		System.out.println(sb);
//	}
//
//}

///*Comment the upper part of code and try this as well*/
//
//public class Demo {
//	public static void main(String []a)
//	{
//		StringBuffer sb = new StringBuffer("Yugandhar");
//		sb.deleteCharAt(2);
//
//		System.out.println(sb);
//	}
//
//}

///*Comment the upper part of code and try this as well*/
//
//public class Demo {
//	public static void main(String []a)
//	{
//		StringBuffer sb = new StringBuffer("Yugandhar");
//		sb.insert(0, " java");
//
//		System.out.println(sb);
//	}
//
//}

/*Comment the upper part of code and try this as well*/

//public class Demo {
//	public static void main(String []a)
//	{
//		StringBuffer sb = new StringBuffer("Yugandhar");
//		sb.append(" Babu");
//		sb.insert(9, " java");
//
//		System.out.println(sb);
//	}
//
//}

/*Comment the upper part of code and try this as well*/

public class Demo {
	public static void main(String []a)
	{
		StringBuffer sb = new StringBuffer("Yugandhar");
		sb.append(" Babu");
		sb.ensureCapacity(100);  /*Minimum capacity will be 100*/

		System.out.println(sb);
	}

}