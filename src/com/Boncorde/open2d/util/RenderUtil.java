package com.Boncorde.open2d.util;

import org.lwjgl.opengl.GL11;

public class RenderUtil {

    public static void DrawOutlineCircle(float x , float y, float r, int red, int green, int blue){
        float c = (float) 0.008726646;
        GL11.glBegin(GL11.GL_POINTS);
        GL11.glColor3ub(((byte) red),((byte) green),((byte) blue));
        for(int i = 0; i < 720; i++){

            GL11.glVertex2f((float)(r * Math.cos((i*c))+x),(float) (r* Math.sin((i*c))+y));

        }
        GL11.glEnd();
    }

    public static void DrawCircleFill(int x, int y, float r, int red , int green, int blue){
        float c = (float) 0.008726646;

        GL11.glColor3ub(((byte) red),((byte) green),((byte) blue));
        for(int i = 0; i < 720; i++){
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex2f(x, y);
            GL11.glVertex2f((float)(r * Math.cos((i*c))+x),(float) (r* Math.sin((i*c))+y));
            GL11.glEnd();
        }

    }


    public static void DrawRect(int x, int y, int width, int height, int red, int blue, int green, int thickness ){

        for(int i = 0; thickness > i; i++) {
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex2i(x, y + i);
            GL11.glVertex2i(x + width, y + i);
            GL11.glEnd();
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex2i(x, y - i + height);
            GL11.glVertex2i(x + width, y - i + height);
            GL11.glEnd();
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex2i(x + i, y);
            GL11.glVertex2i(x + i, y + height);
            GL11.glEnd();
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex2i(x + width - i, y);
            GL11.glVertex2i(x + width - i, y + height);
            GL11.glEnd();
        }

    }





}
