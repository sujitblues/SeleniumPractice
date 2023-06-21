package kapil;

import java.util.Scanner;

public class A1 {
	
	public static void main(String[] args) {
		
		
		int a[] = new int [10];
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a alue");
		try
		{		
			for(int i=0;i<=11;i++)
			{
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<=11;i++)
			{
				System.out.println(a[i]);
			}
			
		}
		catch (Exception e) {

				System.out.println(e);
		}
		
	}

}
