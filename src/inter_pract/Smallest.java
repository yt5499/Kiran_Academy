//find smallest from the array

package inter_pract;

public class Smallest {
	public static void main(String[] args) {
		int arr[] = {4,2,3,1,5};
		
		int min = arr[0];
		
		for(int i=arr.length-1 ; i>0 ; i--) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum = "+min);
	}
}
