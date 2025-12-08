/*Count Occurrences of a Word(Case-insensitive)
 * 
 * Statement : Write a function countOccurrences (String text, String word) 
 * that returns how many times word appears in test (case-insensitive).
 * 
 * */

package _00Practice;

public class InterviewQuestion1 {

    public static void main(String[] args) {

        // The sentence where we want to count the word
        String text = "Hello hello HeLLo world, hello!";

        // The word we want to count
        String word = "hello";

        // Calling the method and storing the result
        int result = countOccurrences(text, word);

        // Printing the final count
        System.out.println("Occurrences: " + result);
    }

    // Method to count how many times 'word' appears in 'text'
    public static int countOccurrences(String text, String word) {

        // If text or word is missing, return 0
        if (text == null || word == null) return 0;

        // Convert both to lower case so comparison becomes case-insensitive
        text = text.toLowerCase();
        word = word.toLowerCase();

        // Split the text into words.
        // \\W+ means split by any NON-word character (space, comma, ., !)
        String[] arr = text.split("\\W+");

        int count = 0; // Start counter from 0

        // Simple for loop to go through each word in the array
        for (int i = 0; i < arr.length; i++) {

            // Check if current word equals the target word
            if (arr[i].equals(word)) {
                count++; // Increase count if matched
            }
        }
        
        
//        for (String w : arr) {   // loops will work same as above loop
//            if (w.equals(word)) {
//                count++;
//            }
//        }


        // Return how many times the word appeared
        return count;
    }
}


//Then loop runs like:
//
//1st round → w = "hello"
//2nd round → w = "hello"
//3rd round → w = "hello"
//4th round → w = "world"
//5th round → w = "hello"

/* What this code does

Converts entire sentence into lowercase

Splits text into individual words

Compares each word

Counts how many times it matches

Prints the total count */
