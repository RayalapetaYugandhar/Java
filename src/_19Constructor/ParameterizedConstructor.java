package _19Constructor;

class ConstructorParameterized {
    private String name;
    private int age;

    public ConstructorParameterized() { // default constructor
        this.name = "Default Name"; // assign default value
        this.age = 0;               // assign default value
    }

    public ConstructorParameterized(int a, String n){ // parameterized constructor
        this.age = a;  // assign parameter value to instance variable
        this.name =n;  // assign parameter value to instance variable
    }  // if we don't write "this" keyword then also it will work but to avoid confusion we use this keyword

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class ParameterizedConstructor {
    public static void main(String []args) {

        ConstructorParameterized cx = new ConstructorParameterized();  // referring to default constructor
            System.out.println("Default Constructor Values - " + "Name: " + cx.getName() + "  Age: " + cx.getAge());  // here default constructor values are printed

        ConstructorParameterized c1 = new ConstructorParameterized(); // Taking local object to assign values through setter methods
            c1.setName("Yugandhar");
            c1.setAge(26);
            System.out.println("Values Assigned locally - " + "Name: " + c1.getName() + "  Age: " + c1.getAge()); //here assigned values are printed
        
        ConstructorParameterized c2 = new ConstructorParameterized(10, "Yuga");  // here we are assigning values through parameterized constructor
            System.out.println("Values Assigned through Parameterized Constructor - " + "Name: " + c2.getName() + "  Age: " + c2.getAge()); //here assigned values are printed

    }
    
}

 //parameterized constructor is a constructor that takes arguments/parameters to initialize an object with specific values when it is created.

//  Example:

//     public ConstructorParameterized(int a, String n){ // parameterized constructor
//         this.age = a;  // assign parameter value to instance variable
//         this.name =n;  // assign parameter value to instance variable
//     }  // if we don't write 'this' keyword then also it will work but to avoid confusion we use this keyword

//     ConstructorParameterized c2 = new ConstructorParameterized(10, "Yuga");    
//         // here we are assigning values through parameterized constructor
//         // this will call the parameterized constructor and assign age=10 and name="Yuga"
//         System.out.println("Values Assigned through Parameterized Constructor - " + "Name: " + c2.getName() + "  Age: " + c2.getAge()); //here assigned values are printed
        
//         // Output:

//              Values Assigned through Parameterized Constructor - Name: Yuga  Age: 10