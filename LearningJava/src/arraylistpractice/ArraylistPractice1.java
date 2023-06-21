package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

public class ArraylistPractice1 {

	public static void main(String[] args) {
		ArrayList<String> colorlist=new ArrayList<String>();
		colorlist.add("Red");
		colorlist.add("pink");
		colorlist.add("blue");
		colorlist.add("Yellow");
		System.out.println(colorlist);
		
		//for each practice
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		

	}

}
