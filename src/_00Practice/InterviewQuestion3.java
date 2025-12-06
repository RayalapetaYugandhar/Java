
/*JSON Parsing - Extract Value without External Libraries
 * Statement: Extract "name" from simple SON string: ["id":10,"name" "Raghav") 
 * (Without using JacksonGson)
 * 
 * */

package _00Practice;

public class InterviewQuestion3 {

    // Method to extract "name" value from JSON
    public static String extractName(String json) {

        // Step 1: Remove { } and " characters
        json = json.replaceAll("[{}\"]", "");
        
        /*//Remove { } and " characters  // works same as above one
        		json = json.replace("{", "")
                   .replace("}", "")
                   .replace("\"", "");
         */

        // Step 2: Split JSON into key-value pairs
        // Split into key-value pairs (id:10 , name:Raghav)
        String[] parts = json.split(",");

        // Step 3: Loop through each part to find "name"
        for (String part : parts) {

            // Step 4: Check if this part starts with "name:"
            if (part.trim().startsWith("name:")) {

                // Step 5: Split at ":" and return the value (2nd part)
                return part.split(":")[1].trim();                
            }
            
          /*  // Find the pair that starts with name:
            if (part.trim().startsWith("name:")) {    // works same as above one

                // Split that pair by : and return the value
                String[] keyValue = part.split(":");
                return keyValue[1].trim();
            }
           */
        }

        // If name not found
        return null;
    }

    public static void main(String[] args) {

        String json = "{\"id\":10,\"name\":\"Raghav\"}";

        String name = extractName(json);

        System.out.println("Extracted Name: " + name);
    }
}
