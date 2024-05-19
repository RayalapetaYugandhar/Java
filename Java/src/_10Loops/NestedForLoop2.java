public class NestedForLoop2 {
    public static void main(String []args){
        for(int i=1; i<=7; i++){
            System.out.println("Day "+i);
            for(int j=0; j<24; j++){
                System.out.println(" " + (j+0) + " Hours" + " - " + (j+1) + " Hours" );
                // System.out.println(" " + (j+9) + " Hours" + " - " + (j+10) + " Hours" );
            }
        }
    }
}