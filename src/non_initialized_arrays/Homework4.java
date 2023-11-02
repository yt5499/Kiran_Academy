//WAP to add all array elements which are completely divisible by 5

package non_initialized_arrays;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
//		accepting array elements from the user
		for(int i=0 ; i<size ; i++) {
			System.out.print("Enter element "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		
//		printing array elements
		for(int i=0 ; i<size ; i++) {
			if(arr[i]%5==0) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
