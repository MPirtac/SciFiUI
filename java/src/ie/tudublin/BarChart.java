package ie.tudublin;

import processing.core.PApplet;

public class BarChart
{
    private float x;
    private float y;
    private float width;
    private float height;
    private int value; 
    private PApplet ui;

    public BarChart(float x, float y,float width, float height, int value, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.value = value;
        this.ui = ui;
    }

    public void render()
    {
        ui.fill(200,255,200);
        ui.rect(x, y, width, height);
        ui.fill(100,100,100);
        ui.textSize(15);
        ui.text(value,x + width/2, 697);
    }

}
