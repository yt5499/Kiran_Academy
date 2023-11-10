//WAP to accept string from the user and store all vowels from that string into another array.

package strings;

import java.util.Arrays;
import java.util.Scanner;
public class Example6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Accepting input from user
		System.out.print("Enter your string: ");
		String inputString = sc.next();
		
//		Storing vowels in another array
		char[] vowelsArray = extractVowels(inputString);
		
//		Displaying the result
		System.out.print("Vowels in the string: ");
		for(char vowel : vowelsArray) {
			System.out.println(vowel+" ");
		}
	}
	
	public static char[] extractVowels(String input) {
		char[] vowels = {'a','e','i','o','u'};
		char[] resultArray = new char[input.length()];
		int index = 0;
		
		for(char ch : input.toCharArray()) {
			if(isVowel(ch)) {
				resultArray[index++] = ch;
			}
		}
		
//		trimming the array to remove unused positions
		return Arrays.copyOf(resultArray, index);
		
	}
	
//	
	private static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}

}
