package _24Packages;  //package where the java file present

// import _22Inheritance.AdvanceCalculator;  // importing the AdvanceCalculator file form _22Inheritance folder
// import _22Inheritance.Calc;
// import _22Inheritance.Calculator;

// now we have all files present in the same package or folder then why to import every single file, to get all files present in the folder we can use "*"

import _22Inheritance.*;  // work same as above import // here we are importing all the files present in the _22Inheritance folder

public class PackageDeclaration {
    public static void main(String []args) {

        Calc u = new Calc();
        Calculator c = new Calculator();  // in Calculator file we have 2 methods
        AdvanceCalculator p = new AdvanceCalculator();  //in AdvanceCalculator we extends the Calculator methods

        int r1 = p.add(3, 8);  // with help of reference variable 'p' we are calling methods present in the AdvanceCalculator
        int r2 = p.sub(5, 2);
        int r3 = p.mul(7, 4);
        int r4 = p.div(4, 2);

        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
        
    }
}

//Here we don't have any data or files present in current folder, 
// with help of "import" we imported all files present in another folder and using here 

// with the help of "*" we can import all files present in the folder 

            // import _22Inheritance.AdvanceCalculator; 
            // import _22Inheritance.Calc;
            // import _22Inheritance.Calculator;

                            // with help of "*" we imported all files present in _22Inheritance

            // import _22Inheritance.*; 