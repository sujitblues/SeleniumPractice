package StringConcept;

public class StringReverse {
	public static String revereString(String st)
	{
		/*
		if(st==null)
		{
			System.out.println("null values can not be reversed..please pass the right value");
			throw new MyException("Null values");//Write Custom exception
		}
		*/
		if(st.length()==1)
		{
			return st;
		}
	String rev="";
	for(int i=st.length();i>=0;i--)
	{
		rev=rev+st.charAt(i);
		}
	return rev;
	}
	public static void main(String[] args) {
		
		System.out.println(revereString("Selenium"));
		System.out.println(revereString("A"));
		System.out.println(revereString("AA"));
		System.out.println("Selenium testing with java");
	}

}
