//WAP to sum all even numbers from 23 to 33

package level2;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter from: ");
		int a = sc.nextInt();
		
		System.out.print("To: ");
		int b = sc.nextInt();
		
		for(int i=a ; i<=b ; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		
		
		System.out.println("Sum of even numbers from "+a+" to "+b+" is "+sum);
		

	}

}
