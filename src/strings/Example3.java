//WAP to accept a string from the user and add all digits from it.

//ASCII values from "48 to 57" for "0 to 9" digits  

package strings;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String str = sc.next();
		
		int sum = 0;
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				sum += str.charAt(i)-48; 
			}
		}
		System.out.print("Sum of the digits in your string is: "+sum);
		
	}

}
