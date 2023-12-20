package _12Method;

class Shoap
{
	int cost = 10;
	public void PlayMusic()     /*void - Here we are not expecting anything in return..That's why we used 'void'*/
	{  
		System.out.println("Music Playing..");
	}
	public String getMeAPen()   /*String - Here we are expecting Pen in return..That's why we used 'String'*/
	{
		if( cost>=10)
			return "Pen";			 /*int - Here we are expecting something in return..That's why we used 'int'...For storing number we used 'int'*/
		else 
			return "Nothing";
	}
}


public class Code2 {
	public static void main(String []args)
	{
		Shoap obj = new Shoap();
		
		obj.PlayMusic();
		
//		String str = obj.getMeAPen(cost: 10);  /*Have to check why it is not work*/
		String str = obj.getMeAPen();

		System.out.println(str);
				
	}

}
