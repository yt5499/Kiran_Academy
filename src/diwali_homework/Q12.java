//12) Java Program to check if a vowel is present in the string?

package diwali_homework;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.next();
		
//		convert string to char array
		char ch[] = str.toCharArray();
		
		boolean isVovelPresent = false;
		for(int i=0 ; i<ch.length ; i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				isVovelPresent = true;
				break;
			}
		}
		
		if(isVovelPresent) {
			System.out.println("Vowel is present");
		}else {
			System.out.println("Vowel is not present");
		}
		
	}
}
