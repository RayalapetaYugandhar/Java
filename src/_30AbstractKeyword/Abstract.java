package _30AbstractKeyword;

abstract class Car {   //if you want to craete a "abstarct" method then class should also be a "abstract" class 
    public void drive(){    //Defining a method

    }   
    // when you open brackets, it means we are defining a method, 
    // if we don't know what to write in side a method then why to define
    // instead of defining a method we can declare a method 

    public abstract void driving();  //declaring a method
    
                            // here we don't know, how to implement a method, 
                            // in that case we are declaring a method, 
                            // if you want declare a method then you have to use "abstract" keyword
        //if you want to craete a "abstarct" method then class should also be a "abstract" class 
    public void playMusic() {
        System.out.println("Music playing in car");
    }
}

class Suzuki extends Car {    //if you don't want implement here, then this class should also be "abstract" class
    public void driving() {   //here we are implementing driving method //if you don't implement driving method it will give you warning
        System.out.println("I am implementing Driving method");
    }
}
public class Abstract {
    public static void main(String []args) {
        // Car car = new Car();  //we can't create a object of "abstract" class
        Car car1 = new Suzuki(); 
        car1.drive();
        car1.driving();
        car1.playMusic(); 
    }
}


//Note:-

/**
 * Abstarct class can have normal and abstract methods
 * 
 * If you don't declare abstract method in abstract class still it work 
 * 
 * We can create multiple abstract method in abstract class
 * 
 */