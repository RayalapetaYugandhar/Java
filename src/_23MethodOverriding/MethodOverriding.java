package _23MethodOverriding;

class Calculator {
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvanceCalculator extends Calculator {
    @Override   //The @Override annotation helps the compiler verify you're actually overriding a method (not accidentally overloading due to a signature mismatch).
    public int add(int n1, int n2) {
        // return n1 + n2;  // // <-- This overrides Calculator.add but does the same thing
        return n1 + n2 +1; // adds 1 extra to demonstrate different behavior
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
       AdvanceCalculator calc = new AdvanceCalculator();

       int r = calc.add(4, 8);
       System.out.println(r);
    }
}


// The @Override annotation helps the compiler verify you're actually overriding a method (not accidentally overloading due to a signature mismatch).
// To achieve method Overriding, we can write same method name and same parameters in another class 


// 🔁 Overriding vs Overloading (Don’t Confuse These)

// Overriding: Same method name and parameters, different class (subclass vs superclass), decided at runtime.
// Overloading: Same method name, different parameters, same class, decided at compile time.