package _20ThisAndSuper;

class AG{     // every class in java extends the object class
    public AG(){  // Default Constructor
        super();
        System.out.println("Class A");
    }

    public AG(int n){
        super();
        System.out.println("Class A with parameter");
    }
}
class BG extends AG{  // Default Constructor extends another Default Constructor
    public BG(){        
        super();
        System.out.println("Class B");
    }   
    public BG(int n){
        super(n); //We are mentioning super explicitly
        System.out.println("Class B with parameter");
    }
}
public class Super {
    public static void main(String []args) {
        BG ex = new BG(5);
    }
}

//changed names A - AG and B - BG

//Answer:-

// Class A with parameter
// Class B with parameter

//if we don't write super() in child class constructor, compiler will add it automatically as first statement of child class constructor

//If you want pass parameterized constructor then explicitly we have to mention super()


// super means call the constructor of super class

// if you call parameterized constructor of 'B', then will get values of  parameterized constructor of 'B' and parameterized constructor of 'A'

// Here we don't want to call default constructor, in that case explictly have to mention super()


// if you want call perticular constructor then you have to pass values in super()
