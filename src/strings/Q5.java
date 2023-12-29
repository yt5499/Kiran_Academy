//sorting string in alphabetical order

package strings;

import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {
		
		String str = "yash";
		
//		without using sort method
		char ch[] = str.toCharArray();
		for(int i=0 ; i<ch.length ; i++) {
			for(int j=i+1 ; j<ch.length ; j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(new String(ch));
		
//		with using sort method
		String str1 = "myself";
		char ch1[] = str1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(new String(ch1));
		
	}
}
