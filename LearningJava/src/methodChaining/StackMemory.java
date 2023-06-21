package methodChaining;

public class StackMemory {
	//NS-Non static S-static
	//NS-->NS--Yes(No object)
	//S-->S--Yes(No object)
	//NS-->s--directly class name,no object
	//s-->NS--need object
	//stack->Lifo
	//Queue-Fifo
	//stack-out of memory
	public static void t1()
	{
		System.out.println("t1 method");
		t2();
	}
	public static void t2()
	{
		System.out.println("t2 method");
		t3();
	}
	public static void t3()
	{
		System.out.println("t3 method");
	}
	public void m1()
	{
		System.out.println("m1 method");
		m2();
	}
	public void m2()
	{
		System.out.println("m2 method");
		m3();
	}
	public void m3()
	{
		System.out.println("m3 method");
		StackMemory.t1();
	}

	public static void main(String[] args) {
		StackMemory obj=new StackMemory();
		obj.m1();
		
		
	}

}
