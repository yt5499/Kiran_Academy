/*
Implement a Flight class with private attributes like flightNumber, origin, destination, and seatsAvailable.
Provide methods to book and cancel seats, making sure that the number of available seats is updated accordingly.
 */

package inter_pract;

public class Flight {
	private int flightNumber;
	private int seatAvail;
	private String origin;
	private String destination;

	//	constructor of class Flight
	public Flight(int flightNumber, int seatAvail, String origin, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.seatAvail = seatAvail;
		this.origin = origin;
		this.destination = destination;
	}

	//	method to book seats;
	public void toBook(int numberOfSeats) {
		if(numberOfSeats > 0 && numberOfSeats <= seatAvail) {
			seatAvail -= numberOfSeats;
			System.out.println(numberOfSeats+" seat(s) successfully booked for flight "+flightNumber);
		}
		else {
			System.out.println("Invalid seat(s) entry or all seats have been booked");
		}
	}

	//	method to cancel seats;
	public void toCancel(int numberOfSeats) {
		if(numberOfSeats > 0 && numberOfSeats <= getTotalSeats()) {
			seatAvail += numberOfSeats;
			System.out.println(numberOfSeats+" seat(s) successfully canceled for flight "+flightNumber);
		}
		else {
			System.out.println("Invalid seat(s) entry or seats haven't booked");
		}
	}

	// Getter method to retrieve total seats
	public int getTotalSeats() {
		return seatAvail + getBookedSeats();
	}

	// Getter method to retrieve booked seats
	private int getBookedSeats() {
		return seatAvail;
	}

	// Getter method to retrieve flight number
	public int getFlightNumber() {
		return flightNumber;
	}

	// Getter method to retrieve origin
	public String getOrigin() {
		return origin;
	}

	// Getter method to retrieve destination
	public String getDestination() {
		return destination;
	}

	//    main method
	public static void main(String[] args) {
		Flight obj = new Flight(512, 50, "Pune", "MOPA");
		
		System.out.println("Available seats for flight "+obj.getFlightNumber()+" are: "+obj.getBookedSeats());
		
		obj.toBook(20);
		
		System.out.println(obj.getBookedSeats());
	}

}





















