package _00Practice;

class OverLoading {
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public double add(int n1, int n2, double n4) {
		return n1 + n2 + n4;
	}
}
public class MethodOverloading {
	
	public static void main(String []args) {
		
		int n1 =6;
		int n2 =3;
		int n3 =9;
		double n4 = 6.5;
		
		OverLoading loading = new OverLoading();
		
		int results = loading.add(n1, n2);
		System.out.println(results);
		
		int results2 = loading.add(n1, n2, n3);
		System.out.println(results2);
		
		double results3 = loading.add(n1, n2, n4);
		System.out.println(results3);
		
	}

}
