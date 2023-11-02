//count all even numbers

package initialized_arrays;

public class Example4 {

	public static void main(String[] args) {
		
		int c=0;
		int[] arr = {8,9,4,5,3};
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]%2==0) {
				c++;
			}
		}
		System.out.println("Count = "+c);
		
	}

}
