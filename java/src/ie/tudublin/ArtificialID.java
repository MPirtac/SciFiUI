package ie.tudublin;

import processing.core.PApplet;

public class ArtificialID extends UIElement 
{

    public ArtificialID(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.pushMatrix();
        ui.translate(ui.width/21,ui.height-80);
        ui.stroke(0,0,255);
        ui.point(x*50,y*50);
        ui.point(x*45,y*45);
        ui.point(x*40,y*40);
        ui.popMatrix();
        ui.stroke(0);
        ui.fill(255);
        ui.textSize(14);
        ui.textAlign(PApplet.CENTER, PApplet.TOP);
        ui.text("Artificial ID", ui.width/21, ui.height-160);            
    }


}