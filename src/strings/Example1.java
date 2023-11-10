//WAP to accept name of the user and count number of vovels from it.

package strings;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		int count = 0;
		for(int i=0 ; i<name.length() ; i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' ||name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U') {
				count += 1;
			}
		}
		
		System.out.println("Your name is "+name+" and number of vowels are "+count);
	}

}
