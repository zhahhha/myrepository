package assignment2018;
import assignment2018.codeprovided.*;
import java.util.*;
public class Chess {
	Player p;
	


	public static void main(String args[]) {
		Board bo=new Board();
		Pieces w=new Pieces(bo,PieceCode.WHITE);
		Pieces bl=new Pieces(bo,PieceCode.BLACK);
		//
		//ArrayList<Move> m=bo.getPiece(3, 0).availableMoves();
		//for(Move move:m) {
		//	System.out.println(move);
		//}
		//
		TextDisplay text=new TextDisplay(bo);
		Player p1=new HumanPlayer("p1",w,bo,null); 
		Player p=new HumanPlayer(" p",bl,bo,null);
		p1.setOpponent(p);
		p.setOpponent(p1);
		GraphDisplay g=new GraphDisplay(bo);

		while (w.getPiece(w.getNumPieces()-1).toString().equals("k")&&bl.getPiece(bl.getNumPieces()-1).toString().equals("K")){
			
			p1.makeMove();
			g.setVisible(false);
			g=new GraphDisplay(bo);
			if(bl.getPiece(bl.getNumPieces()-1).toString().equals("K")) {	
				p.makeMove();
					
				g.setVisible(false);
				g=new GraphDisplay(bo);
			}
				
			

		}
		System.out.println("gameover");
		g.setVisible(false);

	}

}
