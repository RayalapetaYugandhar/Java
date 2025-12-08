package _4typeConversionAndCasting;

public class Code5 {
	public static void main(String []args)
	{		
		int a = 257;
		byte b = (byte)a;
		int c = 200;
		byte d = (byte)c;
		System.out.println(b);  //  1
		System.out.println(d);  // -56
	}
}


/* 
 * It will perform modular operation to find reminder, While performing modular operation byte range is 256
 * 
 * 						257/256 = 1
 * 						200/256 = -56
 */