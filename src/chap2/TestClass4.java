package chap2;

class Main{
	void show(Integer x){
		System.out.print("aa"); // one Integer
	}
	void show(Integer... x){
		System.out.print("ii"); // many Integer
	}
	void show(String c){
		System.out.print("cc"); // one String
	}
	void show(String... cs){
		System.out.print("ss"); //many String
	}
	void show(Object o){
		System.out.print("oo"); // one Object
	}
	void show(Object o1, Object o2){
		System.out.print("zz"); // many Object
	}
}

public class TestClass4 {
	
	public static void main(String[] args){
		Main main = new Main();
		main.show(5);
		main.show("hello");
		main.show(12,26);
		main.show("Oops","play");
	}
	
	// What is the result ?
	//
	// A - aacciiss
	//
	// B - oooozzzz
	//
	// C - aacczzzz
	//
	// D - Error compilation
}
