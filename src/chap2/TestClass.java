package chap2;

class Animal {

	Animal() { }
	
	protected void run(int x){
		System.out.println("Animal: " + x);
	}
}
class Elephant extends Animal {

	Elephant() { }
	
	protected void run(Integer x){
		System.out.println("Elephant: " + x);
	}
}
public class TestClass {
	public static void main(String[] args){
		
		Animal animal = new Animal();
		Animal elephant = new Elephant();
		
		animal.run(5);
		elephant.run(3);
		
		// What is the result ?
		// A - Animal: 5
		//	   Elephant: 3
		//
		// B - Animal: 5 
		//	   Animal: 3 
		//
		// C - Elephant: 3 
		//	   Animal: 5 
		//
		// D - Error compilation
	}
}
