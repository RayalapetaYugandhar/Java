package _27Final;

class Calcu {    
    public void show() {
        System.out.println("Class created by Yugandhar");
    }

    public int add(int n1, int n2) {
        return n1+n2;
    }
}

class AdvCal extends Calcu {    //here we are able to access all methods present in "Calcu" class 
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
    public void show() {
        System.out.println("Class created by King");
    }
}

class MethodFinal {
    final public void show1() {  // the mooment you make method as final, you can't access this method in another class
        System.out.println("Class created by Yuga");
    }
    public int mul(int n1, int n2) {
        return n1*n2;
    }
}

class Final extends MethodFinal {
    // public void show1() {  //we are unable to access "show1()" because show1 method is defind as final in MethodFinal class
    //     System.out.println("Class created by YugandharBabu");
    // }
    public int mul(int n1, int n2) {
        return n1*n2+1;
    }
}

public class FinalMethod {
    public static void main(String []args) {

        AdvCal adc = new AdvCal();
        adc.show();
        int r1 = adc.add(2,4,7);
        System.out.println(r1);

        Final fn = new Final();
        fn.show1();
        int r5 = fn.mul(3,7);
        System.out.println(r5);
    }  
}

//we you define final method in parent class, then we can't access the perticular method in child class 
// //we are unable to access "show1()" because show1 method is defind as final in MethodFinal class