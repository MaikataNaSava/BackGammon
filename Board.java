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
 * @author minagm
 */
public class Board {

    Stone obj = new Stone();
    ArrayList<Stack<Board>> board = new ArrayList<>();
    public void tablaBoard() {//местата на пуловете по дифолт
//трябва да го линкнем с панелите 
        System.out.println(" ");
        
        for (int i = 0; i < 24; i++) {
            board.add(new Stack<Board>());
        }

        /*board[0] = 2;//B
        board[5] = 5;//W
        board[7] = 3;//W
        board[11] = 5;//B
        board[12] = 5;//W
        board[16] = 3;//B
        board[18] = 5;//B
        board[23] = 2;//W*/
    }

    public String position(ArrayList<Stack<String>> board) {//първоначално нареждане на пуловете за табла
        for (int i = 0; i < 2; i++) {
            board.get(0).push(String.valueOf(obj.Black));
        }
        for (int i = 0; i < 5; i++) {
            board.get(5).push(String.valueOf(obj.Red));
        }
        for (int i = 0; i < 3; i++) {
            board.get(7).push(String.valueOf(obj.Red));
        }
        for (int i = 0; i < 5; i++) {
            board.get(11).push(String.valueOf(obj.Black));
        }
        for (int i = 0; i < 5; i++) {
            board.get(12).push(String.valueOf(obj.Red));
        }
        for (int i = 0; i < 3; i++) {
            board.get(16).push(String.valueOf(obj.Black));
        }
        for (int i = 0; i < 5; i++) {
            board.get(18).push(String.valueOf(obj.Black));
        }
        for (int i = 0; i < 2; i++) {
            board.get(23).push(String.valueOf(obj.Red));
        }
        return null;
    }

    public static void main(String[] args) {
        Board obj = new Board();
        obj.tablaBoard();
//System.out.println(obj.position(board));
    }

}
