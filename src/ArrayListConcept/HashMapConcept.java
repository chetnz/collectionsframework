package ArrayListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1,"Chetna");
		hm.put(2,"ABhishek");
		hm.put(3, "Yetarth");
		for(Entry<Integer, String> m: hm.entrySet()) {
			System.out.println(m.getKey()+"    "+m.getValue());
		}
		HashMap<Integer, Employee> h = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Mayu", 32, "Dev");
		Employee e2 = new Employee("Resh", 31, "QA");
		Employee e3 = new Employee("Poo", 30, "Test");
		
		h.put(1,  e1);
		h.put(2,  e2);
		h.put(3,  e3);
		System.out.println("Class Objects as values-------");
		for(Entry<Integer, Employee> m1: h.entrySet()) {
			Employee e = m1.getValue();
			System.out.println("EMployee "+m1.getKey()+" Info"+e.name+" "+e.age+" "+e.dept);
			
		}
		
		
		

	}

}
