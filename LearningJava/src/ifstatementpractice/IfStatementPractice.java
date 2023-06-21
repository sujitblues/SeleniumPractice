package ifstatementpractice;

import java.util.Scanner;

public class IfStatementPractice {

	public static void main(String[] args) {
		//WAP find out greatest number out of three given numbers
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter first number");
		int firstNumber=11;
		int seconNumber=45;
		int thirdNumber=34;
		if(firstNumber>seconNumber)
		{
		if (seconNumber>thirdNumber)
		{
			System.out.println(firstNumber);
		}
		else
		{
			System.out.println(thirdNumber);
			
		}
		}
		

	}

}
