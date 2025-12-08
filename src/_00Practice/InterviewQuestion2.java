/*
 * Java Streams - FIlter & Collect Names
 * Statement: Given a list of User objects, return names of users older than 25.
 * */

package _00Practice;

import java.util.*;
import java.util.stream.*;

// Simple User class with name and age
class User {

    String name;
    int age;

    // Constructor to create a User object
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to return name
    public String getName() {
        return name;
    }

    // Getter method to return age
    public int getAge() {
        return age;
    }
}

public class InterviewQuestion2 {

    public static void main(String[] args) {

        // Creating a list of User objects
        List<User> users = Arrays.asList(
                new User("Ravi", 24),
                new User("Megha", 28),
                new User("Amit", 30),
                new User("Kiran", 22)
        );

        // Calling the method that filters users older than 25
        List<String> result = getNamesOlderThan25(users);

        // Printing the final resulting list of names
        System.out.println("Users older than 25: " + result);
    }

    // Method that returns list of names of users older than 25
    public static List<String> getNamesOlderThan25(List<User> users) {

        return users.stream()
                .filter(u -> u.getAge() > 25)
                .map(User::getName)
                .collect(Collectors.toList());
    }
}


/*
 * users.stream()
 * -------------------
 * Converts the List into a Stream.
 * This allows us to use filtering, mapping, collecting, etc.
 */

/*
 * .filter(u -> u.getAge() > 25)
 * -------------------
 * Checks every user.
 * Only keeps users whose age is greater than 25.
 * Others are removed.
 */

/*
 * .map(User::getName)
 * -------------------
 * Converts each User object into just the user's name.
 * Example: new User("Megha", 28) → "Megha"
 */

/*
 * .collect(Collectors.toList())
 * -------------------
 * Converts the stream back into a List<String>
 */

