package ie.tudublin;

import processing.core.PApplet;

public class Location extends UIElement
{
    private float size;
    public Location(float x, float y, float size, PApplet ui)
    {
        super(x,y,ui);
        this.size = size;
    }

    public void render()
    {
        ui.fill(255,0,0);
        ui.ellipse(x,y, size,size);
        
    }
}