//wAP to print numbers between 1 and 100 divisible by 3,5 and both

package level3;

public class Hw4 {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=100 ; i++) {
			if(i%3==0) {
				System.out.print(i+",00 ");
			}
		}
		
		System.out.println();
		for(int i=1 ; i<=100 ; i++) {
			if(i%5==0) {
				System.out.print(i+", ");
			}
		}
		
		System.out.println();
		for(int i=1 ; i<=100 ; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+", ");
			}	
		}
		
	}

}
