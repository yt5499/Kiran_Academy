//reverse a string

package strings;

import java.util.Scanner;

public class Q1 {
	
//	way 1
	public void revString1(String str) {
		for(int i=0 ; i<str.length() ; i++) {
			System.out.print(str.charAt((str.length()-1)-i));
		}
		System.out.println();
	}
	
//	way 2
	public void revString2(String str) {
		char arr[] = str.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
//	way 3 -- stringBuffer
	public void revString3(String str) {
		StringBuffer sbuf = new StringBuffer(str);
		System.out.println(sbuf.reverse());
	}

//	way 4 -- stringBuilder
	public void revString4(String str) {
		StringBuilder sbud = new StringBuilder(str);
		System.out.println(sbud.reverse());
	}
	
//	main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Q1 obj = new Q1();
		
		System.out.print("Enter your string: ");
		String str = sc.next();
		
//		calling way 1
		obj.revString1(str);

//		calling way 2
		obj.revString2(str);
		
//		calling way 3
		obj.revString3(str);
		
//		calling way 4
		obj.revString4(str);
	}

}
