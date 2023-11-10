//Q- 
//	*		*
//	*		*
//	* * * * *
//	*		*
//	*		*

package class_practice;

import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any for number of rows: ");
		int row = sc.nextInt();
		
		for(int i=1 ; i<=row ; i++) {
			
			System.out.print("*");
			for(int j=1 ; j<=row ; j++) {
				if(j==row || (i==row/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
