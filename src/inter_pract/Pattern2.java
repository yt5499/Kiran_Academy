//Q--
//			A
//			A B
//			A B C

package inter_pract;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of lines: ");
		int lines = sc.nextInt();
		
		for(int i=0 ; i<lines ; i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}

	}

}
