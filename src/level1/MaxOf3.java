//find maximum of three numbers


package level1;

import java.util.Scanner;

public class MaxOf3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		if(a==b && b==c && c==a) {
			System.out.println("All numbers are equal");
		}
		else if(a>b && a>c) {
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}

	}

}
