package threads;

public class Main {

	public static void main(String[] args) {
		
////		Tasks
//		Task1 t1 = new Task1();
//		Task2 t2 = new Task2();
//		Task3 t3 = new Task3();
//
////		calling threads
//		t1.start();
//		t2.start();
//		t3.start();
		
//		Examples
////		Runnable interface
//		Example1 e1 = new Example1();
//		Thread t1 = new Thread(e1);
//		
////		Thread class
//		Example2 e2 = new Example2();
//		
//		t1.start();
//		e2.start();
		
//		music and call, creating objects
		Music m = new Music("Harbour1");
		Music m2 = new Music("Harbour2");
		Call c = new Call();
		
//		setting priority(Bydefault priority of thread==5)
		m.setPriority(1);
		c.setPriority(10);
//		getting priority of thread
		System.out.println("Thread priorities: ");
		System.out.println(m.getPriority());
		System.out.println(c.getPriority());
		System.out.println();
//		Priority also depends on your OS, even sometimes lowest priority tasks gets executed if CPU is available
		
////		setting name of thread
//		m.setName("Gaana");
//		c.setName("ShowCaller");
////		getting name of thread
//		System.out.println("Names of threads");
//		System.out.println(m.getName());	// bydefault name of thread = Thread0,1,2 etc.
//		System.out.println(c.getName());
//		System.out.println();
		
		
		m.start();
		m2.start();
		c.start();
		
	}

}
