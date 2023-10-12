//WAP to check whether a person is eligible to vote or not using switch statement

package level1;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you above 18? Enter Y or N: ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'Y':
			System.out.println("You are eligible for voting Congrajulations!");
			break;
			
		case 'N':
			System.out.println("You are not eligible for voting");
			break;
			
		case 'y':
			System.out.println("You are eligible for voting Congrajulations!");
			break;
			
		case 'n':
			System.out.println("You are not eligible for voting");
			break;
			
		default:
			System.out.println("Invalid Input!");
			break;
			
		}

	}

}
