package ie.tudublin;

import processing.core.PApplet;

public class ArtificialID extends UIElement 
{
    public float r;
    boolean growing = true;

    public ArtificialID(float x, float y, PApplet ui)
    {
        super(x, y, ui);
        r = 5;  
    }

    void grow()
    {
        if(growing)
        {
            r = r + 1;
        }
    }

    boolean edges()
    {
        return (x + r > ui.width || x - r < 0 || y + r > ui.height || y - r < 0);

    }

    public void render()
    {
        ui.stroke(255);
        //ui.strokeWeight(4);
        ui.noFill();
        ui.ellipse(x,y,r*2,r*2);
        ui.strokeWeight(1);
    }


}