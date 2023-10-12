//WAP to count number of vowels from D to M

/*ASCII values:
	A-Z --> 65-90
	a-z --> 97-122
	
	A--65		a--97
	E--69		e--101
	I--73		i--105
	O--79		o--111
	U--85		u--117
	
*/

package level2;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Alphabet 1: ");
		char a1 = sc.next().charAt(0);
		System.out.println("Enter Alphabet 2: ");
		char a2 = sc.next().charAt(0);
		
		int x = (int)a1;
		int y = (int)a2;
		
		int[] UpV = {65,69,73,79,85};
		int[] DownV = {97,101,105,111,117};
		
		int c=0;
		for(int i=x ; i<=y ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(a1>=65 && a1<=90) {
					if(UpV[j]==i) {
						c++;
					}
				}
				else {
					if(DownV[j]==i) {
						c++;
					}
				}
			}
		}
		
		System.out.println("Number of vowels in between "+a1+" & "+a2+" are "+c);
		
	}

}
