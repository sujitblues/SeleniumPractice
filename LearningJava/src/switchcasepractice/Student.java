package switchcasepractice;

public class Student {
public int getStudentMarks(String studentName)
{
	System.out.println("getting marks of : "+ studentName);
	int marks=0;
	String name=studentName;
	switch(name)
	{
	case "Riya":
		marks=70;
		break;
	case "Piya":
		marks=80;
		break;
	case "Tiya":
		marks=60;
		break;
	case "Jiya":
		marks=50;
		break;
		default :
			System.out.println("No student found please pass right student name :"+name);
			break;
			
	}
	return marks;
}
	public static void main(String[] args) {
		Student s1=new Student();
		int studentMarks=s1.getStudentMarks("Riya");
		System.out.println(studentMarks);
		
		

	}

}
