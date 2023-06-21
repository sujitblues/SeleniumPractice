package learningJava;

public class leapyear2way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2021;
		if((year%4==0)|| (year%400==0 & year!=100))
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not a leap year");
		}

	}

}
