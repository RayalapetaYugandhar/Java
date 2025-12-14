package _28ObjectClassEqualsToString;
class Laptop {
    String model;
    int price;
}    

public class ObjectClass {
    public static void main(String []args) {
        Laptop lp = new Laptop();
        lp.model ="Dell";
        lp.price =1000;

        System.out.println(lp);  //Output - Laptop@79fc0f2f  //before creating toString() method in laptop class

        System.out.println(lp.toString());  //Output - Laptop@79fc0f2f
        
    }
}


//Every time when we try to print "lp", by default it will call "toString()" method, ever if we don't mention

// // This is the reason for above output
//   public String toString() {
//       return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
//   }