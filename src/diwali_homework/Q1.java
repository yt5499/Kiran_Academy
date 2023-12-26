//1) Write a program to find prime number.

package diwali_homework;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to check whether prime or not: ");
		int num = sc.nextInt();
		
		for(int i=2 ; i<num ; i++) {
			if(num%i==0) {
				System.out.println("Not a prime");
				break;
			}
			else {
				System.out.println("Is a prime");
				break;
			}
		}
		
	}
}
