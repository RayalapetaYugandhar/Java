package _15StaticKeyword;

class Mobile2
{
	int price;
	String brand;
	static String name; /*If we use 'static' to the 'name' Variable, it means name variable is common to all objects*/
	
	public void show()
	{
		System.out.println(name + ":" + brand + ":" + price);
	}
}
public class Demo2 {
	public static void main(String []a)
	{
		Mobile2 obj1 = new Mobile2();
			obj1.brand = "Apple";
			Mobile2.name = "SmartPhone";       //name is the static variable and it is common for all the objects and that's why we can call 'name' with the class name it self.
												//	In Non static method we can use static variable there is no harm.  	
			obj1.price = 5000;
			
		Mobile2 obj2 = new Mobile2(); 
			obj2.brand = "Samsung";
			Mobile2.name = "SmartPhone";
			obj2.price = 4000;
			
			Mobile2.name="phone"; /*Here we are trying to assign 'phone' to name variable*/
			
			/*Here we are trying to assign 'phone' to name variable which is present in obj1, But it changed value to obj2 as well*/
		
			obj1.show();
			obj2.show();
	}

}

