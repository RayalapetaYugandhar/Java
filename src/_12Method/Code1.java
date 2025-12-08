package _12Method;

class Computer
{
	public void PlayMusic()     /*void - Here we are not expecting anything in return..That's why we used 'void'*/
	{  
		System.out.println("Music Playing..");
	}
	public String getMeAPen()   /*String - Here we are expecting Pen in return..That's why we used 'String'*/
	{
		return "Pen";			 /*int - Here we are expecting something in return..That's why we used 'int'...For storing number we used 'int'*/
	}
}

public class Code1 {
	public static void main(String []args)
	{
		Computer obj = new Computer();
		
		obj.PlayMusic();
		
		String str = obj.getMeAPen();
		System.out.println(str);
				
	}

}
