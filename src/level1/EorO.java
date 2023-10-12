//WAP to check whether number is even or odd

package level1;

import java.util.Scanner;

public class EorO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int n = sc.nextInt();
		
		switch (n%2) {
		case 0:
			System.out.println("Number is even");
			break;
			
		case 1:
			System.out.println("Number is odd");
			break;

		default:
			System.out.println("Invalid Input!");
			break;
		}
		
	}

}
