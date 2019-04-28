package ie.tudublin;

import processing.core.PApplet;

public class Button extends UIElement
{
    private float width;
    private float height;

    public Button(float x, float y, float width, float height, PApplet ui)
    {
        super(x,y,ui);
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.noFill();
        ui.strokeWeight(3);
        ui.stroke(0, 0, 153,100);
        ui.rect(x, y, width, height);
        ui.strokeWeight(1);
        
    }
}