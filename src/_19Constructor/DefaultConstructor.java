package _19Constructor;

class ConstructorExp {
    private String name;
    private int age;

    // public ConstructorEx() {                         // if you don't create a default constructor,                                                           
    //     this.name = "Default Name";                   //  then java will create default constructor and take int value as '0' and String value as 'null'
    //     this.age = 0;
    // }

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

public class DefaultConstructor {
    public static void main(String []args) {
        ConstructorExp cx = new ConstructorExp();    
        System.out.println("Name: " + cx.getName() + "  Age: " + cx.getAge());  // here default constructor values are printed

        ConstructorExp c1 = new ConstructorExp();
        c1.setName("Yugandhar");
        c1.setAge(26);

        System.out.println("Name: " + c1.getName() + "  Age: " + c1.getAge()); //here assigned values are printed
    }
    
}

//if you don't create a default constructor, then java will create default constructor and take int value as '0' and String value as 'null'
//if you create a default constructor, then the values assigned in the constructor will be printed.
//if you create a parameterized constructor, then java will not create default constructor. you have to create default constructor explicitly if needed.
//if you create a parameterized constructor, then the values assigned in the parameterized constructor will be printed.
//if you create both default and parameterized constructor, then the values assigned in the respective constructors will be printed based on the object creation.
//if you create a constructor with parameters, then you have to pass the parameters while creating the object.
//if you create a constructor without parameters, then you don't have to pass any parameters while creating the object.