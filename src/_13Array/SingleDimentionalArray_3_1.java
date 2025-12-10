
package _13Array;

public class SingleDimentionalArray_3_1 {
    public static void main(String[] args) {
        // Declare and allocate a 1D int array with 3 elements.
        // Initially, all elements are 0 by default.
        int num[] = new int[3];

        // Loop over indices 0, 1, 2 to fill the array.
        // for int Casting to int truncates the decimal, resulting in integers 0–9.        
		for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
        }

        // Enhanced for-loop (for-each) to read and print each value from the array.
        // 'n' is each element in 'num' in sequence.
        for (int n : num) {
            System.out.println(n); // Print the current element and move to the next            System.out.println(n); // Print the current element and move to the next line.
        }
    }
}

            // Math.random() returns a double in [0.0, 1.0).
            // Multiplying by 10 gives [0.0, 10.0).
