package _28ObjectClassEqualsToString;
class Lapt {
    String model;
    int price;    
}

public class isEquals {
    public static void main(String []args) {
        Lapt lp = new Lapt();
        lp.model ="Dell";
        lp.price =1000;

        Lapt lp1 = new Lapt();
        lp1.model ="Dell";
        lp1.price =1000;

        boolean results = lp.equals(lp1);

        System.out.println(results);  //outpu - false
        
        
    }
}
//equals method implemented in "isEqualsImplemented" file

// if you want the correct output then we have implement "equals()" method in lapt class


// This is the reason for above output

//   public boolean equals(Object var1) {
//       return this == var1;
//    }