//WAP to find maximum of two numbers using switch statement

package level1;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first number: ");
		byte a = sc.nextByte();
		
		System.out.print("Enter second number: ");
		byte b = sc.nextByte();
		
		int result = a > b ? 1:0;
		int result2 = a == b ? 1:0;
		
		switch (result) {
		case 1:
			System.out.println(a+" is greater than "+b);
			break;
		
		case 0:
			switch (result2) {
			case 1:
				System.out.println(a+" is equals to "+b);
				break;
				
				
			case 0:
				System.out.println(b+" is greater than "+a);
				break;

			default:
				System.out.println("Invalid Input!");
				break;
			}
			
		}
		
		
		
//		switch(result) {
//		case 1:
//			System.out.println(a+" is greater than "+b);
//			break;
//			
//		case 0:
//			System.out.println(b+" is greater than "+a);
//			break;
//			
//		default:
//			System.out.println("Invalid Input!");
//			break;
//			
//		}

	}

}
