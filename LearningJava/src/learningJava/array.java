package learningJava;

import java.util.ArrayList;

public class array {
	public static void main(String[] args) {
	
int[] arr= new int[5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	
	
	int[] arr2= {1,2,3,4,5,6,7,8};
	for(int i=0;i<arr2.length;i++)
	{
		//find out multiple of 2
		if(arr2[i]%2==0)
		{
		System.out.println(arr2[i]);
		}
		else
		{
			System.out.println(arr2[i]+"Number is not a multiple of 2 ");
		}
	}
	ArrayList<String> a =new ArrayList<String>();
	a.add("C");
	a.add("C++");
	a.add("Java");
	a.add("sellenium");
	System.out.println(a.get(3));
	for(int i = 0; i<5; i++)
    {
	  System.out.println("facebook");
    }
	}
	
	
}
