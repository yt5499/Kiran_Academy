//WAP to find number of days in a month

package level1;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month's first 3 initials with 1st letter capitallized to know number of days in month(Year=2023): ");
		String month = sc.next();
		
		switch(month) {
		case "Jan":
			System.out.println("31 days");
			break;
			
		case "Feb":
			System.out.println("28 days");
			break;
			
		case "Mar":
			System.out.println("31 days");
			break;
			
		case "Apr":
			System.out.println("30 days");
			break;
			
		case "May":
			System.out.println("31 days");
			break;
			
		case "Jun":
			System.out.println("30 days");
			break;
			
		case "Jul":
			System.out.println("31 days");
			break;
			
		case "Aug":
			System.out.println("31 days");
			break;
			
		case "Sep":
			System.out.println("30 days");
			break;
			
		case "Oct":
			System.out.println("31 days");
			break;
			
		case "Nov":
			System.out.println("30 days");
			break;
			
		case "Dec":
			System.out.println("31 days");
			break;
			
		default:
			System.out.println("Invalid Input!");
			break;
			
		}

	}

}
