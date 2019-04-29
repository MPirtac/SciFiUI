package ie.tudublin;

import processing.core.PApplet;

public class Triangles extends UIElement
{
    private float x1;
    private float x2;
    private float x3;
    private float y1;
    private float y2;
    private float y3;
    private float r,g,b;
    private int text;
    
    public Triangles(float x1, float y1, float x2, float y2, float x3, float y3, float r, float g, float b, int text, float x, float y, PApplet ui)
    {
        super(x, y, ui);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.r = r;
        this.g = g;
        this.b = b;
        this.text = text;
    }

    public void render()
    {
        ui.stroke(0);
        ui.fill(r-200,g-5,b-100, 100);
        //ui.noFill();
        ui.triangle(x1,y1,x2,y2,x3,y3);
        ui.strokeWeight(4);
        ui.stroke(255);
        ui.point(x3,y3+5);
        ui.strokeWeight(1);
        ui.line(x3-25,y3+5,x3-5,y3+5);
        ui.fill(255);
        ui.textAlign(PApplet.LEFT);
        ui.textSize(10);
        ui.text(text + "%",x3-55,y3+10);
        ui.strokeWeight(1);
        ui.textSize(14);
        ui.textAlign(PApplet.LEFT);
        ui.text("Rehabilitation",x,y);
    }
}