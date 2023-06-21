package learningJava;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2021;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Year is leap year");
				}
				else
				{
					System.out.println("Year is not a leap year");
				}
			}
			else
			{
				System.out.println("Year is leap year");
			}
			
		}
		else
		{
			System.out.println("Not a leap year");
		}
				
	}

}
