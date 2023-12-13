//to remove special characters in string

package strings;

public class Q2 {
	public static void main(String[] args) {
		String str = "w+el/-co*m#$e!";
		
//		approach -- RegEx(Regular expression)
		String plainText = str.replaceAll("[^a-zA-Z0-9]","" );
		System.out.println(plainText);
	}
}
