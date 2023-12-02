//parent interface = List

package collection_framework;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Easy");list.add(21);list.add(52);list.add("van");
		System.out.println(list);
		
		ArrayList list2 = new ArrayList();
		list2.add(23);list2.add("Raju Bhai");list2.add("van");
		System.out.println(list2);
		
		list.retainAll(list2);
		System.out.println(list);
		
		list.addAll(list2);
		System.out.println(list);
		
		ArrayList l1 = new ArrayList();
		l1.add("A");l1.add("B");l1.add("C");l1.add("D");l1.add("E");l1.add("F");
		
		ArrayList l2 = new ArrayList();
		l2.add("A");l2.add("B");l2.add("C");
		
		l1.retainAll(l2);
		System.out.println(l1);

	}

}
