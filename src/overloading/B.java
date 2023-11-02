package overloading;

class B {

	public void Car() {
		System.out.println("Maruti Suzuki");
	}
	public void Car(String model) {
		System.out.println(model);
	}


}
class C{
	public static void main(String[] args) {
		B obj = new B();

		obj.Car();
		obj.Car("Baleno");
	}
}

