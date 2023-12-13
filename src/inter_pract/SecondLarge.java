//Find second largest element from the array using bubble sort

package inter_pract;

import java.util.Arrays;

public class SecondLarge {
	public static void main(String[] args) {
		SecondLarge obj = new SecondLarge();
		
		int arr[] = {4,5,2,1,3};
		
		obj.arraySort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Second maximum = "+arr[arr.length-2]);

	}
	
//	sorting
	public void arraySort(int arr[]) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=1 ; j<arr.length ; j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
//					Swap(arr[j-1], arr[j]);
				}
			}
		}
	}
	
////	swapping
//	public void Swap(int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//	}
	
	
}
