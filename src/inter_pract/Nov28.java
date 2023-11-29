//find factorial and prime of perticular number

package inter_pract;

import java.util.Scanner;

public class Nov28 {

	public static void main(String[] args) {
		
		Nov28 obj = new Nov28();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		System.out.print("What operation you want to perform on your number, for Prime enter 'p' and for Factorial enter 'f': ");
		char ch = sc.next().charAt(0);
		
		if(ch=='F' || ch=='f') {
			obj.factorial(num);
		}
		else if(ch=='P' || ch=='p') {
			obj.prime(num);
		}
		else {
			System.out.println("Inalid Input! Try again!");
		}

	}
	
//	Method to find factorial of perticular number;
	public void factorial(int n) {
		long fact = 1;
		for(int i=1 ; i<=n ; i++) {
			fact *= i;
		}
		System.out.println("Factorial of number "+n+" is: "+fact);
	}
	
//	Method to find whether number is prime or not;
	public void prime(int n) {
		boolean cond = true;
		for(int i=2 ; i<n ; i++) {
			if(n%i==0) {
				cond = false;
			}
		}
		if(cond) {
			System.out.println("Number is Not a Prime");
		}
		else {
			System.out.println("Number is a Prime");
		}
	}

}