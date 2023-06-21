package createStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("apple");
	list.add("banana");
	list.add("orange");
boolean flag=list.contains("banana");
System.out.println(flag);
String secondElement = list.get(1);
//Print the element
System.out.println(secondElement); 

//Create a new ArrayList
ArrayList<String> list1 = new ArrayList<>();
//Add elements to the ArrayList
list1.add("apple");
list1.add("banana");
//Create a new Collection
Collection<String> collection = Arrays.asList("orange", "grape");
//Add all elements of the Collection to the ArrayList
list1.addAll(collection);
//Print the ArrayList
System.out.println(list1); // Output: [apple, banana, orange, grape]


//list.set(3, "Guava");
System.out.println(list);

	}

}
