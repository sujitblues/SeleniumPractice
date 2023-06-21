package learningJava;

public class EmployeeTest {
	String name;
	int age;
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void printMesg()
	{
		System.out.println("hello");
	}
	public void getEmpInfo()
	{
		System.out.println(name);
		System.out.println(age );
	}
	public void getEmployeeInfo(EmployeeTest ob)
	{
		ob.name="Sujit";
		ob.age=30; 
		System.out.println(name);
		System.out.println(age );
	}

	public static void main(String[] args) {
		
EmployeeTest obj=new EmployeeTest();
obj.add(20, 30); //call by value/argument
obj.getEmployeeInfo(obj);//call by refrence
System.out.println(obj.name);
System.out.println(obj.age);
obj.name="Rahul";
obj.age=29;

System.out.println(obj.name);
System.out.println(obj.age);
obj.getEmployeeInfo(obj);//call by refrence

System.out.println(obj.name);
System.out.println(obj.age);
	}

}
