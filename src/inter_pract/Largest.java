//find largest element from the array

package inter_pract;

public class Largest {
	public static void main(String[] args) {
		int arr[] = {1,2,5,4,3};
		
		int max = arr[0];
		
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum = "+max);
	}
}
