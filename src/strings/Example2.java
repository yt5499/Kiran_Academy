//WAP to accept password from the user and display/count all non-alphabets from the password

package strings;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		

		System.out.print("Enter any password phrase: ");
		String str = sc.nextLine();
		
		String nA = " ";
		for(int i=0 ; i<str.length() ; i++) {
			if((str.charAt(i)>=32 && str.charAt(i)<=47) || (str.charAt(i)>=91 && str.charAt(i)<=96) || (str.charAt(i)>=123 && str.charAt(i)<=126) || (str.charAt(i)>=48 && str.charAt(i)<=57)) {
				nA += str.charAt(i);
			}
		}
		System.out.println(nA);
	}

}
