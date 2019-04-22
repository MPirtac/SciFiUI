package ie.tudublin;

import processing.core.PApplet;

public class Graph
{
    private float x;
    private float y;
    private float w;
    private float h;
    PApplet ui;

    public Graph(float x, float y, float w, float h, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.ui = ui;
    }

    public void render()
    {  
        ui.noFill(); 
        ui.stroke(0,255,0);
        ui.rect(x,y,w,h);
        gridLines();
    }
    public void gridLines()
    {
        for(int i = 0; i<=12; i++)
        {
            float coord = ui.map(i, 0, 12, w, h);
            ui.line(coord,w,coord,h);
            ui.line(w,coord,h,coord);

        }
        ui.stroke(0);
    }

}