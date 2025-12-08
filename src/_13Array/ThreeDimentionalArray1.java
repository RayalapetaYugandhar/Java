
package _13Array;

public class ThreeDimentionalArray1 
{
    public static void main(String []args)
    {
        int num[][][] = new int [3][4][2];

        // Fill with random values
        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {                
                for(int k = 0; k <= 1; k++)
                {
                    // Math.random() returns a double in [0.0, 1.0); casting after *10 gives 0..9
                    num[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }
        
        // First print block (same structure as yours)
        for(int i = 0; i <= 2; i++)                 /*The 1 & 2 both loops work same*/
        {
            for(int j = 0; j <= 3; j++)
            {
                for(int k = 0; k <= 1; k++)
                {
                    System.out.print(num[i][j][k] + " ");  // print the element, not the array ref
                }
                System.out.println(); // new line after each j row to make output readable
            }
            System.out.println();      // blank line after each i plane
        }
        
        System.out.println();  /*This System.out.println(); is used to add the space between 2 loops*/ 
         
        // Second print block (kept as in your code)
        for(int i = 0; i <= 2; i++)                 /*The 1 & 2 both loops work same*/
        {
            for(int j = 0; j <= 3; j++)
            {
                for(int k = 0; k <= 1; k++)
                {
                    System.out.print(num[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
