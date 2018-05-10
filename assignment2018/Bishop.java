package assignment2018;
import java.util.ArrayList;

import assignment2018.codeprovided.Piece;
import assignment2018.codeprovided.PieceCode;

public class Bishop extends Piece{
	
	public Bishop(int ix, int iy, int c, Board b) {
		super(PieceCode.BISHOP, ix, iy, c, b);
	}
	
   
    
    public ArrayList<Move> availableMoves(){
    	int x = this.getX();
    	int y = this.getY();
    	
    	ArrayList<Move> Moves = new ArrayList<Move>();
    	
    	for(int i=1;!getBoard().outOfRange(x+i,y+i)&&!getBoard().occupied(x+i, y+i);i++) {
    		Moves.add(new Move(this,x,y,x+i,y+i,false));
    		if (!getBoard().outOfRange(x+i+1,y+i+1)&&getBoard().occupied(x+i+1, y+i+1)&&getBoard().getPiece(x+i+1, y+i+1).getColour()!=this.getColour()) {
    			Moves.add(new Move(this,x,y,x+i+1,y+i+1,true));
    		}
    	}
    	for(int i=1;!getBoard().outOfRange(x+i,y-i)&&!getBoard().occupied(x+i, y-i);i++) {
    		Moves.add(new Move(this,x,y,x+i,y-i,false));
    		if (!getBoard().outOfRange(x+i+1,y-i-1)&&getBoard().occupied(x+i+1, y-i-1)&&getBoard().getPiece(x+i+1, y-i-1).getColour()!=this.getColour()) {
    			Moves.add(new Move(this,x,y,x+i+1,y-i-1,true));
    		}
    	}
    	for(int i=1;!getBoard().outOfRange(x-i,y+i)&&!getBoard().occupied(x-i, y+i);i++) {
    		Moves.add(new Move(this,x,y,x-i,y+i,false));
    		if (!getBoard().outOfRange(x-i-1,y+i+1)&&getBoard().occupied(x-i-1, y+i+1)&&getBoard().getPiece(x-i-1, y+i+1).getColour()!=this.getColour()) {
    			Moves.add(new Move(this,x,y,x-i-1,y+i+1,true));
    		}
    	}
    	for(int i=1;!getBoard().outOfRange(x-i,y-i)&&!getBoard().occupied(x-i, y-i);i++) {
    		Moves.add(new Move(this,x,y,x-i,y-i,false));
    		if (!getBoard().outOfRange(x-i-1,y-i-1)&&getBoard().occupied(x-i-1, y-i-1)&&getBoard().getPiece(x-i-1, y-i-1).getColour()!=this.getColour()) {
    			Moves.add(new Move(this,x,y,x-i-1,y-i-1,true));
    		}
    	}
    	
    		
    	
    	
    	
    	return Moves;
    }
    

    
    

}
