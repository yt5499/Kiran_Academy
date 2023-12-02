//Q--
//			1
//			1 2
//			1 2 3

package inter_pract;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of lines: ");
		int lines = sc.nextInt();
		
		for(int i=0 ; i<lines ; i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
		
	}

}
