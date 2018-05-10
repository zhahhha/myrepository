package assignment2018;
import java.util.*;
import assignment2018.codeprovided.*;

public class HumanPlayer extends Player {
	private Board bo;


	public HumanPlayer(String n,Pieces p, Board b, Player o) {
		super(n,p,b,o);
	}

	@Override
	public boolean makeMove() {
		// TODO Auto-generated method stub
			
			//boolean mov=false;
			Scanner scan = new Scanner(System.in);
			System.out.print(this.toString()+"Move");
			int x1=scan.nextInt();
			int y1=scan.nextInt();
			System.out.print("to");
			int x2=scan.nextInt();
			int y2=scan.nextInt();
			//int x1=x10-1;
			//int y1=y10-1;
			//int x2=x20-1;
			//int y2=y20-1;
			if(getBoard().outOfRange(x1, y1)||getBoard().outOfRange(x2, y2)) {
				System.out.println("out of range!");
				makeMove();
				return false;
			}
			boolean bol=(getBoard().occupied(x2, y2)
									&&getBoard().getPiece(x2, y2).getColour()!=getBoard().getPiece(x1, y1).getColour()) ;
			Piece p=getBoard().getPiece(x1, y1);
			if(p==null) {
				System.out.println("illegal move");
				makeMove();
				return false;
			}

			else {
				for(int i=0;i<getPieces().getNumPieces();i++) {
					if(getPieces().getPiece(i).equals(p)) {
						ArrayList<Move> av=new ArrayList<Move>();
						av=p.availableMoves();
						Move move = new Move(p,x1,y1,x2,y2,bol);
						for(int j=0;j<av.size();j++) {
							
							if(move.equals(av.get(j))) {
								if(bol==true){
									getOpponent().getPieces().delete(getBoard().getPiece(x2,y2));
								}
								getBoard().setPosition(x2, y2, p);
								getBoard().setPosition(x1, y1, null);
								for(int k=0;k<getPieces().getNumPieces();k++) {
									if(p.equals(getPieces().getPiece(k))) {
										getPieces().getPiece(k).setPosition(x2, y2);
										
									}
								}

								new TextDisplay(getBoard());
								return true;

								
							}
						}

					}

				}
			}
		return true;
	}



}
