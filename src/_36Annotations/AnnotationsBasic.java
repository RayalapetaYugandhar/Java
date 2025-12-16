package _36Annotations;
class A {
    public void show() {
        System.out.println("In A Show");
    }
}
class B extends A{
    public void show() {
        System.out.println("In B Show");
    }
}
public class AnnotationsBasic {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}


//it will work normally

//check "Annotation" code for clear idea why to use Annotations 