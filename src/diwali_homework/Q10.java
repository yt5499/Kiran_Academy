//10) How to reverse a String in Java?

package diwali_homework;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.next();
		
		char ch[] = str.toCharArray();
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}
		
	}
}
