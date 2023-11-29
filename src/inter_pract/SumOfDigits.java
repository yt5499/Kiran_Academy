//sum of digits when number is positive, negative or zero;

package inter_pract;

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 1;

		int sum=0;
		if(a>0) {
			while(a>0) {
				int last = a%10;
				a = a/10;
				sum += last;
			}				
		}
		else {
			while(a<0) {
				int last = a%10;
				a = a/10;
				sum += last;
			}
		}
		System.out.println("Sum of digits is: "+sum);
	}

}
