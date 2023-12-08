//task1 = display numbers from 1 to 10;

package threads;

public class Task1 extends Thread{
	@Override
	public void run() {
		
		try {
			for(int i=1 ; i<=10 ; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
