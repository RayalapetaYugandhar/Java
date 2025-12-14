package _28ObjectClassEqualsToString;
class Computer {
    String model;
    int price;    

    public boolean equals(Computer that) {
        return this.model.equals(that.model) && this.price == that.price;
    }  //while comparing we can use "this" and "that"
}

        //we have to use "this" for class name(Computer) and we can change variable name "that" to anything 
public class isEqualsImplemented {
    public static void main(String []args) {
        Computer comp = new Computer();
        comp.model ="Dell";
        comp.price =1000;

        Computer comp1 = new Computer();
        comp1.model ="Dell";
        comp1.price =1000;

        boolean results = comp.equals(comp1);  // now it won't use this equals(), it will use my equals method present in Computer class

        System.out.println(results);  //Before creating equals() method in Computer class output - false
                                      //After creating equals() method in Computer class output - true
        
    }
}


// if you want the correct output then we have implement "equals()" method in Computer class


// This is the reason for above output

//   public boolean equals(Object var1) {
//       return this == var1;
//    }