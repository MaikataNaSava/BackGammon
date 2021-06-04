/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

/**
 *
 * @author minagm
 */
public class GamePlay {//движение на играта

    Board obj = new Board();
    Stone ob = new Stone();

    public void RedMoves() {
        for (int i = 0; i < 24; i++) {
            if (obj.board.get(i) != null) {
                if(obj.board.get(i).){
                    
                }
            } else {
                
            }
        }
    }

    public void BlackMoves() {

    }
}
