package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<Circle> c = new ArrayList<Circle>();
    ArrayList<BarChart> r = new ArrayList<BarChart>();
    //ArrayList<Triangles> t = new ArrayList<Triangles>();
    ArrayList<Triangles> a = new ArrayList<Triangles>();
    ArrayList<Ovals> o = new ArrayList<Ovals>();
    ArrayList<PieChart> p = new ArrayList<PieChart>();
    // Triangles a1;
    // Triangles a2;
    // Triangles a3;
    // Triangles a4;
    // Triangles a5;
    // Triangles a6;
    // Triangles a7;


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
        //println(dist(10, 10, 11, 11));
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

        for(int i = 0; i < 5; i++)
        {
            Triangles trig = new Triangles(200 - (i*20), 690, 240+(i*5), 690, 220-(i*3), 675-(i*20), 255, 255, 255,this);
            a.add(trig);
        }


        //o1 = new Ovals(width - 100, height - 20, 130, 15, this);
        for(int i=0; i<7; i++)
        {
            float gap = 12.3f;
            if(i % 2 == 0)
            {
                Ovals oval = new Ovals(width - 100, height - 20 - (i*gap), 120 , 20, 0, 127,160 , this);
                o.add(oval);
            }
            else
            {
                Ovals oval = new Ovals(width - 100, height - 20 - (i*gap), 120 , 20, 66,244,104 , this);
                o.add(oval);

            }
        }

        PieChart piece1 = new PieChart(width - 400 + 2, height - 70 + 2, 90, 0, radians(100), 255, 102, 255,this);
        p.add(piece1);
        PieChart piece2 = new PieChart(width - 400 - 2, height - 70, 90, radians(120), radians(220), 178,102,255,this);
        p.add(piece2);
        PieChart piece3 = new PieChart(width- 400 + 1, height - 70 -3, 90, radians(240), radians(340), 102,255,178,this);
        p.add(piece3);
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

        for(Triangles trig: a)
        {
            trig.render();
        }

        for(Ovals oval: o)
        {
            oval.render();
        }

        for(PieChart pieces: p)
        {
            pieces.render();
        }

        //o1.render();

        // a5.render();
        // a4.render();
        // a3.render();
        // a2.render();
        // a1.render();

        // if (checkKey(LEFT))
        // {
        //     System.out.println("Left arrow key pressed");
        // }
    }

}

