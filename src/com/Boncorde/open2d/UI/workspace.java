package com.Boncorde.open2d.UI;

import com.Boncorde.open2d.workspace.Camera;
import org.lwjgl.opengl.GL11;

public class workspace {
    //basic scale is 1 pixel = 0.01mm
    public static void workspace(){
        int ofx =0;
        int ofy = 0;
        int z = 0;
        Camera c = new Camera(ofx, ofy, z);
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex2f(0,1);
        GL11.glVertex2f(1920, 1);
        GL11.glEnd();
    }

}
