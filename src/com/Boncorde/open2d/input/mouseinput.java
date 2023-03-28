package com.Boncorde.open2d.input;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseinput implements MouseListener {

    public int mousex;

    public int mousey;


    public void MouseUpdate(){
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        mousex = (int) b.getX();
        mousey = (int) b.getY();

    }



    public void setMousex(int mousex) {
        this.mousex = mousex;
    }

    public void setMousey(int mousey) {
        this.mousey = mousey;
    }

    public int getMousex() {
        return mousex;
    }

    public int getMousey() {
        return mousey;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
