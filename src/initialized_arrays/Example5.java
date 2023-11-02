//count all odd numbers

package initialized_arrays;

public class Example5 {

	public static void main(String[] args) {
		
		int c=0;
		int[] arr = {8,9,4,5,3};
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]%2==1) {
				c++;
			}
		}
		System.out.println("Count = "+c);

	}

}
