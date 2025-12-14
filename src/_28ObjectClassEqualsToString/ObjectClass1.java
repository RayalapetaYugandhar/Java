package _28ObjectClassEqualsToString;

class Laptops {
    String model;
    int price;

    // public String toString(){   //if you separatly create toString() method, then it will take this values
    //     return model + ":" + price;
    // }
    
    public String toString() {   //Auto Suggested toString() method by vscode
        return "Laptop [model=" + model + ", price=" + price + "]";
    }    
}

public class ObjectClass1 {
    public static void main(String []args) {
        Laptops lp = new Laptops();
        lp.model ="Dell";
        lp.price =1000;

        System.out.println(lp);  //Output - Laptop@79fc0f2f  //before creating toString() method in laptop class

        System.out.println(lp.toString());  //Output - Laptop@79fc0f2f
        
    }
}    // after creating toString() method in Laptops class //output - Dell:1000


//Every time when we try to print "lp", by default it will call "toString()" method, ever if we don't mention

// // This is the reason for above output
//   public String toString() {
//       return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
//   }