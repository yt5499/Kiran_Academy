//Q- 
//	* * * * *
//	  * * * *
//	    * * *
//	      * *
//	        *




package class_practice;

import java.util.Scanner;

public class Prac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of lines: ");
		int rows = sc.nextInt();
		
		for(int i=rows ; i>=1 ; i--) {
			for(int j=rows ; j>i ; j--) {
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
