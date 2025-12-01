package _14Strings;

public class String_1 {
	public static void main(String []a)
	{
		String name = new String("Royal");
//		String name = "Royal";      /*Directly we can assign the value to the String*/
									/*For String we have write everything in Double quotes " " */
		
		System.out.println(name);
		
		System.out.println(name +  "Yugandhar");
		System.out.println("Yugandhar" +  name);
		System.out.println(name.concat(" " + "Yugandhar Babu"));
	}

}
