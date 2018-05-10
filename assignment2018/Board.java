package assignment2018;

import java.util.ArrayList;

import assignment2018.codeprovided.*;

public class Board{
	private Piece board[][];
	private int colour;
	private Player player;
	private Pieces pieces;

	public Board() {
		board=new Piece[PieceCode.YSIZE][PieceCode.XSIZE];



	}



	public Piece getPiece(int x,int y) {
		return board[x][y];
	}


	public boolean outOfRange(int x,int y) {
		return (x>=PieceCode.XSIZE)||(x<0)||(y>=PieceCode.YSIZE)||(y<0);
	}

	public boolean occupied(int x,int y) {

		return (board[x][y]!=null);
	}



	public void setPosition(int x,int y,Piece p) {

		board[x][y]=p;
	}



}
