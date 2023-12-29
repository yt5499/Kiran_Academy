//replace character with its occurance in string

package strings;

import java.util.Arrays;

public class Q6 {
	public static void main(String[] args) {
		String str = "typewriter";
		char charToReplace = 't';
		
		char ch[] = str.toCharArray();
		
		int count = 1;
		for(int i=0 ; i<ch.length ; i++) {
			if(ch[i]==charToReplace) {
				ch[i]=String.valueOf(count).charAt(0);
				count += 1;
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}
