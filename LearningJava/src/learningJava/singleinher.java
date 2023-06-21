package learningJava;
class gp
{
	int a=10;
}
class p extends gp
{
	int b=20;
}
class c extends p
{
	void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
}
/*
class c extends p
{
	int b=20;
	void sub()
	{
		int c=a-b;
		System.out.println(c);
	}
	void add()
	{
		System.out.println(a+b);
	}
	Void add(int a ,int b)
	{
		int c=a+b;
	}
}
*/
public class singleinher {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		c obj=new c();
		//System.out.println(	obj.b);
		//p obj2=new p();
		//System.out.println(obj2.a);
		obj.sum(10,20);
		
		
		

	}

}
