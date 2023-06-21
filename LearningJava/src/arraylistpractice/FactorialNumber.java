package arraylistpractice;

public class FactorialNumber {

	public static void main(String[] args) {
		// Factorial Number 5-5*4*3*2*1
		//First Method
		
		int number=5; int fact=1;
		/*
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	*/
		//Second Method
		
		for(int i=number;i>=1;i--)
		{
			fact=fact*i;
		}
System.out.println(fact);
	}

}
