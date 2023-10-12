/*
WAP that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
		Test data
		i/p 1st num: 2564
		i/p 2nd num: 3526
		expected o/p: All numbers are different
*/

package level2;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter only numbers");
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		
		if(a==b && b==c && c==a) {
			System.out.println("All numbers are equal");
		}
		else if(a!=b && b!=c && c!=a) {
			System.out.println("All numbers are different");
		}
		else {
			System.out.println("Neither all are equal or different");
		}
		
		

	}

}
