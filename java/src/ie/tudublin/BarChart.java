package ie.tudublin;

import processing.core.PApplet;

public class BarChart extends UIElement
{
    private float width;
    private float height;
    private int value;
    private float tx;
    private float ty; 

    public BarChart(float x, float y,float width, float height, int value, float tx, float ty,PApplet ui)
    {
        super(x,y,ui);
        this.width = width;
        this.height = height;
        this.value = value;
        this.tx = tx;
        this.ty = ty;
    }

    public void render()
    {
        ui.fill(200,255,200);
        ui.rect(x, y, width, height);
        ui.fill(100,100,100);
        ui.textSize(15);
        ui.textAlign(PApplet.CENTER);
        ui.text(value,x + width/2, ty+132);
        ui.fill(255);
        ui.textSize(14);
        ui.textAlign(PApplet.LEFT);
        ui.text("Congestion", tx,ty);
    }

}
