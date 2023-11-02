//WAP to copy array into another array in reverse order

package non_initialized_arrays;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int arr2[] = new int[size];
		
		for(int i=0 ; i<size ; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		for(int i=size-1 ; i>=0 ; i--) {
			arr2[i]=arr[(size-1)-i];
		}
		
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr2[i]);
		}
	}

}
