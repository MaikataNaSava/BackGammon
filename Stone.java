/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.util.Stack;

/**
 *
 * @author minagm
 */
public class Stone {

    //public String type = null;
    public Stack<String> Red = new Stack<>();
    public Stack<String> Black = new Stack<>();

    public String stones() {
        for (int i = 0; i < 15; i++) {
            Red.push("Red");
        }
        for (int i = 0; i < 15; i++) {
            Black.push("Black");
        }
        return null;
    }

}
