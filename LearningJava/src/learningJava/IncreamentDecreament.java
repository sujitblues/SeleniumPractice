package learningJava;

public class IncreamentDecreament {

	public static void main(String[] args) {
		//Question 1
		int i=11;
		i=i++ + ++i;
		System.out.println(i);
		//Question 2
		int a=11,b=22,c;
		c=a+b+a++ + b++ + ++a + ++b;
		System.out.println(c);
		//Question 3
		int i2=0;
		i2=i2++ - --i2 + ++i2-i2--;
		System.out.println(i2);
		/*
		//Question 4
		boolean bb=true;
		bb++; //type mismatch error
		System.out.println(bb);
		*/
		//Question 5
		int i3=1,j=2,k=3,m;
		m=i3-- -j-k--;
		System.out.println(m);
		
		int a1=1;
		a1=a1++ + ++a1*--a1-a1--;
		System.out.println(a1);
		//Question 11
		/*
		int a= 11++;//invalid argument
		System.out.println(a);
		*/
		//Question 12
		char ch1='A';
		System.out.println(ch1++);//A
		//Question 13
		char ch='A';
		System.out.println(++ch);//B
		//Question 14
		double d=1.5,D=2.5;
		System.out.println(d++ + ++D);//5.0

	}

}
