/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Board {

    Stone obj = new Stone();
 public static ArrayList<Stack<String>> board = new ArrayList<>();

    public ArrayList<Stack<String>> getBoard() {
        return board;
    }
 
    public void tablaBoard() {//местата на пуловете по дифолт
//трябва да го линкнем с панелите 
        System.out.println(" ");
       
        for (int i = 0; i < 24; i++) {
            board.add(new Stack<String>()); 
        }
  position(board);
        /*board[0] = 2;//B
        board[5] = 5;//W
        board[7] = 3;//W
        board[11] = 5;//B
        board[12] = 5;//W
        board[16] = 3;//B
        board[18] = 5;//B
        board[23] = 2;//W*/
    }

    public String position(ArrayList<Stack<String>> board) {
        for(int i = 0; i < 2; i++) {
            board.get(0).push("Black");    
        }
        for(int i = 0; i < 5; i++) {
            board.get(5).push("Red");
        }
        for(int i = 0; i < 3; i++) {
            board.get(7).push("Red");
        }
        for(int i = 0; i < 5; i++) {
            board.get(11).push("Black");
        }
        for(int i = 0; i < 5; i++) {
            board.get(12).push("Red");
        }
        for(int i = 0; i < 3; i++) {
            board.get(16).push("Black");
        }
        for(int i = 0; i < 5; i++) {
            board.get(18).push("Black");
        }
        for(int i = 0; i < 2; i++) {
            board.get(23).push("Red");
        }
        return null;
    }
}
