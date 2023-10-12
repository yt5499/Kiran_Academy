package level1;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter M if Male, F if Female");
		
		char g = sc.next().charAt(0);					//important
		
		switch (g) {
		case 'M':
			System.out.println("Gender is Male");
			break;
			
		case 'F':
			System.out.println("Gender is Female");
			break;
			
		case 'm':
			System.out.println("Gender is Male");
			break;
			
		case 'f':
			System.out.println("Gender is Female");
			break;

		default:
			System.out.println("Invallid input!");
			break;
		}
		

	}

}
