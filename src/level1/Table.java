//WAP to print a table of a number

package level1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for a table: ");
		byte num = sc.nextByte();
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println(num+" x "+(i+1)+" = "+(num*(i+1)));
		}

	}

}
