package overriding;

public class Earthworm implements Animal{
	
	@Override
	public void Move() {
		System.out.println("I am earthworm, I can scrawl");
	}

}
