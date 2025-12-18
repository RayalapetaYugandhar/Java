package _39Exception;

public class MyException {
    public static void main(String []args) {
        int i =5;  //if you change the value then you can see exceptions
        int j =0;

        try{
            j = 18/i;
            System.out.println(j);
        }catch(Exception e) {
            System.out.println("Code failed in try block" + e);
        }
    }
}


// catch block will executes only if try block failes