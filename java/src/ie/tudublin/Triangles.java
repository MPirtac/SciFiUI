package ie.tudublin;

import processing.core.PApplet;

public class Triangles
{
    private float x1;
    private float x2;
    private float x3;
    private float y1;
    private float y2;
    private float y3;
    private float r,g,b;
    PApplet ui;
    
    public Triangles(float x1, float y1, float x2, float y2, float x3, float y3, float r, float g, float b, PApplet ui)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.r = r;
        this.g = g;
        this.b = b;
        this.ui = ui;
    }

    public void render()
    {
        ui.stroke(0);
        ui.fill(r-200,g-5,b-100, 100);
        //ui.noFill();
        ui.triangle(x1,y1,x2,y2,x3,y3);
    }
}