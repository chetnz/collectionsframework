package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListColor {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<>();
		a1.add("Violet");
		a1.add("Indigo");
		a1.add("Blue");
		a1.add("Green");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Red");
		a1.add("happiness");
		a1.add("Beauty");
		Iterator i = a1.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		
		

	}

}
