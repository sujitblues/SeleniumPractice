package StringConcept;

public class StringManipulation {

	public static void main(String[] args) {
		//Scp-String constant pool-it's part of heap
		//String literals:
		String s="Hello";
		String s1="Hello";
		String s2="hello";
		System.out.println(s==s1);
		System.out.println(s1==s2);
		
		//String objects with new keyword
		String st=new String("Java");
		String st1=new String("Hello");
		System.out.println(s==st1);
		System.out.println(s.equals(st1));
		//intern method example
		String test=new String("selenium");//1 object
		test.intern();//1 in SCP and 1 in heap memory
		String t1="selenium";//0 object
		//Total 2 object will created for above inern example
		
		String str="The rains have started here";
		
		
		

	}

}
