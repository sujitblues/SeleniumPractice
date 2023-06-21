package methodPractice;

public class MethodsInJava {
	//no input no return
	//void-no return -function can not return anything
	public void getMarks()
	{
		int a=10;
		int b=20;
		int c=30;
		int sum=a+b+c;
		System.out.println("Sum"+" " +sum);
		
	}
	//2. no input, but some return
	//return type int
	public int totalAmount()
	{
		System.out.println("total Amount");
		int a=10;
		int gst=5;
		int total=a+gst;
		return total;
	}
	public String trainerName()
	{
		System.out.println("Trainer Name");
		String name="Sujit";
		return name;
	}
	public char getGender()
	{
		char c='f';
		return c;
	}
	//Some input some return
	public int sum(int a,int b)// a and b are method parameter
	{
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		MethodsInJava m1=new MethodsInJava();
		m1.getMarks();
		int totalAmount=m1.totalAmount();
		if(totalAmount==15)
		{
			System.out.println("Correct TotalAmount");
		}
		else
		{
			System.out.println("incorrect totalAmount");
		}
		System.out.println("TotalAmount"+" "+totalAmount );
		String TrainerName=m1.trainerName();
		if(TrainerName.equals("sujit"))
		{
			System.out.println("Correct trainer name");
		}
		else
		{
			System.out.println("Incorrect trainer name");
		}
		System.out.println(TrainerName);
		
		char gender=m1.getGender();
		System.out.println((byte)gender);
		int sum=m1.sum(10, 20);// 10,20 arguments
		System.out.println(sum);
		
		
	}

}
