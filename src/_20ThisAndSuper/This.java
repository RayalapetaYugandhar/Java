package _20ThisAndSuper;

class A{
    public A(){  // Default Constructor
        super();     
        System.out.println("Class A");
    }

    public A(int n){
        super();     
        System.out.println("Class A with parameter");
    }
}

class B extends A{  // Default Constructor extends another Default Constructor
    public B(){   
        super();   // calling parameterized constructor of class A
        System.out.println("Class B");
    }   
    public B(int n){    
        this();    
        System.out.println("Class B with parameter");
    }
}
public class This {
    public static void main(String []args) {
        B ex = new B(10);
    }
}



// "this" method will execute the constructor of a same class
// "super" mothod will execute the constructor of a super class


//Answer:-
    // Class A
    // Class B
    // Class B with parameter




// every class in java extends the object class

// ex:- 

// class A extends Object{ 
//     public A(){  // Default Constructor
//         super();     
//         System.out.println("Class A");
//     }

//     public A(int n){
//         super();     
//         System.out.println("Class A with parameter");
//     }
// }
// class B extends A{  // Default Constructor extends another Default Constructor
//     public B(){   
//         super(5);   // calling parameterized constructor of class A
//         System.out.println("Class B");
//     }   
//     public B(int n){    
//         super();    
//         System.out.println("Class B with parameter");
//     }
// }    