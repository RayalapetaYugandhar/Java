package _15StaticKeyword;

class Mobile1
{
	int price;
	String brand;
	static String name; /*If we use 'static' to the 'name' Variable, it means name variable is common to all objects*/
	
	public void show()
	{
		System.out.println(name + ":" + brand + ":" + price);
	}
}
public class Demo1 {
	public static void main(String []a)
	{
		Mobile1 obj1 = new Mobile1();
			obj1.brand = "Apple";
			obj1.name = "SmartPhone";
			obj1.price = 5000;
			
		Mobile1 obj2 = new Mobile1();
			obj2.brand = "Samsung";
			obj2.name = "SmartPhone";
			obj2.price = 4000;
			
			obj1.name="phone"; /*Here we are trying to assign 'phone' to name variable*/
			
			/*Here we are trying to assign 'phone' to name variable which is present in obj1, But it changed value to obj2 as well*/
		
			obj1.show();
			obj2.show();
	}

}

