package _18Encapsulation;
class Encaps{
    private String name; 
    private int age; 

    // Getter for name
    public String getName() { 
        return name; 
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;  
    }       
    
    // Getter for age
    public int getAge() {
        return age;  
    }

    //setter for age
    public void setAge(int age) { 
        this.age = age; 
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Encaps e = new Encaps();  
        e.setName("King");  
        e.setAge(27);           

        System.out.println("Name: " + e.getName() + "  Age: " + e.getAge());  //combined print statement

        System.out.println("Name: " + e.getName()); //separate print statement
        System.out.println("Age: " + e.getAge());
    }
    
}

