package _29UpCastingAndDownCasting;

class Casting1 {                         //A
    public void show1() {
        System.out.println("In A Show1");
    }
    public void show2() {
        System.out.println("In A Show2");
    }
}

class CastingDown extends Casting1 {            //B
    public void show3() {
        System.out.println("In B Show3");
    }
}

public class DownCasting {
    public static void main(String []args) {
        Casting1 cast = new CastingDown();  // reference Casting and object of CastingUp. EX:- A obj = new B()
        cast.show1();
        
        CastingDown cast1 = (CastingDown) cast;  //Down Casting  //"cast" reference of A and object of B
        cast1.show3();

    }  //cast is the prarent reference and we are downcasting it to child reference 

}
