package com.Boncorde.open2d.UI;

public abstract class UIComponent {
    int i;
    int x;
    int y;
  public UIComponent(int i, int x, int y){
    this.i = i;
    this.x = x;
    this.y = y;
  }


  public void onRender(int mx, int my){

  }

  public void onClick(int mx, int my){


  }




}
