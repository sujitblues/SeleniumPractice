package frameworkpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListAndSetPractice {

	public static void main(String[] args) {
		//List ....
		List l=new ArrayList();
		l.add(20);
		l.add(1,20);
		l.add(2,20); //list allow duplicate value
		l.add(null); //list allow multiple null value
		l.add(null);
		//System.out.println(l);
		Iterator itr=l.iterator(); //
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//ListIterator -using this we can iterate previous and next data
		ListIterator litr=l.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		//Set.........
		Set s=new HashSet();
		s.add(20);
		s.add(50);
		s.add(null);//only one null value allowed
		//s.add(50);set does not allow duplicate value
		//System.out.println(s);
		Iterator itr2=s.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		

	}
	
}
