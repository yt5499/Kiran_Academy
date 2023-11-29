package collection_framework;

import java.util.LinkedList;

public class LinkedLists {
	
	public static void main(String[] args) {
		
		LinkedList flowers = new LinkedList();
		flowers.add("Hibiscus");flowers.add("Lily");flowers.add("Sunflower");
		
		LinkedList trees = new LinkedList();
		trees.add("Coconut");trees.add("Banana");trees.add("Papaya");trees.add("Jam");trees.add("Jackfruit");trees.add("Chiku");
		LinkedList ls = new LinkedList();
		
//		add method
		ls.add(89);ls.add(69);
		ls.add("Panjim");ls.add("Valpoi");ls.add("Agoda");
		System.out.println(ls);
		
		ls.add(0, "Kancond");ls.add(4, 52);
		System.out.println(ls);
		
		ls.addAll(trees);
		System.out.println(ls);
		
		ls.remove();
		System.out.println(ls);
		
		ls.remove("Jackfruit");
		System.out.println(ls);
		
		ls.remove(8);
		System.out.println(ls);
		
		ls.addAll(flowers);
		System.out.println(ls);
		
		ls.removeAll(flowers);
		System.out.println(ls);
		
		ls.offer("NH-66");
		System.out.println(ls);
		
		ls.poll();
		System.out.println(ls);		
	}
	
}