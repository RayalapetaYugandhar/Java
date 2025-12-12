package _25AccessModifier;

import _25AccessModifier1.*;  // importing files present in _25AccessModifier1 package

class prote extends AccessMod {
    
    public void protec(){        //we can access protected, because AccessMod in different package but we are calling with subclass
        System.out.println(number); 
    }
}

public class AccessModifier {
    public static void main(String []args){

        //file present in different package

        AccessMod access = new AccessMod();  //creating object of AccessMod class , AccessMod class present in _25AccessModifier1

        access.show();  // we can access show() method directly because show is public method

        // System.out.println(access.marks);         //won't work

        // we are trying to get marks present in another file, the file present in another pockage
        // here we are unable access marks, because marks access type is default, 
        // if you want access the marks present in the another file and the file present in another package then access type should be public

        System.out.println(access.age);  // we are able to access age because access type is public

        prote pr = new prote();
        pr.protec();
        
        //file present in same package 

        AccessM ac = new AccessM();
        System.out.println(ac.marks);  // here access type is default but still we are able to access marks directly, beacuse AccessM file present in same package 

        ac.show();  // we can access show() method directly because show is public method

       
    }      
}


//if you want access the variable present in the another file and the file present in another package then access type should be public

// private varibales can be used within the class