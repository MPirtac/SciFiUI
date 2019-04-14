package ie.tudublin;

import processing.core.PApplet;

public class Ovals extends PApplet
{
    private float x;
    private float y;
    private float w;
    private float h;
    //private float colour;
    private float r,g,b;
    PApplet ui;
    
    public Ovals(float x, float y, float w, float h, float r, float g, float b, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
        this.ui = ui;
    }

    public void render()
    {
        ui.stroke(255);
        //ui.noFill();
        ui.fill(r,g,b, 100);
        ui.ellipse(x, y, w, h);
    }

}