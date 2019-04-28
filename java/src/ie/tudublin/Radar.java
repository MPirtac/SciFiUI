package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar extends UIElement {
    private float d;
    private float r;
    private float rotation;
    private PVector position;

    public Radar(float x, float y, float d, PApplet ui)
    {
        super(x,y,ui);
        this.d = d;
        r =  (d/2) - 30;
        position = new PVector(x,y);
    }

    public void render()
    {
        ui.stroke(0,0,255);
        ui.noFill();
        ui.translate(position.x, position.y);
        ui.ellipse(x, y, d, d);
        ui.stroke(255,0,0);
        ui.rotate(rotation);
        ui.line(x , y , x - r  , y - r);
        ui.stroke(0);
    }

    public void updateRadar()
    {
        this.x = (float) Math.sin(rotation);
        this.y = - (float) Math.cos(rotation);
        rotation = rotation + 0.2f;
    }
}

   