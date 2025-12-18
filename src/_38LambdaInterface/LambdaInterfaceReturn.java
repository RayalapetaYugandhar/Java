package _38LambdaInterface;

@FunctionalInterface
interface LambdaReturn {
    int show(int i, int j);
}

public class LambdaInterfaceReturn {
    public static void main(String []args) {
        LambdaReturn lbr = new LambdaReturn() {
            public int show(int i, int j){
                return i+j;                
            } 
        };

        // all are same

        LambdaReturn lr = (int i, int j) -> {
            return i+j;  
        };

        //when ever we have one statement that too return, then no need to write return we can remove "return" here

        //all are same 

        LambdaReturn lr1 = (int i, int j) -> i+j;  

        // all are same 
        LambdaReturn lr2 = ( i, j) -> i+j;  

        ///
        
        int result = lbr.show(3, 8);
        System.out.println(result);

        int result1 = lr.show(5, 2);
        System.out.println(result1);

        int result2 = lr1.show(8, 7);
        System.out.println(result2);

        int result3 = lr2.show(10, 7);
        System.out.println(result3);
    }
}
