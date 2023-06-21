package SeleniumSession;

public class Verify {
	public static boolean equalValue(String actResult,String expResult)
	{
		if(actResult.equals(expResult))
		{
			System.out.println(actResult+" is equal to " + expResult);
		return true;
		}
		else
		{
			System.out.println(actResult+" is not equal to " + expResult);
			return false;
		}
	}
	public static boolean containValue(String actResult,String expResult)
	{
		if(actResult.contains(expResult))
		{
			System.out.println(actResult+" contains " + expResult);
		return true;
		}
		else
		{
			System.out.println(actResult+" not contains " + expResult);
			return false;
		}
	}

}
