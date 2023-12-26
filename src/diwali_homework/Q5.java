//5) Write a program for sum of digits 123 - 6

package diwali_homework;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		while(num>0) {
			int last = num%10;
			sum += last;
			num = num/10;
		}
		System.out.println("Sum = "+sum);

	}

}
