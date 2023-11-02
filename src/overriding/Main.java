package overriding;

public class Main {

	public static void main(String[] args) {
		Tiger obj = new Tiger();
		Monkey obj2 = new Monkey();
		Earthworm obj3 = new Earthworm();
		
		obj.Move();
		obj2.Move();
		obj3.Move();
	}
}