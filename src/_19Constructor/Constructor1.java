package _19Constructor;
class ConstructorEx {
    private String name;
    private int age;

    public ConstructorEx() { // default constructor
        this.name = "Default Name";
        this.age = 0;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class Constructor1 {
    public static void main(String []args) {
        ConstructorEx cx = new ConstructorEx();
        System.out.println("Name: " + cx.getName() + "  Age: " + cx.getAge());  // here default constructor values are printed

        ConstructorEx c1 = new ConstructorEx();
        c1.setName("Yugandhar");
        c1.setAge(26);

        System.out.println("Name: " + c1.getName() + "  Age: " + c1.getAge()); //here assigned values are printed
    }
    
}
