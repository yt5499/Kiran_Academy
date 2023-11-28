//Senario: you have to hashsets copy all data from this two sets to 3rd hashset


package collection_framework;

import java.util.HashSet;

public class Hashsets1 {

	public static void main(String[] args) {
		
		HashSet hs1 = new HashSet();
		HashSet hs2 = new HashSet();
		HashSet hs3 = new HashSet();
		
		for(int i=1 ; i<=10 ; i++) {
			hs1.add(i*5);
		}
		for(int i=97 ; i<=113 ; i++) {
			hs2.add((char)i);
		}
		
		System.out.println(hs1);
		System.out.println(hs2);
		System.out.println();
		
		hs3.addAll(hs1);
		hs3.addAll(hs2);
		
		System.out.println(hs3);
		
		hs3.clear();
		System.out.println(hs3);
	}

}
