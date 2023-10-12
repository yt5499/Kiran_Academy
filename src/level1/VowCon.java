//WAP to check whether a character is vowel or consonant

package level1;

import java.util.Scanner;

public class VowCon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any character: ");
		
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("Is a Vowel");
			break;
			
		case 'E':
			System.out.println("Is a Vowel");
			break;
			
		case 'I':
			System.out.println("Is a Vowel");
			break;
			
		case 'O':
			System.out.println("Is a Vowel");
			break;
			
		case 'U':
			System.out.println("Is a Vowel");
			break;
			
		case 'a':
			System.out.println("Is a Vowel");
			break;
			
		case 'e':
			System.out.println("Is a Vowel");
			break;
			
		case 'i':
			System.out.println("Is a Vowel");
			break;
			
		case 'o':
			System.out.println("Is a Vowel");
			break;
			
		case 'u':
			System.out.println("Is a Vowel");
			break;

		default:
			System.out.println("Is a Consonant");
			break;
		}

	}

}
