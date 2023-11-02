//odd numbers

package initialized_arrays;

public class Example2 {

	public static void main(String[] args) {
		
		int arr[] = {8,5,3,6};
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]%2==1) {
				System.out.println(arr[i]);
			}
		}

	}

}
