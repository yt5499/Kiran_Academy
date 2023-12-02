package collection_framework;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Dodamarg");
		map.put(2, "Sawantwadi");
		map.put(3, "Vengurla");
		map.put(4, "Kudal");
		map.put(5, "Kankavali");
		map.put(6, "Vaibhavwadi");
		map.put(7, "Devgad");
//		map.put(8, "");
		
		System.out.println(map);
		
//		Gives the value by entering key;
		System.out.println(map.get(4));
		
//		Gives value if present or print default value
		System.out.println(map.getOrDefault(1, "Not Aailable"));
		System.out.println(map.getOrDefault(8, "Not Aailable"));
		
//		clone and only make the copy, you'll not be able to access any hashmap in-built methods.
		Object copyOfMap = map.clone();
		System.out.println(copyOfMap);
		
//		clone and make copy of hashmap into another hashmap, you'll be able to access any hashmap in-built methods.
		

	}

}
