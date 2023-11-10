//WAP to accept string from the user and print indices of all vowels from it.

package strings;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String str = sc.next();
		
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
				System.out.println("index of vowel "+str.charAt(i)+" is "+i);
			}
		}

	}

}
