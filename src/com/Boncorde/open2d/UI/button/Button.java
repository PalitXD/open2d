package com.Boncorde.open2d.UI.button;

public class Button  {
    String Name;
    int x;
    int y;
    int width;
    int height;
    public Button(String name, int x ,int y){
    Name = name;
    x = x;
    y = y;
    }

    public void RenderButton(){

    }

    public void onClick(int mx ,int my){
            if(mx <= x && mx >= width && my <= y && my >= height){
                System.out.println("clicked! " + Name);
            }
    }


}
