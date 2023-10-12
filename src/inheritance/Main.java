package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Car ob = new Car();			// Parent class object
		Baleno obj = new Baleno();  // Child class object
		
		System.out.println(obj.type);			// property of class Car(Parent class)
		System.out.println(obj.color);			// property of class Baleno(Child class)
		
		obj.Display();                          // property of class Car(Parent class) fetched by child class object
		ob.Display();							// property of class Car(Parent class) fetched by its own
		
	}

}
