//Q- find duplicate numbers from two arrays

package inter_pract;

public class Nov18 {

	public static void main(String[] args) {
		
		int arr[] = {8,7,5,2};
		int arr2[] = {1,3,8,2,4};
		
//		int count = 0;
		for(int i=0 ; i<arr.length ; i++) {
//			static int a = 0;						// We cannot declare local variable as static
			for(int k=0 ; k<arr2.length ; k++) {
				if(arr[i]==arr2[k]) {
//					count++;

					System.out.println(arr[i]);
				}
			}
		}

	}

}
