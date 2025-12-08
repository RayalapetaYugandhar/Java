
package _13Array;

public class ThreeDimentionalArrayNested {
    public static void main(String[] args) {

        int num[][][] = new int[3][4][6];

        // Fill with random values (using index-based loops for control)
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                for (int k = 0; k <= 5; k++) {
                    // Math.random() returns a double in [0.0, 1.0); casting after *10 gives 0..9
                    num[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        // Print using enhanced for-each loops (your preferred style)
        /* Enhanced for loop or for-each loop */
        /* The 1 & 2 both loops work same */
        for (int[][] plane : num) {          // plane = 4x6 slice (j x k)
            for (int[] row : plane) {        // row = 6 columns
                for (int val : row) {        // val = each element in the row
                    System.out.print(val + " ");
                }
                System.out.println();        // new line after each row
            }
            System.out.println();            // blank line after each plane
        }

        System.out.println();  /*This System.out.println(); is used to add the space between 2 loops*/ 
       }
}
