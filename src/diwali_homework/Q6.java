//6) Write a program for reverse a number 123 -- 321

package diwali_homework;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int reverse = 0;
		while(num>0) {
			int last = num%10;
			reverse = (reverse*10)+last; 
			num = num/10;
		}
		System.out.println("Reverse = "+reverse);
	}
}
