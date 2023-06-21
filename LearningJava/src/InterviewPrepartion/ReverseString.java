package InterviewPrepartion;

public class ReverseString {

	//Reverse a string
	//diff btw String and StringBuffer
	//Do we have reverse function in String?
	public static void main(String[] args) {
		String s="Selenium";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//2.Using String Buffer class
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());


	}
	
	
}
