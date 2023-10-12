package inter_pract;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number to check prime or not: ");

		int num = sc.nextInt();

		boolean bl = false;

		if(num==1) {
			bl=true;
		}
		for(int i=2 ; i<num ; i++) {
			if(num%i==0) {
				bl=true;
			}
		}

		if(bl) {
			System.out.println(num+" is not a prime");
		}
		else {
			System.out.println(num+" is a prime");
		}

	}

}
