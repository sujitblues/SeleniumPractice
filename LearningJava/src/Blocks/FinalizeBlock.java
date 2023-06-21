package Blocks;

public class FinalizeBlock {
	//finalize() coming from object class
	@Override
	public void finalize()
	{
		System.out.println("I am into finalize method");
	}

	public static void main(String[] args) {
		FinalizeBlock obj=new FinalizeBlock();
		obj=null;
		Hello h=new Hello();
		h=null;
		System.gc();//calling garbage collector
		System.out.println("End of program");

	}

}
