package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorConcept {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Java");
		a1.add("SQL");
		a1.add("Manual TEsting");
		a1.add("Selenium");
		ArrayList<Float> a2 = new ArrayList<>();
		a2.add(76.2F);
		a2.add(81.5F);
		a2.add(67.8F);
		a2.add(77.3F);
		ArrayList<Object> a3 = new ArrayList<>();
		a3.add("Aamir");
		a3.add("Uma");
		a3.add("Prakash");
		a3.add("Gaurav");
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		Iterator<Float> i = a2.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		
		ListIterator<Object> li= a3.listIterator();
		while(li.hasNext()==true)
				{
			      System.out.println(li.next());
				}
		while(li.hasNext()==true)
		{
		System.out.println(li.next());
		}
	}

}
