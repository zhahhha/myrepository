package assignment2018;
import java.util.ArrayList;

import assignment2018.codeprovided.Piece;
import assignment2018.codeprovided.PieceCode;
public class Rook extends Piece{
	public Rook(int ix,int iy,int c,Board b) {
		super(PieceCode.ROOK,ix,iy,c,b);
	}
	
	public ArrayList<Move> availableMoves() {
		ArrayList<Move> RookMoves=new ArrayList<Move>();
		int x=this.getX();
		int y=this.getY();
		
		for(int i=1;!getBoard().outOfRange(x+i, y)&&!getBoard().occupied(x+i, y);i++) {
			RookMoves.add(new Move(this,x,y,x+i,y,false));
			if(!getBoard().outOfRange(x+i+1, y)&&getBoard().occupied(x+i+1, y)&&getBoard().getPiece(x+i+1, y).getColour()!=this.getColour()) {
				RookMoves.add(new Move(this,x,y,x+i+1,y,true));
			}
		}
		
		for(int i=1;!getBoard().outOfRange(x-i, y)&&!getBoard().occupied(x-i, y);i++) {
			RookMoves.add(new Move(this,x,y,x-i,y,false));
			if(!getBoard().outOfRange(x-i-1, y)&&getBoard().occupied(x-i-1, y)&&getBoard().getPiece(x-i-1, y).getColour()!=this.getColour()) {
				RookMoves.add(new Move(this,x,y,x-i-1,y,true));
			}
		}
		
		for(int i=1;!getBoard().outOfRange(x, y+i)&&!getBoard().occupied(x, y+i);i++) {
			RookMoves.add(new Move(this,x,y,x,y+i,false));
			if(!getBoard().outOfRange(x, y+i+1)&&getBoard().occupied(x, y+i+1)&&getBoard().getPiece(x, y+i+1).getColour()!=this.getColour()) {
				RookMoves.add(new Move(this,x,y,x,y+i+1,true));
			}
		}
		
		for(int i=1;!getBoard().outOfRange(x, y-i)&&!getBoard().occupied(x, y-i);i++) {
			RookMoves.add(new Move(this,x,y,x,y-i,false));
			if(!getBoard().outOfRange(x, y-i-1)&&getBoard().occupied(x, y-i-1)&&getBoard().getPiece(x, y-i-1).getColour()!=this.getColour()) {
				RookMoves.add(new Move(this,x,y,x,y-i-1,true));
			}
		}
		return RookMoves;
	}

}
