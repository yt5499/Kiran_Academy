//reverse the array
//eg- | 25 | 69 | 2006 |		-->		| 52 | 96 | 6002 |


package inter_pract;

import java.util.Iterator;

public class Nov27 {

	public static void main(String[] args) {
		int[] arr = {25,69,2006};
		int[] arr2 = new int[3];
		int num;
		for(int i=0 ; i<arr.length ; i++) {
			num = 0;
			while (arr[i]>0) {
				int last = arr[i]%10;
				arr[i] = arr[i]/10;
				num = (num*10)+last;
			}
			arr2[i] = num;
		}
		
		for(int i=0 ; i<3 ; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
