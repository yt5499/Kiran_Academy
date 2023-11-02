//WAP to print factorials of all array elements

package non_initialized_arrays;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0 ; i<size ; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0 ; i<size ; i++) {
			long fact = 1;
			for(int j=arr[i] ; j>0 ; j--) {
				fact = fact*j;
			}
			System.out.println(fact);
		}
	}

}
