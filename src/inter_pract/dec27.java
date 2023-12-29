//reverse a string

package inter_pract;

import java.util.Scanner;

public class dec27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.next();
		
//		converting string into character array
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}
		
	}
}
