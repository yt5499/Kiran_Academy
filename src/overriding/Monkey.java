package overriding;

public class Monkey implements Animal{
	
	@Override
	public void Move() {
		System.out.println("I am monkey, I can jump");
	}

}
