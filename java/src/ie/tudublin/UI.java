package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<Circle> c = new ArrayList<Circle>();
    ArrayList<BarChart> r = new ArrayList<BarChart>();

    //Button b;
    //MovingCircle mc;
    //Circle a;
    // x + something will move to right  | width 
    // x - something will move to left 
    // y - something will move up      |  height 
    // y +  something will move down 

    // boolean[] keys = new boolean[1024];

    // public void keyPressed()
    // {
    //     keys[keyCode] = true;
    // }
    
    // public void keyReleased()
    // {
    //     keys[keyCode] = true;
    // }

    // public boolean checkKey(int c)
    // {
    //     return keys[c] || keys [Character.toUpperCase(c)];
    // }
    

    public void settings()
    {
        //size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(); 
    }

    public void setup()
    {
        //b = new Button(this, 50, 50, 100, 50, "I am a button");
        //mc = new MovingCircle(this, width / 2, height / 2, 50);
        //a = new Circle(width/2, height - 50, 60, this);
        for(int i = 0; i < 3; i++)
        {
            int text = (int)random(0,100);
            Circle circle = new Circle(520+(i*70), height - 50, 50,text, 1, this);
            c.add(circle);
        }

        for(int j = 0; j < 6; j++)
        {
            float height = (float)random(-100); 
            BarChart barChart = new BarChart((width - 1000) +(j*25), 690, 20, height, j+1, this);
            r.add(barChart);
        }
    }

    public void draw()
    {
        background(0);
        //b.render();
        //mc.update();
        //mc.render();
        for(Circle circle: c)
        {
            circle.render();
        }
        
        for(BarChart barChart: r)
        {
            barChart.render();
        }

        // if (checkKey(LEFT))
        // {
        //     System.out.println("Left arrow key pressed");
        // }
    }
}

