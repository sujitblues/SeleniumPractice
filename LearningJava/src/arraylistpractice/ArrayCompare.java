package arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {10,20,30,40};
		int c[]= {10,20,30};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a, c));
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		/*
		for(int i=0;i<array1.length;i++){
		    array1.add(array1[i]);
		}
		for(int i=0;i<array2.length;i++){
    array2.add(array2[i]);
}

		assertEquals(array1, array2);

*/
		
		ArrayList<String> str2=new ArrayList<String>();
		str2.add("hello1");
		str2.add("hello2");
		str2.add("hello3");
		
	}

}
