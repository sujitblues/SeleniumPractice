package arraylistpractice;

public class stringpractice {
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a+b+"Testing data");
		System.out.println(a+"Testing"+b);
		String s1="Api Testing";
		String s2="Automation";
		s1.length();
		//s1.equals(s2);
		
		if(s1==s2)
		{
			System.out.println("String matched");
		}
		else
		{
			System.out.println("String not matched");
		}
		s1.equalsIgnoreCase(s2);
		s1.charAt(4);
		
	}

}
