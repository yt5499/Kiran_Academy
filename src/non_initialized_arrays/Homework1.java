//WAP to add unit digits of all array elements

package non_initialized_arrays;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0 ; i<size ; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i]=sc.nextInt();
		}
		
//		sum of unit digits
		int unitSum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			unitSum = unitSum + arr[i]%10;
		}
		
		//displaying final output
		System.out.println("Sum of all unit digits is: "+unitSum);
		
//		just to print unit digits:
		for(int i=0 ; i<size ; i++) {
			int unitD = 0;
			unitD = arr[i]%10;
			System.out.print(unitD+" ");
		}
		
	}

}
