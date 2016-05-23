/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Robbo13
 */
public class Cell extends JLabel{
    
    private boolean placed = false;
    
    public boolean isAlreadyThere(JPanel graphic){
        for (Object obj : graphic.getComponents()) {
            Cell forcell = (Cell) obj;
            if(forcell.equals(this)){
                continue;
            }
            if(forcell.getLocation().equals(this.getLocation()) && forcell.getIcon().equals(this.getIcon())){
                return true; 
            }
        }
        return false;
    }

    public Cell(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public Cell(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public Cell(String text) {
        super(text);
    }

    public Cell(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public Cell(Icon image) {
        super(image);
    }

    public Cell() {
    }

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }
}
