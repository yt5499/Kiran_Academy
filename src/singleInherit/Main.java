package singleInherit;

public class Main {
	public static void main(String[] args) {
//		creating objects of parent and child class
		Animal obj = new Animal();
		Dog obj2 = new Dog();
		
		System.out.println(obj2.Name);
		System.out.println(obj2.Pet);
		
		obj2.MethodParent();
		
	}
}
