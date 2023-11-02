package overloading;

class D {
	public void Car() {
		System.out.println("Maruti Suzuki");
	}
	public void Car(String model) {
		System.out.println(model);
	}
}
class E extends D{
	public static void main(String[] args) {
		E obj = new E();
		
		obj.Car();
		obj.Car("WagonR");
	}


}
