package _35Enum;
enum CheckStatus {
    Running, Failed, Pending, Success, NotWorking; 
} 

public class EnumCondtions {
    public static void main(String[] args) {

        CheckStatus cs = CheckStatus.Success;  //what ever we mention here those statement will execute

        if(cs == CheckStatus.Running){
            System.out.println("In Running state");
        }
        else if(cs == CheckStatus.Failed){
            System.out.println("Scenario got failed");
        }
        else if(cs == CheckStatus.Pending){
            System.out.println("Execution Pending");
        }
        else if(cs == CheckStatus.Success){
            System.out.println("Successfully executed");
        }
        else if(cs == CheckStatus.NotWorking){
            System.out.println("Test case not working");
        }
    }
}
