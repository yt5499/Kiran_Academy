package inter_pract;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number to find Square Root: ");
		int n = sc.nextInt();
		
//		double sr = n * 0.5;
		
		int a = n/2;
		int temp = 0;
		while(a!=temp) {
			temp=a;
			a=((n/temp+temp)/2);
		}
		
		System.out.println(a);
		
	}

}
