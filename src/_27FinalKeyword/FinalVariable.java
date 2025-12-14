//We can use "Final" keyword with - Variable, Class, Method

package _27FinalKeyword;

public class FinalVariable {
    public static void main(String []args) {
        int num = 10;
        System.out.println(num);  // num value is 10 
        num = 5;                  // we are changing num value 10 to 5
        System.out.println(num);  //here we are able to change num value 

        final int n = 7;  // the point we make it "final" then we can't change the value, it means it is constant
        System.out.println(n);

        // n = 3;  // it won't work, because 
        // System.out.println(n);

    }
    
}
