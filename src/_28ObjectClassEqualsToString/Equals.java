
// Package declaration: keeps the class under this package.
package _28ObjectClassEqualsToString;

import java.util.Objects;

// Class representing a device with 'model' and 'price'.
class Device {
    // Private fields (encapsulation).
    private String model;
    private int price;

    // Parameterised constructor to set fields at object creation.
    public Device(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // Getter for 'model': read-only access from outside.
    public String getModel() {
        return model;
    }

    // Getter for 'price': read-only access from outside.
    public int getPrice() {
        return price;
    }

    // Overriding equals(Object) to define logical equality for Device.
    @Override
    public boolean equals(Object obj) {
        // Same reference → equal.
        if (this == obj) return true;

        // Null → not equal.
        if (obj == null) return false;

        // Strict type check: only equal to another Device (not subclasses).
        // Use 'instanceof' instead if you want to allow subclass equality.
        if (getClass() != obj.getClass()) return false;

        // Safe cast after type check.
        Device other = (Device) obj;

        // Logical equality: compare both fields; Objects.equals handles null safely.
        return price == other.price &&
               Objects.equals(model, other.model);
    }

    // hashCode must be consistent with equals (same fields).
    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    // Human-readable representation (useful for logs/prints).
    @Override
    public String toString() {
        return "Device{model='" + model + "', price=" + price + "}";
    }
}

// Public class with main method (file name must be Equals.java).
public class Equals {
    public static void main(String[] args) {
        // Create two devices with the same values.
        Device d1 = new Device("Dell", 1000);
        Device d2 = new Device("Dell", 1000);

        // Should be true: logical equality via equals(Object).
        System.out.println(d1.equals(d2)); // true

        // If equals is true, hashCodes must match (contract).
        System.out.println(d1.hashCode() == d2.hashCode()); // true

        // Uses toString() for readable output.
        System.out.println(d1); // Device{model='Dell', price=1000}
    }
}