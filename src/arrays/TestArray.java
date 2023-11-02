//program for declaring,initializing and displaying array

package arrays;

public class TestArray {

	public static void main(String[] args) {
		
		int arr[] = new int[5];			//declaring and instantiation
//		initialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
//		printing array
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
