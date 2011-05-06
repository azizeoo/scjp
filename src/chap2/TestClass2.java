package chap2;

class Car {

	int x;
	
	Car(){ System.out.print("Car"); }

	Car(int number) { x = number; }
	
	protected void run() throws NumberFormatException{
		System.out.print("->" +x);
	}
}

class Ferrari extends Car {
	
	Ferrari(){ System.out.print("Ferrari"); }
	
	Ferrari(int number) { x = number; }
	
	public void run() throws RuntimeException{
		System.out.print("->"+x);
	}
}

public class TestClass2 {

	public static void main(String[] args){
		
		try {
			Car car = new Car(90);
			Car ferrari = new Ferrari(130);
			
			car.run();
			ferrari.run();
		} catch (Exception e) {
			System.out.print("Oops...");
		}
		
		// What is the result ?
		//
		// A - Car->90->130
		//
		// B - 90->130 
		//
		// C - Car->90->Ferrari->130
		//
		// D - Car->Ferrari->90->130
		//
		// E - Oops...
		//
		// F-  Compilation fails due to an error on line 20
	}
}
