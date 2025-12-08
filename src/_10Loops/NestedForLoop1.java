package _10Loops;

public class NestedForLoop1 {
	public static void main(String []args)
	{
		for(int i=1; i<=7; i++)
		{
			System.out.println("Day" +i);
			for(int j=1; j<=9; j++)
			{
				System.out.println(" "+(j+8) + "-" + (j+9));
			}
		}
	}
}

//Here we are printing Day with time one hour duration 9-10 ------------------- 17-18 