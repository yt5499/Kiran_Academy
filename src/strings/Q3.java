//remove all white spaces from given string

package strings;

public class Q3 {
	public static void main(String[] args) {
		String str = "   Dr   a m    a ti   c    ";
		
//		regex
		String plainStr = str.replaceAll("\\s", "");
		System.out.println(plainStr);
	}
}
