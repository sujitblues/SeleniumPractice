import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class classPractice {
	int a;
	String name;
	String companyNma;
	static String arrlist;
	
	public int sum()
	{
		int a=0,b=0,c=0;
		c=a+b;
		return c;
		
	}
	classPractice()
	{
		int a=0,b=0,c=0;
		c=a+b;
	}
	classPractice(int a,String b)
	{
		System.out.println("Cont");
	}
	classPractice(String a,String b)
	{
		System.out.println("Cont");
	}
	classPractice(String a,int b)
	{
		System.out.println("Cont");
	}
	classPractice(int a,int b)
	{
		System.out.println("Cont");
	}
	public static void main(String[] args) {
				classPractice c1=new classPractice();
				classPractice c2=new classPractice(10,"sujit");
				classPractice c3=new classPractice(10,20);
				c1.sum();
			ArrayList<String> arrlist=new ArrayList<String>();
		
			arrlist.add("Rahul");
			arrlist.add("Manish");
			arrlist.add("Mohit");
			arrlist.add("Nirmal");
			arrlist.add("Nirmal");
			System.out.println(arrlist);
			arrlist.remove(0);
			System.out.println(arrlist);
			System.out.println(arrlist.contains("Nirmal"));
			arrlist.add(2, "Gaurav");
			System.out.println(arrlist);
			//arrlist.clear();
			System.out.println(arrlist);
			Set<String> setList=new HashSet<String>();
			System.out.println(setList.isEmpty());
			setList.add("sujit");
			//setList.add(arrlist)
			//System.out.println(setList);
			System.out.println(setList);
			Map<Integer,String> mapList=new HashMap();
			
			
			mapList.put(102,"sujit");
			mapList.put(103,"Golu");
			mapList.put(104,"Anjali");
			mapList.put(105,"Amol");
			
			System.out.println(mapList);
			
			System.out.println(mapList.get(102));
			mapList.putIfAbsent(106, "Nirmal");
			System.out.println(mapList);
			mapList.remove(104);
			System.out.println(mapList);
			mapList.replace(106, "Jai");
			System.out.println(mapList);
		
	}

}
