//sum of all elements in array

package initialized_arrays;

public class Example6 {

	public static void main(String[] args) {
		
		int c=0;
		int sum=0;
		int[] arr = {8,9,4,5,3};
		for(int i=0 ; i<arr.length ; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum = "+sum);

	}

}
