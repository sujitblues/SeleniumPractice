package learningJava;

public class StringUpdation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="This is demo";
		System.out.println(s1.replace("is", "was"));
		System.out.println(s1.replaceFirst("is", "was"));
		System.out.println(s1.replaceAll("is", "was"));
		System.out.println(s1.replaceAll("is(.)", "was"));
		System.out.println(s1.replaceAll("is(.*)", "was"));

	}

}
