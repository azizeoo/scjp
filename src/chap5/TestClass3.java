package chap5;

import java.text.SimpleDateFormat;
import java.util.Date;


class MyException extends Exception{
	void logger(String msg) throws MyException{
		try {
			System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + " : " + msg);
		} catch (Exception e) {
			throw e;
		}
	}
}
public class TestClass3 {
	
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (MyException e) {
			e.logger("Error");
		}
	}
	
	//result ?
	// A - error compilation into MyException
	// B - error commpilation into main
	// C - print date + Error
	// D - the output cannot be predicted
}
