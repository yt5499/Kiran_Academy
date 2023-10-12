//find factorial of a number

package level2;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number to find factorial: ");
		byte num = sc.nextByte();
		
		int fact = 1;
		for(int i=1 ; i<=num ; i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
