package _29UpCastingAndDownCasting;

class Casting {
    public void show1() {
        System.out.println("In A Show1");
    }
    public void show2() {
        System.out.println("In A Show2");
    }
}

class CastingUp extends Casting {
    public void show3() {
        System.out.println("In B Show2");
    }
}

public class UpCasting {
    public static void main(String []args) {
        Casting cast = new CastingUp();  // reference Casting and object of CastingUp. EX:- A obj = new B()
        cast.show1();
        
        Casting cast1 = (Casting) new CastingUp();  //type casting with the parent, here we are type casting the parent so this consept is called as "UpCasting"
        cast1.show2();

    }

}


/*  Example:- 

 int a = 10;
 double b = 5.7;

 int c = (int)b;   // type casting 

*/