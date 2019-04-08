package ie.tudublin;

import processing.core.PApplet;

public class Circle extends UIElement {
    private int size;
    private int text;
    private float rotation;


    public Circle(float x, float y, int size, int text, float rotation, PApplet ui){
        super(x, y, ui);
        this.size = size;
        this.text = text;
        this.rotation = rotation;

    }

    public void render(){
        //for the arc
        ui.fill(100,100,100);
        ui.pushMatrix();
        ui.translate(x,y);
        ui.rotate(rotation);
        ui.fill(100,100,100);
        ui.arc(0,0,size+20, size+20, 0, ui.PI);
        ui.fill(200, 255, 200);
        ui.arc(0,0,size+20, size+20, ui.PI, ui.PI * 2);
        ui.popMatrix();
        rotation += 0.05f;
        //for the circle 
        ui.stroke(0);
        ui.fill(255);
        ui.ellipse(x, y, size, size); 
        //for the text
        ui.fill(0);
        ui.textSize(10);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text + "%", x, y);          
    }


}