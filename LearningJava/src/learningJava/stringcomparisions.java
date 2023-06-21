package learningJava;

public class stringcomparisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="deepak";
		String s2="Deepak";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String email="Ram";
		String pass="Ram@123";
		if(email.equals(" "))
		{
			System.out.println("Email id should not be empty");
		}
		else if(pass.equals(""))
		{
			System.out.println("password should not be empty");
		}
		String s3="B";// decimal value 97
		String s4="b";// decimal value 65
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));

	}

}
