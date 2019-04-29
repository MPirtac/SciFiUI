package ie.tudublin;

import processing.core.PApplet;

public class Graph extends UIElement
{
    private float distance;
  
    

    public Graph(float x, float y,float distance, PApplet ui)
    {
        super(x,y,ui);
        this.distance = distance;
    }

    public void render()
    {  
        
        ui.stroke(100,100,100);  
        //The Grid
        gridLines();

        //The Coordinates for the line
        int[] data1 = {20,31,12,18,7,43,21,34,20};
        int[] data2 = {30,12,15,28,17,20,30,34,30};
        int[] data3 = {40,30,20,10,5,10,20,30,40};
        int[] data4 = {10,11,12,13,14,15,16,17,18};
        int[] data5 = {10,9,6,0,1,7,3,5,0,0};
        int[] data6 = {0,11,20,21,22,30,21,31,30};
        int[] data7 = {1,2,3,4,5,6,7,8,9};

        //The lines
        ui.stroke(255);
        lines(data1);
        ui.stroke(255,0,0);
        lines(data2);
        ui.stroke(0,255,0);
        lines(data3);
        ui.stroke(0,0,255);
        lines(data4);
        ui.stroke(191, 0, 255);
        lines(data5);
        ui.stroke(0, 255, 191);
        lines(data6);
        ui.stroke(255, 255, 0);
        lines(data7);
        ui.stroke(0);
        ui.fill(255);
        ui.textAlign(PApplet.LEFT);
        ui.textSize(20);
        ui.text("Medical Service", x,y-30);
        
    }
    
    public void gridLines()
    {
        ui.fill(0, 255, 255);
        float cx = x;
        float cy = y;
        int gap = 35;
        for(int i = 0; i<=9; i++)
        {
            ui.line(cx,cy,cx,cy+distance+7);
            cx += gap;
        }
        cx = x;
        for(int i = 0; i <= 6; i++)
        {
            ui.line(cx,cy,cx+(distance + distance/2) +18,cy);
            cy += gap;
        }
        ui.stroke(0);
    }

    public void lines(int[] data)
    { 
        float cox = x;
        int gap = 35;
        // ui.stroke(255);
        float linelength = y+distance+7;
        for(int i = 0; i <9; i++)
        {
            float lineheight = ui.map(data[i],0,50,linelength,y);
            ui.line(cox,linelength,cox + gap,lineheight);
            cox += gap;
            linelength = lineheight;
        }

    }


}