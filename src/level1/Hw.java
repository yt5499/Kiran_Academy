//WAP to create simple calculator using switch statement
//WAP to menu driven program using switch statement (find addition, subtraction, multiplication, and division of two integer numbers)

package level1;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		byte a = sc.nextByte();
		
		System.out.print("Enter Second Number: ");
		byte b = sc.nextByte();
		
		System.out.print("Enter operation you want to perform(eg. +, -, *, /, %): ");
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		case '+':
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
			
		case '-':
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
			
		case '*':
			System.out.println(a+" * "+b+" = "+(a*b));
			break;
			
		case '/':
			System.out.println(a+" / "+b+" = "+(a/b));
			break;
			
		case '%':
			System.out.println(a+" % "+b+" = "+(a%b));
			break;

		default:
			System.out.println("Invalid Input!");
			break;
		}

	}

}
