package overriding;

public class Tiger implements Animal{

	@Override
	public void Move() {
		System.out.println("I am tiger, I can walk");
	}
	
}
