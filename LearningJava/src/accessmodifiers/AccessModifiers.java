package accessmodifiers;

class A
{
	/*
	private int i=10; //it's only accessible within class only
	private void m()
	{
		System.out.println(i);
	}
	*/
	int i=10;
	void m1()
	{
		System.out.println(i);
	}
}
public class AccessModifiers {
	

	public static void main(String[] args) {
		
		A aobj=new A();
		aobj.i=10;
		aobj.m1();
		
	}

}
