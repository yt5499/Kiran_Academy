//Find second largest element from the array using insertion sort

package inter_pract;

import java.util.Arrays;

public class secondLarget2 {
	
	public void arraySort(int arr[]) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=arr.length-1 ; j>i ; j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
//	main method
	public static void main(String[] args) {
		secondLarget2 obj = new secondLarget2();
		
		int arr[] = {5,25,29,15,78,45};
		
		obj.arraySort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Second largest:"+arr[arr.length-2]);
	}

}
