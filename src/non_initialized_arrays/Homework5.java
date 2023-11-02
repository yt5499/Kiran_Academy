//WAP to accept 5 symbols and print only alphabets

package non_initialized_arrays;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		char arr[] = new char[size];
		
//		accepting input from user
		for(int i=0 ; i<size ; i++) {
			System.out.print("Enter character: ");
			arr[i]=sc.next().charAt(0);
		}
		
//		displaying array elements only if it is alphabet
		for(int i=0 ; i<size ; i++) {
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z')) {				
				System.out.println(arr[i]);
			}
		}
	}

}
