//count digits

package inter_pract;

public class CountOfDigits {

	public static void main(String[] args) {
		
		int a = 52444;
		
		int count = 0;
		while(a>0) {
			a = a/10;
			count += 1;
		}
		System.out.println(count);

	}

}
