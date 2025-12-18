package _39Exception;

public class ExceptionHandling {
    public static void main(String []args) {
        int i =4;
        int j =0;

        int num [] = new int[5];
        String str = null;
        try{   //if any condition got failed, immediatly it will go to catch block
            j = 18/i;
            System.out.println(j);

            System.out.println(num[0]);  //we haven't assigned any values, so it will take default value as "0"
            System.out.println(num[4]);
            
            System.out.println(str.length());

        }catch(ArithmeticException e) {
            System.out.println("Problem in Calculation");        
        }catch(NullPointerException e) {
            System.out.println("Null values not allowed");        
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Limit Exceeded");        
        }catch(Exception e) {
            System.out.println("Default execution" + e);
        }
    }
}
