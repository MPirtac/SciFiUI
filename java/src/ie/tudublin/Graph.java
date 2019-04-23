package ie.tudublin;

import processing.core.PApplet;

public class Graph
{
    private float x;
    private float y;
    private float distance;
    PApplet ui;
    

    public Graph(float x, float y,float distance, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.ui = ui;
    }

    public void render()
    {  
        
        ui.stroke(255);      
        gridLines();
    }
    
    public void gridLines()
    {
        ui.fill(0, 255, 255);
        float cx = x;
        float cy = y;
        int gap = 35;
        for(int i = 0; i<=9; i++)
        {
            ui.line(cx,cy,cx,cy+distance+7);
            cx += gap;
        }
        cx = x;
        for(int i = 0; i <= 6; i++)
        {
            ui.line(cx,cy,cx+(distance + distance/2) +18,cy);
            cy += gap;
        }
        ui.stroke(0);
    }


}