package com.Boncorde.open2d.UI.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ButtonManager implements MouseListener {

    public ArrayList<Button> b = new ArrayList<>();

    public ButtonManager(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for(Button b : b){
            b.onClick(e.getX(), e.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
