package _15StaticKeyword;

class Mobile2
{
	int price;    // price and brand are instance variables, they are unique to each object.
	String brand;  // name is static variable, it is common to all objects.
	static String name; /*If we use 'static' to the 'name' Variable, it means name variable is common to all objects*/
						// name is belonging to class not to the object. that's why we can call static variable with class name also.
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
			obj1.price = 5000;
			Mobile2.name = "SmartPhone";       //name is the static variable and it is common for all the objects and that's why we can call 'name' with the class name it self.
												//	In Non static method we can use static variable there is no harm.  				
			
		Mobile2 obj2 = new Mobile2(); 
			obj2.brand = "Samsung";			
			obj2.price = 4000;
			Mobile2.name = "Smart";
			
			Mobile2.name="phone"; /*Here we are trying to assign 'phone' to name variable*/
			
			/*Here we are trying to assign 'phone' to name variable which is present in obj1, But it changed value to obj2 as well*/
		
			obj1.show();
			obj2.show();
	}

}

