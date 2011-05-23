package chap3;

class SuperTestClass{
	
	byte number = 5;
	
	int getNumber(){
		return number;
	}
}
public class TestClass2 extends SuperTestClass {

	public static void main(String... args){
	
		int a = 1; 
		float b = 3.0;

		SuperTestClass test = new SuperTestClass();
		
		System.out.print("result is " + (test.getNumber() + a + b));
	}
	// What is the result ?
	// A - 4.0
	//
	// B - 6.0
	//
	// C - An exception is thrown at runtime 
	//
	// D - Compilation fails due to an error within lines 3 to 10
	//
	// E - Compilation fails due to an error within lines 13 to 21
}
