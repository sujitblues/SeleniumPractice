package learningJava;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=" abc ";
		String email=" ";
		String password="";
		/*lenght()
		int i=name.length();
		if(i==0)
		{
		System.out.println("name is empty");
		}
		else
		{
			System.out.println("valid name");
		}
		*/

		/* isEmpty()
		if(name.isEmpty())
		{
		System.out.println("name is empty");
		}
		else
		{
			System.out.println("valid name");
		}
		*/
		System.out.println(name);
		System.out.println(name.trim());
		String name1="  ";
		if(name1.trim().length()==0)
		{
			System.out.println("name is empty");
		}
		else
		{
			System.out.println("valid name");
		}
		if(email.trim().isEmpty())
		{
			System.out.println("name is empty");
		}
		else
		{
			System.out.println("valid name");
		}
		if(name.trim().length()==0 || name.trim().isEmpty())
		{
			System.out.println("Name can not be empty");
		}
		else if (email.trim().length()==0 || email.trim().isEmpty())
		{
			System.out.println("email can not be empty");
		}
		else if(password.trim().length()==0 || password.trim().isEmpty())
		{
			System.out.println("password can not be empty");
		}
		}
				
		
	}


