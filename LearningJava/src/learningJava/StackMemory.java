package learningJava;

public class StackMemory {
	//NS--NS -yes (No object)
	//S--S --Yes (No object)
	//NS-S--directly/class name,No object
	//S-NS -->need object
	//Stack-LIFO
	//Queue-FIFO
	//Stack-->out of memory :stack overflow error
	public static void t1()
	{
		System.out.println("t1 method");
		
	}
	public static void t2()
	{
		System.out.println("t1 method");
		
	}
	public static void t3()
	{
		System.out.println("t1 method");
		
	}
	public void m1()
	{
		System.out.println("M1 method");
		m2();
	}
	public void m2()
	{
		System.out.println("m2  method");
		m3();
	}
	public void m3()
	{
		System.out.println("m3 method");
		//m1(); stack overflow example
	}

	public static void main(String[] args) {
		
StackMemory obj=new StackMemory();
obj.m1();
	}

}
