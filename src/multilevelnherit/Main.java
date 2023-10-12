package multilevelnherit;

public class Main {
	public static void main(String[] args) {
		Animal obj = new Animal();
		Dog obj2 = new Dog();
		Husky obj3 = new Husky();		//Husky() is in-direct child of Animal()
		
		System.out.println(obj3.pet); 		//Property of Parent
		System.out.println(obj3.bread);		//Property of Child
		System.out.println(obj3.name);		//Property of Child2
		
		obj3.MethodParent();
		obj3.MethodChild();
		obj3.MethodChild2();
		
	}
}
