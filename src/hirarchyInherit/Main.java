package hirarchyInherit;

public class Main {

	public static void main(String[] args) {
		
		Parent obj = new Parent();
		Child obj2 = new Child();
		Child2 obj3 = new Child2();
		
		System.out.println(obj2.bankBalance);		//property of parent
		System.out.println(obj2.bankBalance2);		//property of child
		System.out.println(obj3.bankBalance3);		//property of child2
		
		obj3.Display();
		obj2.Display2();
		obj3.Display3();

	}

}
