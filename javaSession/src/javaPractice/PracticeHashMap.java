package javaPractice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public class PracticeHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> data=new HashMap<String,Integer>();
		data.put("raju", 30);
		data.put("Nandni", 35);
		data.put("Jagruti", 30);
		data.put("Arab", 35);
		data.put("Rageesh", 33);
		int age=data.get("Nandni");
		System.out.println(age);
		data.remove("Jagruti");
		boolean keycheck=data.containsKey("Jagruti");
		System.out.println(keycheck);
		Set<String> keys = data.keySet();
		System.out.println(keys);
		Collection<Integer>values=data.values();
		System.out.println(values);
	}

}
