
package inter_pract;
import java.lang.Math;

public class SumofDiff {
//calculate the sum of difference in an array
//	public static void main(String[] args) {
//		int arr[] = {10,11,7,12,14};
//		
//		int sum = 0;
//		for(int i=arr.length-1 ; i>0 ; i--) {
////			sum += arr[i] - arr[i-1];
//			sum += Math.abs(arr[i]-arr[i-1]);
//		}
//		System.out.println(sum);
//	}
	
//Find maximum diff btween adjcent numbers from array
	public static void main(String[] args) {
		int arr[] = {10,11,7,12,14};
		
		int max = 0;
		// Logic 1
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(max<(Math.abs(arr[i]-arr[i+1]))) {
				max = Math.abs(arr[i]-arr[i+1]);
			}
		}
//		// Logic 2
//		for(int i=0 ; i<arr.length-1 ; i++) {
//			int diff = Math.abs(arr[i]-arr[i+1]);
//			if(diff>max) {
//				max = diff;
//			}
//		}
		System.out.println("Maximum difference is: "+max);
	}

}
