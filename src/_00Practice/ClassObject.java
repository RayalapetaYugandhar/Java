package _00Practice;

class Mobile {
    int price;
    String OwnerName;            //class is reference of Object(Blue print of the object), it tells object what to do 
    static String MobileName;   //if we mentions static, then it is static for MobileName 
    
    public void show() {
        System.out.println(MobileName + "  :" + OwnerName + "  :" + price);
    }
}

public class ClassObject {
    public static void main(String []args) {
        Mobile mb1 = new Mobile();
        
        mb1.price = 2000;
        mb1.OwnerName = "Yugandhar";
        mb1.MobileName = "Moto";
        
        Mobile mb2 = new Mobile();
        
        mb2.price = 1000;
        mb2.OwnerName = "Don't know";
        mb2.MobileName = "SamSung";
        
        Mobile.MobileName = "Apple";
        
        mb1.show();
        mb2.show();
        
    }
}