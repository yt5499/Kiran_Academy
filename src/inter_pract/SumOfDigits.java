package inter_pract;

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 81;

		int sum=0;
		while(a>0) {
			int last = a%10;
			a = a/10;
			sum += last;
		}	
		System.out.println("Sum of digits is: "+sum);
	}

}
