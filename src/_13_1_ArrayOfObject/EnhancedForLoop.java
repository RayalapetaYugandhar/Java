package _13_1_ArrayOfObject;
class studentDetails {
	int id;
	String name;
	String college;
}
public class EnhancedForLoop {
	public static void main(String []args) {
	
		studentDetails s1 = new studentDetails();
			
			s1.id = 1;
			s1.name = "Yugandhar";
			s1.college = "SITAMS";
		
		studentDetails s2= new studentDetails();
		
			s2.id = 10;
			s2.name= "king";
			s2.college = "SIT";
			
		studentDetails std[] = new studentDetails[2];
			
			std[0] = s1;
			std[1] = s2;
			
		for(studentDetails st : std) {
			System.out.println(st.id + " : " + st.name + " : " + st.college);
		}
		
	}
	
}
