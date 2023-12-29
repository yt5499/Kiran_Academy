//8) Write a program for 240 - two four zero

package diwali_homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int cnum = num;
		
		String n = "";
		while(num>0) {
			int last = num%10;
			if(last==0) {
				n += "Zero ";
			}
			else if(last==1) {
				n += "One ";
			}
			else if(last==2) {
				n += "Two ";
			}
			else if(last==3) {
				n += "Three ";
			}
			else if(last==4) {
				n += "Four ";
			}
			else if(last==5) {
				n += "Five ";
			}
			else if(last==6) {
				n += "Six ";
			}
			else if(last==7) {
				n += "Seven ";
			}
			else if(last==8) {
				n += "Eight ";
			}
			else if(last==9) {
				n += "Nine ";
			}
			
			num = num/10;
		}
		
		System.out.println(cnum+" in words = "+revWords(n));
		
	}
	
	public static String revWords(String str) {
		Pattern p = Pattern.compile("\\s");
		
		String[] temp = p.split(str);
		String result = "";
		
		for(int i=0 ; i<temp.length ; i++) {
			result =temp[i]+" "+result;
		}
		
		return result;
	}
	
}
