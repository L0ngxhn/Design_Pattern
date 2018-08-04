package client;

import template.Chess;
import template.Game;

public class Player {
	  public static void main(String[] args) {
	         Game chessGame = new Chess();
	       // chessGame.initializeGame();
	         chessGame.playOneGame(1); //call template method
	     }
}
