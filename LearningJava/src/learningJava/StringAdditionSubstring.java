package learningJava;

public class StringAdditionSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sujit";
		String s2="java";
		String s3="This is demo";
		System.out.println(s1+s2);
		System.out.println(s1+20);
		System.out.println(s1+10+20);
		System.out.println(10+s1+20);
		System.out.println(10+20+s1);
		System.out.println(s1+20/10);
		System.out.println(s1+10*20);
		System.out.println(s1.concat(s2));
		System.out.println(String.join(",", s1,s2));
		System.out.println(s3.subSequence(3, 9));
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(3,11));

	}

}
