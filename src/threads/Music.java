package threads;

public class Music extends Thread{
	
	public Music(String line) {
		super(line);
	}
	
	@Override
	public void run() {
		for (int i=0 ; i<5 ; i++)
			System.out.println("Playing the music"+this.getName());
	}
}
