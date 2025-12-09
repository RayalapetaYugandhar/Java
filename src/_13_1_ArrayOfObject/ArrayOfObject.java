package _13_1_ArrayOfObject;

class Student{    //object
	int rollno;   // instant varibales
	String name;
	int marks;
}

public class ArrayOfObject {
	public static void main(String []args)
	{
		Student S1 = new Student();  // reference object
		S1.rollno = 1;
		S1.name = "Yugandhar";
		S1.marks = 96;
		
		Student S2 = new Student();
		S2.rollno = 2;
		S2.name = "King";
		S2.marks = 99;
		
		Student S3 = new Student();
		S3.rollno = 3;
		S3.name = "Kong";
		S3.marks = 89;
		
		Student students[] = new Student[3];   // 'students' is variable here and we are storing 'Student' data in 'students[]' array 
		
		students[0] = S1;   //assigning objects to array
		students[1] = S2;
		students[2] = S3;
		
		for(int i=0; i<=2; i++)
		{
			System.out.println(students[i].name + " : " + students[i].rollno + " : " + students[i].marks);
		}
		
		System.out.println();

		for(int i=0; i<students.length; i++)   //all loops will work same
		{
			System.out.println(students[i].name + " : " + students[i].rollno + " : " + students[i].marks);
		}
		
		System.out.println();
		
		for(Student std : students )          /*Enhanced for loop or for each loop*/
		{
			System.out.println(std.name + " : " + std.rollno + " : " + std.marks);  /*Here we did the - concatenation*/
		}
	}

}
