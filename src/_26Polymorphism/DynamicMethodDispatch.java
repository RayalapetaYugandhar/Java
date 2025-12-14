//Run time Polymorphism is also called as "Dynamic Method Dispatch" or "Method Overriding" or "Late Binding" or "Dynamic Polymorphism"


package _26Polymorphism;
class A{
    public void show(){
        System.out.println("In A Show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}

class C{
    public void show(){
        System.out.println("In B Show");
    }
} 

class D extends B {  //"D"  class extends "B" class, and "B" class is extending "A" class
    public void show(){
        System.out.println("In D Show");
    }
} 

public class DynamicMethodDispatch {
    public static void main(String []args) {
        A obj = new A();  // if you create reference of "A"  class and object of "A" class then "show()" method calls inside the "A" class, because we are creating obejct of "A" class
         obj.show();

        // A obj = new B();  //  A obj = new B(); or obj = new B(); both are same 

         obj = new B();  // if you create reference of "A"  class and object of "B" class then "show()" method calls inside the "B" class, because we are creating obejct of "B" class
         obj.show();

        //  A obj = new C();  // it won't work because we are not extending "C" with "A", that's why you can't create reference of "A"
        //  obj.show();

        obj = new D();   //reference of "A"  class and object of "D" class
        obj.show();     //"D"  class extends "B" class, and "B" class is extending "A" class, so we can use "A" reference
    }
}

//reference type is parent and obejct is child 
// If you want achieve DynamicMethodDispatch or Runtime polymorphism, you have to use "extends" keyword

// obj.show() - same object behaving differently in different sutuation 