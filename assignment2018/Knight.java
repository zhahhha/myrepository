package assignment2018;
import java.util.ArrayList;

import assignment2018.codeprovided.Piece;
import assignment2018.codeprovided.PieceCode;
public class Knight extends Piece{
	
	public Knight(int ix,int iy,int c,Board b) {
		super(PieceCode.KNIGHT,ix,iy,c,b);
	}
	
	public ArrayList<Move> availableMoves() {
		ArrayList<Move> KnightMoves=new ArrayList<Move>();
		int x=this.getX();
		int y=this.getY();
		
		if(!getBoard().outOfRange(x+1, y+2)) {
			if(!getBoard().occupied(x+1, y+2)) {
				KnightMoves.add(new Move(this,x,y,x+1,y+2,false));
			}
			else if(getBoard().occupied(x+1, y+2)&&getBoard().getPiece(x+1, y+2).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x+1,y+2,true));
			}
		}
		
		if(!getBoard().outOfRange(x-1, y+2)) {
			if(!getBoard().occupied(x-1, y+2)) {
				KnightMoves.add(new Move(this,x,y,x-1,y+2,false));
			}
			else if(getBoard().occupied(x-1, y+2)&&getBoard().getPiece(x-1, y+2).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x-1,y+2,true));
			}
		}
		
		if(!getBoard().outOfRange(x+2, y+1)) {
			if(!getBoard().occupied(x+2, y+1)) {
				KnightMoves.add(new Move(this,x,y,x+2,y+1,false));
			}
			else if(getBoard().occupied(x+2, y+1)&&getBoard().getPiece(x+2, y+1).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x+2,y+1,true));
			}
		}
		
		if(!getBoard().outOfRange(x+2, y-1)) {
			if(!getBoard().occupied(x+2, y-1)) {
				KnightMoves.add(new Move(this,x,y,x+2,y-1,false));
			}
			else if(getBoard().occupied(x+2, y-1)&&getBoard().getPiece(x+2, y-1).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x+2,y-1,true));
			}
		}
		
		if(!getBoard().outOfRange(x+1, y-2)) {
			if(!getBoard().occupied(x+1, y-2)) {
				KnightMoves.add(new Move(this,x,y,x+1,y-2,false));
			}
			else if(getBoard().occupied(x+1, y-2)&&getBoard().getPiece(x+1, y-2).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x+1,y-2,true));
			}
		}
		
		if(!getBoard().outOfRange(x-1, y-2)) {
			if(!getBoard().occupied(x-1, y-2)) {
				KnightMoves.add(new Move(this,x,y,x-1,y-2,false));
			}
			else if(getBoard().occupied(x-1, y-2)&&getBoard().getPiece(x-1, y-2).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x-1,y-2,true));
			}
		}
		
		if(!getBoard().outOfRange(x-2, y-1)) {
			if(!getBoard().occupied(x-2, y-1)) {
				KnightMoves.add(new Move(this,x,y,x-2,y-1,false));
			}
			else if(getBoard().occupied(x-2, y-1)&&getBoard().getPiece(x-2, y-1).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x-2,y-1,true));
			}
		}
		
		if(!getBoard().outOfRange(x-2, y+1)) {
			if(!getBoard().occupied(x-2, y+1)) {
				KnightMoves.add(new Move(this,x,y,x-2,y+1,false));
			}
			else if(getBoard().occupied(x-2, y+1)&&getBoard().getPiece(x-2, y+1).getColour()!=this.getColour()) {
				KnightMoves.add(new Move(this,x,y,x-2,y+1,true));
			}
		}
		
		return KnightMoves;
	}

}


