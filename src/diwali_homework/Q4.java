//4) Write a program for Armstrong number

package diwali_homework;

import java.util.Scanner;
import java.lang.Math;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
//		length
		int ccNum = num;
		int len = 0;
		while(ccNum>0) {
			len += 1;
			ccNum = ccNum/10;
		}
		
		int cNum = num;
		int sum = 0;
		int raiseTo = len;
		while(cNum>0) {
			int last = cNum%10;
			sum += Math.pow(last, raiseTo);
			cNum = cNum/10;
		}
		
		System.out.println("sum = "+sum);
		
		if(sum==num) {
			System.out.println("Is an armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}

	}

}
