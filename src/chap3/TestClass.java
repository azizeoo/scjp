package chap3;

class A{
	static{ System.out.print("A"); }
	{
		B b = new B();
		b.var = 10;
	}
	protected A(){ }
}
class B extends A{
	static{ System.out.print("B"); }
	protected double var;
	protected B(){
		System.out.print(var);
	}
}
public class TestClass extends B {
	
	public TestClass(){ super(); }
	
	public static void main(String... args){
		B myClass = new TestClass();
		myClass = null;
	}
	// What is the result ?
	// A - 0.0
	//
	// B - AB
	//
	// C - AB0.0
	//
	// D - AB0.0AB10.0
	//
	// E - AB followed by an Exception
	//
	// F - Error compilation
}