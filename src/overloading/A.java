//overloading = Same method name but different signature/parameters;
//normal+extra work

package overloading;

public class A {

	public void Car() {
		System.out.println("Maruti Suzuki");
	}
	public void Car(String model) {
		System.out.println(model);
	}
	public static void main(String[] args) {
		A obj = new A();
		
		obj.Car();
		obj.Car("Baleno");
	}

}