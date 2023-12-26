//find the the difference between sum of even numbers and odd numbers

package inter_pract;

public class DiffofEvenandOdd {
	
	public static void main(String[] args) {
		int arr[] = {10,11,7,12,14};
		
		int EvenSum = 0;
		int OddSum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]%2==0) {
				EvenSum += arr[i];
			}
			else {
				OddSum += arr[i];
			}
		}
		System.out.println("Difference between sum of even numbers and odd numbers is: "+(OddSum-EvenSum));
	}

}
