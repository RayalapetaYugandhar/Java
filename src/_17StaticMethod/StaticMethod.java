package _17StaticMethod;
class StaticMet {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
    public static void show1(StaticMet st) {          //// with the object reference we can 
                                                            // call both static and non-static method and variable in static method
        System.out.println(st.brand + ":" + st.price + ":" + name);
    }
}
public class StaticMethod {
    public static void main(String []args) {
        StaticMet st = new StaticMet();
            st.brand = "BMW";
            st.price = 5000000;
            StaticMet.name = "Car";

        StaticMet st1 = new StaticMet();
            st1.brand = "Honda";
            st1.price = 5000;

        st.show(); // calling non-static method with object reference
        st1.show(); // calling non-static method with object reference
        StaticMet.show1(st); // calling static method with class name and passing object reference

    }
}


// we can call static method with class name
// we can't call non-static method with class name
// we can use static variable in static method,but can't use non static variable in static method directly

// if we want to call non-static method or variable in static method, we need to create object of class

// with the object reference we can call both static and non-static method and variable in static method