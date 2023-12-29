//remove duplicate character from a string

package strings;

public class Q4 {
	public static void main(String[] args) {
		
//		1. using java 8 approach
//		2. using indexof() of String class
//		3. using char array
//		4. using set interface method
		
		String str = "Programming";
		
//		1
		StringBuilder sbd = new StringBuilder();
		str.chars().distinct().forEach(c -> sbd.append((char)c));
		System.out.println(sbd);
		
	}
}
