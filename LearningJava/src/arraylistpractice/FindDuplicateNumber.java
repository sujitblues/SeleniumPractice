package arraylistpractice;

import java.util.HashSet;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		//Find first duplicate element from array
		
		int []a= {9,4,2,5,6,9,6,4};
		int temp=-1;
	/*	
	 * int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[i]==a[j] && (i!=j) )
				{
					System.out.println("First elment found "+a[i]);
					temp=temp+1;
					break;
				}
			}
			if(temp>0)
			{
				break;
			}
		}
		*/
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=a.length-1;i>=0;i--)
		{
			if(hs.contains(a[i]))
			{
				temp=i;
			}
			else
			{
				hs.add(a[i]);
			}
			
		}
		if(temp!=-1)
		{
			System.out.println("first element element is"+a[temp]);
		}
		else
		{
			System.out.println("Duplicate number is not foud");
		}

	} 
	

}
