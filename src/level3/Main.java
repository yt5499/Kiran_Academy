package level3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();
		
		for(int i=1 ; i<=a ; i++) {
			for(int j=b ; j<=10 ; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
