package _9SwitchStatement;

public class Example3 {
	public static void main(String []args)
	{
		int n = 8;
		switch (n){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wedesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sundsay");			
				break;
			default:
				System.out.println("None of the above condition matches, Iam default value");
		}
	}

}
