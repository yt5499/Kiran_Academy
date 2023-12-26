//2) Write a program for finding factorial of a number?

package diwali_homework;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number to find factorial: ");
		int num = sc.nextInt();
		
		long fact = 1;
		for(int i=num ; i>0 ; i--) {
			fact *= i;
		}
		
		System.out.println("Factorial = "+fact);
	}
}
