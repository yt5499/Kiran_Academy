//3) Write a program for Fibonacci series
//	0 1 1 2 3 5 8 13 21 34

package diwali_homework;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter range: ");
		int num = sc.nextInt();

		int n1 = 0;
		int n2 = 1;
		
		System.out.print("0 1");
		for(int i=2 ; i<=num ; i++) {
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
		}
		
	}

}
