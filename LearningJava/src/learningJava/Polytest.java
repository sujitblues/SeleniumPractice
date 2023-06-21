package learningJava;

public class Polytest {
	void show()
	{
		System.out.println("No parameter");
	}
 void show(int a)
{
	System.out.println("int parameter");
}
 void show(String a)
 {
	 System.out.println("string parameter");
 }
 void show(int a,int b)
 {
 System.out.println("multiple integer parameter");
 }
 void show(String a,String b)
 {
	 System.out.println("multiple string parameter");
 }
 void show(int a,String b)
 {
	 System.out.println("integer first and then string second parameter");
 }
 void show(String a,int b)
 {
	 System.out.println("String first and int second parmeter");
 }
 void show(float a,float b)
 {
	 System.out.println("int parmoted to float");
 }
 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Polytest t=new Polytest();
		t.show();
		t.show(10);
		t.show("Sujit");
		t.show("Sujit kumar");
		t.show(10,20);
		t.show("Sujit",10);
		t.show(10,"kumar");
		t.show(10,10.2f);
		
		

	}

}
