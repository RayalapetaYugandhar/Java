package _35Enum;
enum Switch{
     Running, Failed, Pending, Success, NotWorking; 
}

public class EnumSwitch {
    public static void main(String[] args) {

        CheckStatus cs = CheckStatus.NotWorking;  //what ever we mention here those statement will execute

        switch (cs) {
            case Success:
                System.out.println("Successfully executed");
                break;
            case Running:
                System.out.println("In Running state");    
                break;    
            case Failed:
                System.out.println("Scenario got failed");
                break;
            case Pending:
                System.out.println("Execution Pending");
                break;
            case NotWorking:
                System.out.println("Test case not working");
                break;
            default:
                System.out.println("Condition not matched with anything");
                break;
        }
    }
}
