package ArrayListConcept;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		l.add("Test");
		l.add("Selenium");
		l.add("JAVA");
		
		l.addFirst("First");
		l.addLast("Last");
		
		System.out.println(l);
		System.out.println("Using For Loop");
		for(int j=0; j<l.size(); j++) {
			
			System.out.println(l.get(j));			
		}
		System.out.println("Using For each Loop");
		for(String str : l) {
			
			System.out.println(str);
		}

		Iterator<String> i = l.iterator();
		System.out.println("Using Iterator");
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		int r=0;
		System.out.println("******************Using While loop");
		while (r < l.size()) {
			System.out.println(l.get(r));
			r++;
			
		}
		
		
		
	}

}
