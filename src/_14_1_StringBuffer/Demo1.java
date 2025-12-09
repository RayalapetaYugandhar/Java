package _14_1_StringBuffer;

public class Demo1 {
	public static void main(String []a)
	{
		StringBuffer sb = new StringBuffer("Yugandhar");
		
		System.out.println(sb.capacity());

		System.out.println(sb.length());

		sb.append(" Babu");		
		System.out.println(sb);

		sb.deleteCharAt(2);
		System.out.println(sb);

		sb.insert(0, "Rayalapeta ");
		System.out.println(sb);
		
		sb.insert(11, "yuga ");
		System.out.println(sb);
				
	}

}
