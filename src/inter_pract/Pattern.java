//Q-- 
//		*
//		* *
//		* * *

package inter_pract;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of lines: ");
		int lines = sc.nextInt();
		
		for(int i=0 ; i<lines ; i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
