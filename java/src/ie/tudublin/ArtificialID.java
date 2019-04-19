package ie.tudublin;

import processing.core.PApplet;

public class ArtificialID extends UIElement 
{
    private float r;

    public ArtificialID(float x, float y, float r, PApplet ui)
    {
        super(x, y, ui);
        this.r = r;
    }

    public void render()
    {
        ui.fill(25,25,112);
        ui.ellipse(x,y,r,r);
        ui.fill(255,0,0);
        ui.ellipse(x-5,y+5,r/2,r/2); 
        //ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        //ui.text("ArtificialID", x, y, 10);   
    }


}