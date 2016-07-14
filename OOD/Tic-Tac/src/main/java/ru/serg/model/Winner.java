package ru.serg.model;

/**
 * Created by Serg on 14.07.2016.
 */
public class Winner {

  public int[][] board = new int[3][3];

    public boolean isWinner(){

        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == count){
                    count++;
                }
            }
            if (count == this.board.length){
                return true;
            }
        }
        return false;
    }


}
