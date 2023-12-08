//implementing Runnable interface

package threads;

public class Example1 extends Example implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Iam in example1");
	}
}
