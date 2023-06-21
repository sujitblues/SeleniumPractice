package learningJava;

public class DivideZeroCase {

	public static void main(String[] args) {
		// Divide Zero Case
		System.out.println("zero by integer"+0/9);//0
		//System.out.println(9/0);//Arithmetic exception
		System.out.println(8/3);//2
		System.out.println("integer divide by integer"+" " +8/4);//2
		System.out.println("integer divided by float"+ " "+8/4.0);//2.0
		System.out.println("float divided by integer"+" "+8.0/4);//2.0
		System.out.println("float divided by float"+" "+8.0/4.0);//2.0
		System.out.println("zero divided by float"+" "+0/4.0);//0.0
		System.out.println("Zero divided by zero"+" "+0/0.0);//NAN
		System.out.println("Zero divided by zero"+" "+0.0/0);//NAN
		System.out.println("Zero divided by zero"+" "+0.0/0.0);//NAN
		//System.out.println("float divided by zero"+4.0/0);Arithmatic exception
		System.out.println("0.0/4");
		System.out.println(4.5/0);//infinity
		System.out.println(4.5/0.0);//infinity
		
		
		

	}

}
