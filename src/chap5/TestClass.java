package chap5;

class Number{
	static int getInt(){
		return 5;
	}
	static double getDouble(){
		return 2.0;
	}
}
public class TestClass {

	public static void maind(String[] args){
		
		int x = Number.getInt();
		int y = (int)Number.getDouble();
		
		try{
			switch(x > y){
				case Boolean.TRUE:{
					System.out.println(" true ");
				}
				case Boolean.FALSE:{
					System.out.println(" false ");
				}
			}
		}catch(Exception e){
			System.out.println(" exception ");
		}
		
		//result ?
		// A - error compilation line 16
		// B - error compilation line 19
		// C - exception
		// D - true
		// E - true false
	}
}
