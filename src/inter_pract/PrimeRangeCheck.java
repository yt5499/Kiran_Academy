package inter_pract;

import java.util.Scanner;

public class PrimeRangeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prime numbers from: ");
		int a = sc.nextInt();
		
		System.out.println("Numbers till: ");
		int b = sc.nextInt();
		
		boolean pr ;
		for(int i=a ; i<=b ; i++) {
			pr = true;
			if(i==1) {
				pr = false;
			}
			for(int j=2 ; j<i ;j++) {
				if(i%j==0) {
					pr = false;
				}
			}
			if(pr) {
				System.out.print(i+" ");
			}
		}

	}

}
