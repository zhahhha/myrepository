package assignment2018;
import java.util.ArrayList;

import assignment2018.codeprovided.Piece;
import assignment2018.codeprovided.PieceCode;
public class Queen extends Piece{
	public Queen(int ix,int iy,int c,Board b) {
		super(PieceCode.QUEEN,ix,iy,c,b);
	}
	
	public ArrayList<Move> availableMoves() {
		ArrayList<Move> QueenMoves=new ArrayList<Move>();
		int x=this.getX();
		int y=this.getY();
		
		for(int i=1;!getBoard().outOfRange(x+i, y)&&!getBoard().occupied(x+i, y);i++) {
			QueenMoves.add(new Move(this,x,y,x+i,y,false));
			if(!getBoard().outOfRange(x+i+1, y)&&getBoard().occupied(x+i+1, y)&&getBoard().getPiece(x+i+1, y).getColour()!=this.getColour()) {
				QueenMoves.add(new Move(this,x,y,x+i+1,y,true));
			}
		}
		
		for(int i=1;!getBoard().outOfRange(x-i, y)&&!getBoard().occupied(x-i, y);i++) {
			QueenMoves.add(new Move(this,x,y,x-i,y,false));
			if(!getBoard().outOfRange(x-i-1, y)&&getBoard().occupied(x-i-1, y)&&getBoard().getPiece(x-i-1, y).getColour()!=this.getColour()) {
				QueenMoves.add(new Move(this,x,y,x-i-1,y,true));
			}
		}
		
		for(int i=1;!getBoard().outOfRange(x, y+i)&&!getBoard().occupied(x, y+i);i++) {
			QueenMoves.add(new Move(this,x,y,x,y+i,false));
			if(!getBoard().outOfRange(x, y+i+1)&&getBoard().occupied(x, y+i+1)&&getBoard().getPiece(x, y+i+1).getColour()!=this.getColour()) {
				QueenMoves.add(new Move(this,x,y,x,y+i+1,true));
			}
		}
		
		for(int i=1;!getBoard().outOfRange(x, y-i)&&!getBoard().occupied(x, y-i);i++) {
			QueenMoves.add(new Move(this,x,y,x,y-i,false));
			if(!getBoard().outOfRange(x, y-i-1)&&getBoard().occupied(x, y-i-1)&&getBoard().getPiece(x, y-i-1).getColour()!=this.getColour()) {
				QueenMoves.add(new Move(this,x,y,x,y-i-1,true));
			}
		}
		
    	for(int i=1;!getBoard().outOfRange(x, y-i-1)&&!getBoard().outOfRange(x+i,y+i)&&!getBoard().occupied(x+i, y+i);i++) {
    		QueenMoves.add(new Move(this,x,y,x+i,y+i,false));
    		if (!getBoard().outOfRange(x+i+1, y+i+1)&&getBoard().occupied(x+i+1, y+i+1)&&getBoard().getPiece(x+i+1, y+i+1).getColour()!=this.getColour()) {
    			QueenMoves.add(new Move(this,x,y,x+i+1,y+i+1,true));
    		}
    	}
    	for(int i=1;!getBoard().outOfRange(x+i,y-i)&&!getBoard().occupied(x+i, y-i);i++) {
    		QueenMoves.add(new Move(this,x,y,x+i,y-i,false));
    		if (!getBoard().outOfRange(x+i+1,y-i-1)&&getBoard().occupied(x+i+1, y-i-1)&&getBoard().getPiece(x+i+1, y-i-1).getColour()!=this.getColour()) {
    			QueenMoves.add(new Move(this,x,y,x+i+1,y-i-1,true));
    		}
    	}
    	for(int i=1;!getBoard().outOfRange(x-i,y+i)&&!getBoard().occupied(x-i, y+i);i++) {
    		QueenMoves.add(new Move(this,x,y,x-i,y+i,false));
    		if (!getBoard().outOfRange(x-i-1,y+i+1)&&getBoard().occupied(x-i-1, y+i+1)&&getBoard().getPiece(x-i-1, y+i+1).getColour()!=this.getColour()) {
    			QueenMoves.add(new Move(this,x,y,x-i-1,y+i+1,true));
    		}
    	}
    	for(int i=1;!getBoard().outOfRange(x-i,y-i)&&!getBoard().occupied(x-i, y-i);i++) {
    		QueenMoves.add(new Move(this,x,y,x-i,y-i,false));
    		if (!getBoard().outOfRange(x-i-1,y-i-1)&&getBoard().occupied(x-i-1, y-i-1)&&getBoard().getPiece(x-i-1, y-i-1).getColour()!=this.getColour()) {
    			QueenMoves.add(new Move(this,x,y,x-i-1,y-i-1,true));
    		}
    	}
    	for(int i=1;!getBoard().outOfRange(x+i,y+i)&&!getBoard().occupied(x+i, y+i);i++) {
    		QueenMoves.add(new Move(this,x,y,x+i,y+i,false));
    		if (!getBoard().outOfRange(x+i+1,y+i+1)&&getBoard().occupied(x+i+1, y+i+1)&&getBoard().getPiece(x+i+1, y+i+1).getColour()!=this.getColour()) {
    			QueenMoves.add(new Move(this,x,y,x-i-1,y-i-1,true));
    		}
    	}
    	return QueenMoves;
	}
}


