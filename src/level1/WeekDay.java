//WAP to read a weekday number and print weekday name using switch statement
package level1;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter WeekDay number: ");
		
		byte n = sc.nextByte();
		
		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid Input! Input should be 1 to 7 only");
			break;
		}

	}

}
