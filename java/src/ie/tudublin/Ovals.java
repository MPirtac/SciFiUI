package ie.tudublin;

import processing.core.PApplet;

public class Ovals extends PApplet
{
    private float x;
    private float y;
    private float w;
    private float h;
    PApplet ui;
    
    public Ovals(float x, float y, float w, float h, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.ui = ui;
    }

    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y, w, h);
    }

}