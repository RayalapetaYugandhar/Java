package _20ThisAndSuper;

class AS{
    public AS(){  // Default Constructor
        super();     
        System.out.println("Class A");
    }

    public AS(int n){
        super();     
        System.out.println("Class A with parameter");
    }
}

class BS extends AS{  // Default Constructor extends another Default Constructor
    public BS(){   
        super(5);   // calling parameterized constructor of class A
        System.out.println("Class B");
    }   
    public BS(int n){    
        super();    
        System.out.println("Class B with parameter");
    }
}
public class Super2 {
    public static void main(String []args) {
        BS ex = new BS();
    }
}

//changed names A - AS and B - BS

// Answer:-

    // Class A with parameter
    // Class B

//if you want to print default constructor of B and parameterized constructor of A, 
// you just have to mention super in default constructor of B and pass value

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

