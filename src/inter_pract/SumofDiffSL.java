//find difference between smallest and largest element from array

package inter_pract;
import java.lang.Math;
import java.util.Arrays;

public class SumofDiffSL {
	
	
//	main
	public static void main(String[] args) {
		SumofDiffSL obj = new SumofDiffSL();
		int arr[] = {4,2,6,5,1};
		
		obj.Sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Difference between smallest and largest element from array is: "+Math.abs(arr[arr.length-1]-arr[0]));
	}
	
//	sorting
	public void Sort(int arr[]) {
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=i+1 ; j>0 ; j--) {
				if(arr[j]<arr[j-1]) {
					Swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
	}
	
//	swapping
	public void Swap(int arr[], int in1, int in2) {
		int temp = arr[in1];
		arr[in1] = arr[in2];
		arr[in2] = temp;
	}
	
}
