package frameworkpractice;

import java.util.HashMap;

public class HashMapPractice1 {

	public static void main(String[] args) {
		HashMap <String, Integer> empIds=new HashMap<>();
		empIds.put("Pritam", 2345);
		empIds.put("Sujit", 8769);
		empIds.put("Manish", 2367);
		empIds.put("Rahul", 9854);
		empIds.put("Rituraj", 3765);
		System.out.println(empIds);
		System.out.println(empIds.get("Sujit"));
		System.out.println(empIds.containsKey("Bhola"));
		System.out.println(empIds.containsValue(2367));
		empIds.put("Sujit", 9876);
		System.out.println(empIds);
		empIds.replace("Mohan", 8765);
		System.out.println(empIds);
		empIds.putIfAbsent("Aadi", 8765);
		System.out.println(empIds);
		empIds.remove("Aadi");
		System.out.println(empIds);
	}

}
