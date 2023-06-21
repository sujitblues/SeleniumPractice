package Blocks;

public class Hello {
	int age;
	@Override
	public void finalize()
	{
		System.out.println("I am into finalize method");
	}


}
