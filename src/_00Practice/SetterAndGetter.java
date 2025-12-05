package _00Practice;

class setter {
	
	private int value;
	
	public void setValue(int x) {
		value = x;
	}
	
	public int getValue() {
		if(value >= 5) {
			System.out.println("You will get pen");
		}else 
			System.out.println("Need extra money to get a pen");
		return value;
	}
	
}
public class SetterAndGetter {
	public static void main(String []args) {
		setter str = new setter();
		
		str.setValue(5);
		
		System.out.println(str.getValue());
	}

}
