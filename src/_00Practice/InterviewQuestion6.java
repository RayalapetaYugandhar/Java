/*
 * Sorts the map by values in descending order
 *  Statement: You are given a Map<String, Integer> representing names and their 
 *  corresponding scores. Sorts the map by values in descending order
 * */

package _00Practice;

import java.util.*;                         // Imports all utility classes like Map, HashMap, LinkedHashMap
import java.util.stream.Collectors;         // Import Collectors for converting stream back to Map

public class InterviewQuestion6 {

    public static void main(String[] args) {

        // Creating a HashMap to store names and scores
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 95);
        scores.put("Carol", 75);
        scores.put("Dave", 95);

        System.out.println("Original: " + scores);   // Print original unsorted map

        // Call method to sort map by values descending
        Map<String, Integer> sorted = sortByValueDesc(scores);

        System.out.println("Sorted: " + sorted);     // Print sorted map
    }

    // Method to sort map based on values in descending order
    public static Map<String, Integer> sortByValueDesc(Map<String, Integer> map) {

        return map.entrySet()                        // Convert map into Set of entries (key + value)
                .stream()                            // Convert to stream for sorting operations
                .sorted((e1, e2) -> e2.getValue() - e1.getValue()) // Sort values ---> descending order
                .collect(Collectors.toMap(
                        e -> e.getKey(),             // Key mapper
                        e -> e.getValue(),           // Value mapper
                        (a, b) -> a,                 // Duplicate key resolver (not needed here)
                        LinkedHashMap::new           // Store output in LinkedHashMap to maintain order
                ));
    }
}


