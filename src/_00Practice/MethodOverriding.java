package _00Practice;
class Animal {
	public void MakeNoice() {
		System.out.println("Animal is Shouting");
	}
}

class Dog extends Animal {
	@Override
	public void MakeNoice() {
		System.out.println("Dog is Shouting");
	}
}

public class MethodOverriding {
	public static void main(String []args) {
		Animal ani = new Animal();
		Dog dog = new Dog();
		
		ani.MakeNoice();
		dog.MakeNoice();
		
		Animal dogani = new Dog(); 
		
		dogani.MakeNoice();
	}
}