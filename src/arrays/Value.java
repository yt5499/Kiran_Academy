//java program that uses array

package arrays;

public class Value {
	public static void main(String[] args) {
//		creating int array
		int a[] = new int[5];
		
//		assign first three elements
		a[0]=1;
		a[1]=10;
		a[2]=100;
		
//		loop over elements
		for(int i=0 ; i<a.length ; i++) {
//			get value
			int value = a[i];
			
//			print value
			System.out.println(value);	
		}
	}	
}
