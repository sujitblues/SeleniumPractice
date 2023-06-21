package InterviewPrepartion;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		/*
		String arr[]= {"java","c","c++","python","java"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				System.out.println("Found Duplicate Element:"+arr[i]);
				flag=true;
				}
			}
		}
if(flag==false) {
	System.out.println("Duplicate element not found");
}
*/
	
	
	//2nd Method
		boolean flag=false;
	HashSet <String> langs=new HashSet<String>();
	String arr[]= {"java","c","c++","python","java"};
	for(String l:arr)
	{
		if(langs.add(l)==false)
		{
			System.out.println("Found Duplicate Element:"+l);
			flag=true;
		}
	}
	if(flag==false)
	{
		System.out.println("Not found deuplicate element");
	}
	

}
}
