package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<Circle> c = new ArrayList<Circle>();
    ArrayList<BarChart> r = new ArrayList<BarChart>();
    //ArrayList<Triangles> t = new ArrayList<Triangles>();
    Triangles a1;
    Triangles a2;
    Triangles a3;
    Triangles a4;
    Triangles a5;
    Triangles a6;
    Triangles a7;


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

        a1 = new Triangles(200, 690, 240, 690, 220, 675, this);
        a2 = new Triangles(180, 690, 245, 690, 217, 655, this);
        a3 = new Triangles(160, 690, 250, 690, 214, 635, this);
        a4 = new Triangles(140, 690, 255, 690, 211, 615, this);
        a5 = new Triangles(120, 690, 260, 690, 208, 595, this);
        //a6 = new Triangles(150, 690, 258, 690, 225, 625, this);
        //a7 = new Triangles(140, 690, 262, 690, 226, 615, this);
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

        a5.render();
        a4.render();
        a3.render();
        a2.render();
        a1.render();

        // if (checkKey(LEFT))
        // {
        //     System.out.println("Left arrow key pressed");
        // }
    }
}

