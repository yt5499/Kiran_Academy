//task3 = print numbers from 21 to 30

package threads;

public class Task3 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=21 ; i<=30 ; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
