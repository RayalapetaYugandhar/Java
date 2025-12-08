package _15StaticKeyword;

class Mobile
{
	int price;
	String brand;
	String name;
	
	public void show()
	{
		System.out.println(name + ":" + brand + ":" + price);
	}
}
public class Demo {
	public static void main(String []a)
	{
		Mobile obj1 = new Mobile();
			obj1.brand = "Apple";
			obj1.name = "SmartPhone";
			obj1.price = 5000;
			
		Mobile obj2 = new Mobile();
			obj2.brand = "Samsung";
			obj2.name = "SmartPhone";
			obj2.price = 4000;
		
			obj1.show();
			obj2.show();
	}

}


/*This is normal code, without static keyword.... in next program will see how static keyword will work */ 
