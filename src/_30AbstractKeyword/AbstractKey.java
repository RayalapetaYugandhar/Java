package _30AbstractKeyword;

abstract class Cars {   //if you want to craete a "abstarct" method then class should also be a "abstract" class 
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
    public abstract void racing();

    public void playMusic() {
        System.out.println("Music playing in car");
    }
}

abstract class BMW extends Cars {    //if you don't want implement here, then this class should also be "abstract" class
    public void driving() {   //here we are implementing driving method //if you don't implement driving method it will give you warning
        System.out.println("I am implementing Driving method");
    }
    //if you don't implement racing() method here, then you have to make this class also "abstract" class
}

class Audi extends BMW {  //concrete class 
    public void racing(){  //here we are declaring "racing()" method 
        System.out.println("It's racing time");
    }
}
public class AbstractKey {
    public static void main(String []args) {
        // Car car = new Car();  //we can't create a object of "abstract" class
        Cars car1 = new Audi(); 
        car1.drive();
        car1.driving();
        car1.playMusic(); 
        car1.racing();
    }
}


//Note:-

/**
 * Abstract class can have normal and abstract methods
 * 
 * If you don't declare abstract method in abstract class still it work 
 * 
 * We can create multiple abstract method in abstract class
 * 
 * Abstract keyword can be used with methods
 * 
 */