//task2 = print numbers from 11 to 20;

package threads;

public class Task2 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=11 ; i<=20 ; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
