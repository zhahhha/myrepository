package assignment2018;

import assignment2018.codeprovided.*;

public class TextDisplay implements Display{
	Board board;
	Pieces mmp;

	public TextDisplay(Board b) {
		board=b;
		//displayBoard(new Pieces(b,0));
		//displayBoard(new Pieces(b,1));
		System.out.println();
		System.out.print(" |ABCDEFGH");
		System.out.println();
		System.out.print("----------");
		System.out.println();
		for(int i=0;i<PieceCode.XSIZE;i++) {
			System.out.print((i+1)+"|");
			for (int j=0;j<PieceCode.YSIZE;j++) {
				if(b.getPiece(j, i)==null) {
					System.out.print('.');
				}
				else 
					System.out.print(b.getPiece(j, i));
			}
			System.out.println();
		}

	}

	public void displayBoard(Pieces myPieces) {
		mmp=myPieces;
		System.out.println();
		System.out.print(" |ABCDEFGH");
		System.out.println();
		System.out.print("----------");
		System.out.println();
		for(int i=0;i<PieceCode.XSIZE;i++) {
			System.out.print((i+1)+"|");
			for (int j=0;j<PieceCode.YSIZE;j++) {
				if(board.getPiece(j, i)==null) {
					System.out.print('.');
				}
				else 
					System.out.print(board.getPiece(j, i));
			}
			System.out.println();
		};




	}
	
	/*public void print() {
		displayBoard(new Pieces(b,0));
		displayBoard(new Pieces(b,1));
		System.out.println();
		System.out.print(" |ABCDEFGH");
		System.out.println();
		System.out.print("----------");
		System.out.println();
		for(int i=0;i<PieceCode.XSIZE;i++) {
			System.out.print((i+1)+"|");
			for (int j=0;j<PieceCode.YSIZE;j++) {
				if(b.getPiece(j, i)==null) {
					System.out.print('.');
				}
				else 
					System.out.print(b.getPiece(j, i));
			}
			System.out.println();
		}
	}*/
	

}
