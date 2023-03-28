package com.Boncorde.open2d.Render;

public class renderloop {

        public renderloop(){
            try {
                DisplayHandler.RenderMain();
            } catch (Exception e) {
                System.out.println("Could not initialize RenderLoop, JVM gave error: " + e.getMessage());
            }
            while (!DisplayHandler.isCloseRequested()) {

                DisplayHandler.RenderUpdate();
            }
        }
    }


