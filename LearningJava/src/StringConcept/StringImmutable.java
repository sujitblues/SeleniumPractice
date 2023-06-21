package StringConcept;

public class StringImmutable {

	public static void main(String[] args) {
		String s="Selenium";
		String t=s+"Hello";
		System.out.println(t);
		System.out.println(s);
		String st="Java";
		System.out.println(st+"python");
		System.out.println(st);
		st=st+"Automation";
		System.out.println(st);//JavaAutomation
		
		//Mutable classes:
		//StringBuilder and StringBuffer
		//StringBuilder is faster then StringBuffer
		StringBuilder sb=new StringBuilder("Testing");
		System.out.println(sb);
		sb.append("Automaation");
		System.out.println(sb);
		String pop="   Submit  ";
		pop=pop.trim();
		System.out.println(pop);

	}

}
