package overloadingPoly;

import java.util.Scanner;

//method overloading(polymorphism) example
public class Main {

	public static void main(String[] args) {
//		object of main class
		Main obj = new Main();
		
//		method overloading
		obj.bookTicket();
		System.out.println();
		obj.bookTicket(11);
		System.out.println();
		obj.bookTicket(21, "Platinum");

	}
	
//	1 - Random booking
	void bookTicket() {
		System.out.println("Congrajulations! We booked Silver Single Ticket for you");
		System.out.println("Total cost: Rs.150/-");
	}
	
	//2 - Booking n number of tickets
	void bookTicket(int count) {
		System.out.println("Congrajulations you booked "+count+" Siler Category Tickets");
		int sum = count*150;
		System.out.println("Total cost: "+count+" * 150 = "+sum);
	}
	
	//3 - Booking n number of ticket with category
	void bookTicket(int count,String category) {
		System.out.println("Congraulations You booked "+count+" tickets of "+category);
		int sum = count*756;
		System.out.println("Total cost: "+count+" * 756 = "+sum+" of "+category+" category");
	}

}
