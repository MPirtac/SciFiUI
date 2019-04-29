package ie.tudublin;

import processing.core.PApplet;

public class Ovals extends UIElement
{
    private float w;
    private float h;
    private float r,g,b;
    private String text;
    
    public Ovals(float x, float y, float w, float h, float r, float g, float b, String text, PApplet ui)
    {
        super(x,y,ui);
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
        this.text = text;
    }

    public void render()
    {
        ui.stroke(255);
        //ui.noFill();
        ui.fill(r,g,b, 100);
        ui.ellipse(x, y, w, h);
        ui.line(x-100,y,x-30,y);
        ui.stroke(r,g,b);
        ui.line(x-142,y,x-142,y-5);
        ui.stroke(r,g,b);
        ui.line(x-110,y,x-110,y-5);
        ui.fill(255);
        ui.textAlign(PApplet.LEFT);
        ui.textSize(5);
        ui.text(text, x-140, y);
        ui.fill(255);
        ui.textAlign(PApplet.LEFT);
        ui.textSize(14);
        ui.text("State Of The Body", 1120 ,600);
    }

}