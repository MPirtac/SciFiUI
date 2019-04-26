package ie.tudublin;

import processing.core.PApplet;

public class BodyBackground extends UIElement
{
    public BodyBackground (float x, float y, PApplet ui){
        super(x, y, ui);
    }

    public void render()
    {
            
            ui.stroke(46, 30, 245);
            
            //1st circles
            ui.stroke(0,255,0);
            //ui.fill(0,255,0);
            ui.noFill();
            ui.ellipse(x,y,540,540);
            ui.noStroke();
    }
    
    
    
    
}