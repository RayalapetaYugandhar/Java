package _13_1_ArrayOfObject;

class Employee{
	int rollno;
	String name;
	int marks;
}

public class ArrayOfObject_1 {
	public static void main(String []args)
	{
		Employee S1 = new Employee();
		S1.rollno = 1;
		S1.name = "Yugandhar";
		S1.marks = 96;
		
		Employee S2 = new Employee();
		S2.rollno = 2;
		S2.name = "Raju";
		S2.marks = 99;
		
		Employee S3 = new Employee();
		S3.rollno = 3;
		S3.name = "Rani";
		S3.marks = 89;
		
		Employee student[] = new Employee[3];
		
		student[0] = S1;
		student[1] = S2;
		student[2] = S3;
		
		for(Employee std : student )          /*Enhanced for loop or for each loop*/
		{
			System.out.println(std.name + ":" + std.rollno + ":" + std.marks);  /*Here we did the - concatenation*/
		}
	}

}
