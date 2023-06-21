package learningJava;

public class DataTypePractice {
	public static void main(String arg[])
	{
		//1.Byte -1 Byte -8 bits
		byte b=127; //max size
		byte b2=-128; // min size
		byte b3=100;
		byte b4=0;
		System.out.println("Byte"+" "+b);
		System.out.println("Byte"+" "+b2);
		System.out.println("Byte"+" "+b3);
		System.out.println("Byte"+" "+b4);
		//2.short -2 byte =16 bits
		short s1=-32768; //min size	
		short s2=32767;
		System.out.println("short"+" "+s1);
		System.out.println("short"+" "+s2);
		//3.int 4 byte =32 bits
		//range = -2^31 to 2^31-1
		int i=1234567;
		int i2=0;
		System.out.println("int"+ " " + i);
		System.out.println("int"+ " " + i2);
		//4.long 8 byte =64 bits
		//-2^63 to 2^63-1
		long l=123456786543l;
		System.out.println("long"+" "+l);
		//float 4 byte 
		float f=12.67f;
		System.out.println("float"+" "+f);
		//double 8 byte
		double d=34678899876654.677544d;
		System.out.println("double"+ " "+d);
		//boolean true/false approx 1 bit
		boolean b5=true;
		boolean b6=false;
		System.out.println("Boolean"+" "+b5);
		System.out.println("Boolean"+" "+b6);
		//char 2 byte =16 bits
		char c1='a';
		char c2='A';
		char c3='1';
		char c4='#';
		//char c5='9' can i write like this
		System.out.println("char"+" " + c1);
		System.out.println("char"+" " + c2);
		System.out.println("char"+" " + c3);
		System.out.println("char"+" " + c4);
	}

}
