package chap2;

interface Animatable{
	public void animate();
}

abstract class Chess implements Animatable{
	
	Chess() { System.out.println("chess"); }
	
	Chess(String label){ System.out.println(label); }
	
}

class Piece extends Chess {
	
	String name = "piece";
	
	Piece() { super();}
	
	Piece(String label){
		super(name);
		name = label;
	}
	
	public void animate() { System.out.println("animate"); }
	
}

public class TestClass3 {
	
	public static void main(String[] args){

		Chess piece = new Piece("king");
		piece.animate();
		
		// What is the result ?
		//
		// A - king
		//     animate
		//
		// B - piece
	    //	   animate
		//
		// C - chess
		//     piece
		//     animate
		//
		// D - Error compilation
	}
}
