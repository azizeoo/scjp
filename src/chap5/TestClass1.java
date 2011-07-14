package chap5;

public class TestClass1 {
	public static void main(String[] args) {
		boolean flag;
		try {
			flag = isDivisible(3,0);
			System.out.println("result : " +  flag);
		} catch (ArithmeticException e) {
			System.out.println("result : false");
		}
	}

	private static boolean isDivisible(int numerator, int denominator) throws ArithmeticException {
		try {
			int result = numerator / denominator;
			return true;
		} catch (ArithmeticException e) {
			return false;
		} finally {
			return true;
		}
	}
	
	//result ?
	// A - result : true
	// B - result : false
	// C - error compilation
	// D - throw an exception
}
