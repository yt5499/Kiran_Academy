//11) How to swap two numbers without using a third variable?

package diwali_homework;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.nextLine();
		
		System.out.println(str);
		
		String s[] = str.split(" ");
		
		for(String f : s) {
			System.out.println(f);
		}
		
		for(int i=0 ; i<s.length ; i++) {
			System.out.println(s[i]);
		}
		
		

	}

}
