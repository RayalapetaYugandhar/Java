package _22Inheritance;

public class AdvanceCalculator extends Calculator{  // child class inheriting parent class Calculator
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
}



//parent class is Calculator class
//Child class is AdvanceCalculator class

//Inheritance is the process of child class can inherit the properties and behaviors (methods) of parent class.

//child class can have its own methods and properties in addition to the parent class methods and properties.

// here parent class have add and sub methods
// here child class have mul and div methods in addition to parent class methods add and sub

// with help of "extends" keyword we can inherit the parent class methods and properties in child class