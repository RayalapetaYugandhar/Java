package _27FinalKeyword;

class Calculator {    //if you don't want some one use your class then you make your class as final, the mooment you make class as final then you can't use the data present in the class in another class 
    public void show() {
        System.out.println("Class created by Yugandhar");
    }

    public int add(int n1, int n2) {
        return n1+n2;
    }
}

class AdvanceCal extends Calculator {  // here we are able to extend Calculator class, because Calculator is not final or constant
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
}

final class Checking {    // the mooment you make class as final, then you can't extend  
    public int sub(int n1, int n2) {
        return n1-n2;        
    }
}

// class CheckingFinal extends Checking {  // we are unable to extend Checking class, beacuse checking class is final or constant
//     public int mul(int n1, int n2) {
//         return n1*n2;        
//     }
// }

public class FinalClass {
    public static void main(String []args) {

        AdvanceCal adc = new AdvanceCal();
        adc.show();
        int r1 = adc.add(2,4);
        System.out.println(r1);
    }    
}


//if you don't want some one use your class then you make your class as final, 
// the mooment you make class as final then you can't use the data present in the class in another class 

// we are unable to extend Checking class, beacuse checking class is final or constant