package ie.tudublin;

import processing.core.PApplet;

public class BodyBackground extends UIElement
{
    private float arc1;
    private float arc2;
    private float arc3;
    private float arc4;
    private float arc5;
    private float arc6;
    public float size1 = 530;
    public float size2 = 540;
    public float size3 = 550;
    public float size4 = 560;
    public float size5 = 580;
    public float size6 = 590;
    public float size7 = 600;


    public BodyBackground (float x, float y, float arc1, float arc2, float arc3, float arc4,float arc5, float arc6,PApplet ui){
        super(x, y, ui);
        this.arc1 = arc1;
        this.arc2 = arc2;
        this.arc3 = arc3;
        this.arc4 = arc4;
        this.arc5 = arc5;
        this.arc6 = arc6;
    }

    public void render()
    {
            
            //circles
            // ui.strokeWeight(2);
            // ui.stroke(179, 255, 218);
            // ui.noFill();
            // ui.ellipse(x,y, size2,size2);
            // ui.noStroke();

            // ui.strokeWeight(2);
            // ui.stroke(102, 102, 255);
            // ui.noFill();
            // ui.ellipse(x,y,size3,size3);

            // ui.strokeWeight(4);
            // ui.stroke(77, 255, 166);
            // ui.noFill();
            // ui.ellipse(x,y,size5,size5);

            // ui.strokeWeight(4);
            // ui.stroke(77, 255, 166);
            // ui.noFill();
            // ui.ellipse(x,y,size7,size7);

            //arcs
            ui.strokeWeight(5);
            ui.stroke(0,0,153); 
            ui.arc(x, y, size1,size1, arc5 , arc5 + 0.9f);
            ui.stroke(153,0,0); 
            ui.arc(x, y, size1, size1, arc6, arc6 + 1.5f);

            ui.strokeWeight(10);
            ui.stroke(153, 0, 0); 
            ui.arc(x, y, size4, size4, arc1 , arc1 + 0.9f);
            ui.stroke(0, 0, 153); 
            ui.arc(x, y, size4, size4, arc2, arc2 + 1.5f);

            ui.strokeWeight(7);
            ui.stroke(153, 0, 0); 
            ui.arc(x, y, 590, 590, arc3 , arc3 + 0.9f);
            ui.stroke(0, 0, 153); 
            ui.arc(x, y,size6,size6, arc4, arc4 + 1.5f);

            ui.strokeWeight(1);
            ui.noFill();
            ui.stroke(0);

            arc1 = arc1 + 0.1f;
            arc2 = arc2 + 0.1f;
            arc3 = arc3 - 0.1f;
            arc4 = arc4 - 0.1f;
            arc5 = arc5 - 0.2f;
            arc6 = arc6 - 0.2f;
            
    }
    
    
    
    
}