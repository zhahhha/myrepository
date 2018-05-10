package assignment2018;
import assignment2018.codeprovided.Piece;

public class Move {
	Piece piece;
	Board board;

	int x1;
	int y1;
	int x2;
	int y2;
	boolean occupied;
	public Move(Piece p, int x1, int y1, int x2, int y2, boolean o) {
		piece = p;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		occupied = o;
		
	}
	public Piece getPiece() {
		return piece;
	}
	
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
	public boolean getBoolean() {
		return occupied;
	}
	
	public boolean equals(Move m) {
		if(this==null)
			return false;
		else
			return (this.getPiece().equals(m.getPiece())
					&&this.getX1()==m.getX1()
					&&this.getX2()==m.getX2()
					&&this.getY1()==m.getY1()
					&&this.getY2()==m.getY2()
					&&this.getBoolean()==m.getBoolean());
	}
	public String toString() {
		return piece.toString()+" from "+x1+" "+y1+" to "+x2+" "+y2+" "+occupied;
	}
	

}
