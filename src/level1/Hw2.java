//WAP to print remark according to the grade obtained using switch statement

package level1;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter grade obtained ");
		
		char g = sc.next().charAt(0);
		
		switch (g) {
		case 'A':
			System.out.println("Above 80%");
			break;
			
		case 'B':
			System.out.println("Above 60% below 80%");
			break;
			
		case 'C':
			System.out.println("Below 60%");
			break;
			
		case 'a':
			System.out.println("Above 80%");
			break;
			
		case 'b':
			System.out.println("Above 60% below 80%");
			break;
			
		case 'c':
			System.out.println("Below 60%");
			break;

		default:
			System.out.println("Invalid Input!");
			break;
		}
		
		sc.close();

	}

}
