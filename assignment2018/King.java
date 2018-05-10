package assignment2018;
import java.util.ArrayList;

import assignment2018.codeprovided.Piece;
import assignment2018.codeprovided.PieceCode;

public class King extends Piece{
	public King(int ix,int iy,int c,Board b) {
		super(PieceCode.KING,ix,iy,c,b);
	}
	
	public ArrayList<Move> availableMoves() {
		ArrayList<Move> KingMoves=new ArrayList<Move>();
		int x=this.getX();
		int y=this.getY();
		
		if(!getBoard().outOfRange(x+1, y)) {
			if(!getBoard().occupied(x+1, y)) {
				KingMoves.add(new Move(this,x,y,x+1,y,false));
			}
			else if(getBoard().occupied(x+1, y)&&getBoard().getPiece(x+1, y).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x+1,y,true));
			}
		}
		
		if(!getBoard().outOfRange(x-1, y)) {
			if(!getBoard().occupied(x-1, y)) {
				KingMoves.add(new Move(this,x,y,x-1,y,false));
			}
			else if(getBoard().occupied(x-1, y)&&getBoard().getPiece(x-1, y).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x-1,y,true));
			}
		}
		
		if(!getBoard().outOfRange(x, y+1)) {
			if(!getBoard().occupied(x, y+1)) {
				KingMoves.add(new Move(this,x,y,x,y+1,false));
			}
			else if(getBoard().occupied(x, y+1)&&getBoard().getPiece(x, y+1).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x,y+1,true));
			}
		}
		
		if(!getBoard().outOfRange(x, y-1)) {
			if(!getBoard().occupied(x, y-1)) {
				KingMoves.add(new Move(this,x,y,x,y-1,false));
			}
			else if(getBoard().occupied(x, y-1)&&getBoard().getPiece(x, y-1).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x,y-1,true));
			}
		}
		
		if(!getBoard().outOfRange(x+1, y+1)) {
			if(!getBoard().occupied(x+1, y+1)) {
				KingMoves.add(new Move(this,x,y,x+1,y+1,false));
			}
			else if(getBoard().occupied(x+1, y+1)&&getBoard().getPiece(x+1, y+1).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x+1,y+1,true));
			}
		}
		
		if(!getBoard().outOfRange(x-1, y+1)) {
			if(!getBoard().occupied(x-1, y+1)) {
				KingMoves.add(new Move(this,x,y,x-1,y+1,false));
			}
			else if(getBoard().occupied(x-1, y+1)&&getBoard().getPiece(x-1, y+1).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x-1,y+1,true));
			}
		}
		
		if(!getBoard().outOfRange(x+1, y-1)) {
			if(!getBoard().occupied(x+1, y-1)) {
				KingMoves.add(new Move(this,x,y,x+1,y-1,false));
			}
			else if(getBoard().occupied(x+1, y-1)&&getBoard().getPiece(x+1, y-1).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x+1,y-1,true));
			}
		}
		
		if(!getBoard().outOfRange(x-1, y-1)) {
			if(!getBoard().occupied(x-1, y-1)) {
				KingMoves.add(new Move(this,x,y,x-1,y-1,false));
			}
			else if(getBoard().occupied(x-1, y-1)&&getBoard().getPiece(x-1, y-1).getColour()!=this.getColour()) {
				KingMoves.add(new Move(this,x,y,x-1,y-1,true));
			}
		}
		
		return KingMoves;
	}

}
