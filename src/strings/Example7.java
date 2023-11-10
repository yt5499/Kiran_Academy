package strings;

import java.util.Scanner;

public class Example7 {
	
//	g = 103
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='g') {
				if(str.charAt(i+1)=='g') {
					System.out.println("String is happy");
				}
				break;
			}
		}
		
	}

}
