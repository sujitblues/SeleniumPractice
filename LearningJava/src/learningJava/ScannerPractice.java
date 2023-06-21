package learningJava;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String Name=sc.nextLine();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		

System.out.println("Name"+" " +Name);
System.out.println("Age"+" " +age);
System.out.println("Salary"+ " "+salary);
		

	}

}
