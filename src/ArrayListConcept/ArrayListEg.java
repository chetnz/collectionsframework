package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		Employee e = new Employee("Chet", 33, "DOP");
		Employee e1 = new Employee("Abhi", 33, "Novartis");
		Employee e2 = new Employee("Mayu", 32, "IT");
		ar1.add(e);
		ar1.add(e1);
		ar1.add(e2);
		ar2.add(e2);
		ar2.add(e1);
		ar2.add(e);
		
		Iterator<Employee> i = ar1.iterator();
		while(i.hasNext()) {
			Employee emp = i.next();
			System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);}
		
		//ar1.retainAll(ar2);
		
		
		
		
		

	}

}
