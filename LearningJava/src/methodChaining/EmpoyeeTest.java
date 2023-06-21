package methodChaining;

public class EmpoyeeTest {
	String name;
	int age;
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void printMesg()
	{
		System.out.println("Hello");
	}
public void getEmpInfo(EmpoyeeTest ob)
{
	ob.name="Tom";
	ob.age=20;
	System.out.println(name);
	System.out.println(age);
}
	public static void main(String[] args) {
		EmpoyeeTest obj=new EmpoyeeTest();
		obj.add(20,30);//call by value/agrument
		obj.getEmpInfo(obj);
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.name="Riya";
		obj.age=30;
		System.out.println(obj.name);
		System.out.println(obj.age); 
		obj.getEmpInfo(obj);
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		

	}

}
