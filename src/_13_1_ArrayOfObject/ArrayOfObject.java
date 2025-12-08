package _13_1_ArrayOfObject;

class Students{
	int rollno;
	String name;
	int marks;
}

public class ArrayOfObject {
	public static void main(String []args)
	{
		Students S1 = new Students();
		S1.rollno = 1;
		S1.name = "Yugandhar";
		S1.marks = 96;
		
		Students S2 = new Students();
		S2.rollno = 2;
		S2.name = "King";
		S2.marks = 99;
		
		Students S3 = new Students();
		S3.rollno = 3;
		S3.name = "Kong";
		S3.marks = 89;
		
		Students student[] = new Students[3];
		
		student[0] = S1;
		student[1] = S2;
		student[2] = S3;
		
		for(int i=0; i<=2; i++)
		{
			System.out.println(student[i].name + ":" + student[i].rollno + ":" + student[i].marks);
		}
	}

}
