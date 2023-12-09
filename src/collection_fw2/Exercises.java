package collection_fw2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Exercises {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(54);
		al.add("Arraylist");
		al.add(55.5);
		System.out.println(al);
		
		System.out.println("---------------------------");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

		
	}

}
