//task3 = print numbers from 21 to 30

package threads;

public class Task3 extends Thread{
	@Override
	public void run() {
		for(int i=101 ; i<=105 ; i++) {
			System.out.println(i);			
		}
	}
}
