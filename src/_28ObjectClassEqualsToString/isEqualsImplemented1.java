package _28ObjectClassEqualsToString;
class Computers {
    String model;
    int price;
    
    //instead of using our own equals() method, better to use Auto Suggested equals() method by vscode

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    
    public boolean equals(Computers obj) {  //Computers is class and obj is varibale 
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Computers other = (Computers) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }        

    
}

        //we have to use "this" for class name(Computers) and we can change variable name "that" to anything - here we use obj for that

public class isEqualsImplemented1 {
    public static void main(String []args) {
        Computers comp = new Computers();
        comp.model ="Dell";
        comp.price =1000;

        Computers comp1 = new Computers();
        comp1.model ="Dell";
        comp1.price =1000;

        boolean results = comp.equals(comp1);  // now it won't use this equals(), it will use my equals method present in Computers class

        System.out.println(results);  //Before creating equals() method in Computers class output - false
                                      //After creating equals() method in Computers class output - true
        
    }
}


// if you want the correct output then we have implement "equals()" method in Computers class


// This is the reason for above output

//   public boolean equals(Object var1) {
//       return this == var1;
//    }