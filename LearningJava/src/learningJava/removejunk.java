package learningJava;

public class removejunk {

	public static void main(String[] args) {
		String s="$1.45 per kg";
		s=s.replaceAll("[^0-9]", "");
		System.out.println(s);

	}

}
