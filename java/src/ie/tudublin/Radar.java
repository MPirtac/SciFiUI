package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar extends UIElement {
    private float d;
    private float rotation;
    private PVector position;

    public Radar(float x, float y, float d, PApplet ui)
    {
        super(x,y,ui);
        this.d = d;
        position = new PVector(x,y);
    }

    public void render()
    {
        ui.stroke(0,0,255,100);
        ui.noFill();
        ui.translate(position.x, position.y);
        ui.ellipse(x, y, d, d);
        ui.ellipse(x, y, d-40, d-40);
        ui.ellipse(x, y, d-80, d-80);
        ui.ellipse(x, y, d-120, d-120);
        ui.ellipse(x, y, d-160, d-160);
        ui.stroke(0);
        ui.rotate(rotation);
        ui.fill(0, 204, 255,100);
        ui.arc(x, y,d,d, 0, ui.PI/2);
        ui.stroke(0);
        ui.noFill();
    }

    public void updateRadar()
    {
        this.x = (float) Math.sin(rotation);
        this.y = - (float) Math.cos(rotation);
        rotation = rotation + 0.2f;
    }
}

   