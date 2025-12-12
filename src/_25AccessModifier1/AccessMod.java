package _25AccessModifier1;

class AMode {
    public void protec(){
        AccessMod acm = new AccessMod();
        System.out.println(acm.number);
    }
}

public class AccessMod {
    int marks = 7; // if you don't mention public in variable, then you can't access this variable from another package
    public int age = 26;   // access type is public, so we can access this variable from another package
    protected int number = 34;
    public void show(){

    }
}