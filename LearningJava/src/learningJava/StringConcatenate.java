package learningJava;

public class StringConcatenate {

	public static void main(String[] args) {
		// String concatenate
		int a=10;
		int b=20;
		String s1="Hello World";
		String s2="Welcome to Java";
		System.out.println(a+b+s1);//30Hello world
		System.out.println(s1+a+b);//Hello world1020
		System.out.println(s1+s2);//Hello WorldWelcome to Java
		System.out.println(s1+(a+b));//Hello World30
		System.out.println(a*b+s1);//200Hello World
		System.out.println(s1+a/b);//Hello World0

	}

}
