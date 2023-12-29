//add zero to the beginning of single digit number 

package inter_pract;

public class PaddingZero {
	public static void main(String[] args) {
		int num = 3;
		
//		adding 0 by using String.format
		String formatedNum = String.format("%02d", num);
		
		System.out.println("Original number: "+num);
		System.out.println("Formatted number: "+formatedNum);
		
//		here "%02d" is format specifier
//		1. "%" -- indicates the start of format specifier;
//		2. "0" -- pad number with zeros;
//		3. "2" -- this specifies the width of the field(output number), indicating that the result should have at-least two characters
	}
}
