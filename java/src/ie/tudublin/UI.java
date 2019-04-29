package ie.tudublin;

import java.util.ArrayList;
import java.util.List;

import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;
import processing.core.PImage;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet {
    ArrayList<Circle> c = new ArrayList<Circle>();
    ArrayList<BarChart> r = new ArrayList<BarChart>();
    ArrayList<Triangles> a = new ArrayList<Triangles>();
    ArrayList<Ovals> o = new ArrayList<Ovals>();
    ArrayList<PieChart> p = new ArrayList<PieChart>();
    ArrayList<CoBodyPart> part = new ArrayList<CoBodyPart>();
    ArrayList<Random> text = new ArrayList<Random>();
    // Body Image
    PImage img;
    // Parts of the body Images
    PImage p1, p2, p3, p4, p5;

    // ArtificialID d;
    ArrayList<ArtificialID> id = new ArrayList<ArtificialID>();
    // ArrayList<Graph> g = new ArrayList<Graph>();
    Graph g;

    BodyBackground framework;

    // sine wave for the heart beat
    float s1 = 20.0f;
    float s2 = 1f;
    float s3 = 6.0f;
    float s4 = 7.0f;
    float t = 1.0f;
    float step = 1;

    // heart beat
    AudioPlayer heartbeat;
    Minim minim;
    public static int sample = 64100;
    public static int resolution = 16;
    public static int frame = 1024;
    AudioInput ai;
    // heart button
    Button heart;

    // Radar
    Radar radar;
    // Random text1,text2,text3,text4,text5,text6,text7;
    // Triangles a1;
    // Triangles a2;
    // Triangles a3;
    // Triangles a4;
    // Triangles a5;
    // Triangles a6;
    // Triangles a7;
    // MovingCircle mc;
    // Circle a;
    // x + something will move to right | width
    // x - something will move to left
    // y - something will move up | height
    // y + something will move down

    // boolean[] keys = new boolean[1024];

    // public void keyPressed()
    // {
    // keys[keyCode] = true;
    // }

    // public void keyReleased()
    // {
    // keys[keyCode] = true;
    // }

    // public boolean checkKey(int c)
    // {
    // return keys[c] || keys [Character.toUpperCase(c)];
    // }

    public void settings() {
        // size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen();
        // println(dist(10, 10, 11, 11));
    }

    public void setup() {
        // mc = new MovingCircle(this, width / 2, height / 2, 50);
        // a = new Circle(width/2, height - 50, 60, this);
        for (int i = 0; i < 3; i++) {
            int text = (int) random(0, 100);
            Circle circle = new Circle(520 + (i * 70), height - 50, 50, text, 1, this);
            c.add(circle);
        }

        for (int j = 0; j < 6; j++) {
            float height = (float) random(-100);
            BarChart barChart = new BarChart((width - 1000) + (j * 25), 690, 20, height, j + 1, 275, 575, this);
            r.add(barChart);
        }

        for (int i = 0; i < 5; i++) {
            Triangles trig = new Triangles(200 - (i * 20), 690, 240 + (i * 5), 690, 220 - (i * 3), 675 - (i * 20), 255,
                    255, 255, 20 + (i * 20), 145, 580, this);
            a.add(trig);
        }

        // o1 = new Ovals(width - 100, height - 20, 130, 15, this);
        for (int i = 0; i < 7; i++) {
            float gap = 12.3f;
            if (i % 2 == 0) {
                Ovals oval = new Ovals(width - 100, height - 20 - (i * gap), 120, 20, 0, 127, 160, "Healthy", this);
                o.add(oval);
            } else {
                Ovals oval = new Ovals(width - 100, height - 20 - (i * gap), 120, 20, 66, 244, 104, "Not Healthy",
                        this);
                o.add(oval);

            }
        }

        PieChart piece1 = new PieChart(width - 400 + 37, height - 70 + 5, 90, 0, radians(100), 255, 102, 255, "3", 925,
                682, this);
        p.add(piece1);
        PieChart piece2 = new PieChart(width - 400 + 29, height - 70 + 2, 90, radians(120), radians(220), 178, 102, 255,
                "1", 878, 660, this);
        p.add(piece2);
        PieChart piece3 = new PieChart(width - 400 + 35, height - 70 - 5, 90, radians(240), radians(340), 102, 255, 178,
                "2", 917, 627, this);
        p.add(piece3);

        // Body Image
        img = loadImage("b1.jpg");
        // Images for body parts
        p1 = loadImage("heart.jpg");
        p2 = loadImage("stomach.jpg");
        p3 = loadImage("liver.jpg");
        p4 = loadImage("leftkidney.jpg");
        p5 = loadImage("rightkidney.jpg");

        // Artificial ID
        float x = 0;
        while (x < 360) {
            ArtificialID c1 = new ArtificialID(sin(radians(x)), cos(radians(x)), this);
            id.add(c1);
            x += 10;
        }

        // Graph
        g = new Graph(width - 350, height / 10, 200, this);

        // Load the coordinates of each body part
        loadData();

        // Body Background
        // framework = new BodyBackground(450, 280, this);
        framework = new BodyBackground(598, 320, PI + 1.2f, PI / 6, PI + 1.6f, PI / 4, PI + 0.7f, PI / 8, this);

        // heart beat
        minim = new Minim(this);
        heartbeat = minim.loadFile("heartbeat.mp3");
        // heartbeat.play();
        ai = minim.getLineIn(minim.MONO, frame, sample, resolution);

        // button heart
        heart = new Button(588, 183, 27, 30, this);

        // radar
        radar = new Radar(width - 1150, 400, 200,this);

        // Random Text
        loadrandomInfo();
    }

    public void draw() {
        background(0);
        image(img, width / 3, height / 10, 360, 500);
        // image(img,mouseX,mouseY, 360,500);
        // b.render();
        // mc.update();
        // mc.render();
        for (Circle circle : c) {
            circle.render();
        }

        for (BarChart barChart : r) {
            barChart.render();
        }

        for (Triangles trig : a) {
            trig.render();
        }

        for (Ovals oval : o) {
            oval.render();
        }

        for (PieChart pieces : p) {
            pieces.render();
        }

        for (ArtificialID c1 : id) {
            c1.render();
        }

        g.render();

        // print data
        // printData();

        for (int i = 0; i < part.size(); i++) {
            part.get(i).hoverover(mouseX, mouseY);
        }

        for (int i = 0; i < part.size(); i++) {
            drawData();
        }

        // draw random text
        drawrandomInfo();

        // Body Background
        framework.render();
        // sine wave
        waves();
        // heart button
        heart.render();
        println(mouseX, mouseY);
        // radar
        // radar.render();
        // radar.updateRadar();
        // outline.gridLines();
        // d.render();
        // float x = random(width);
        // float y = random(height);

        // o1.render();

        // a5.render();
        // a4.render();
        // a3.render();
        // a2.render();
        // a1.render();

        // if (checkKey(LEFT))
        // {
        // System.out.println("Left arrow key pressed");
        // }

        for (int i = 0; i < ai.bufferSize(); i++) {
            if (mousePressed) {
                if (key != 'p') {
                    stroke(255, 0, 0);
                    line(width, 333, i, 333 + heartbeat.left.get(i) * 333);
                }
            }
        }

        radar.render();
        radar.updateRadar();

    }

    // Load Coordinates from the csv file
    public void loadData() {
        Table table = loadTable("organs.csv", "header");
        for (TableRow row : table.rows()) {
            CoBodyPart fragment = new CoBodyPart(row);
            part.add(fragment);
        }
    }

    public void loadrandomInfo() {
        Table table = loadTable("randomtext.csv", "header");
        for (TableRow row : table.rows()) {
            Random ran = new Random(row);
            text.add(ran);
        }
    }

    // public void printData()
    // {
    // for(CoBodyPart p: part)
    // System.out.println(p);
    // }

    // DrawData
    public void drawData() {
        for (CoBodyPart fragment : part) {
            noStroke();
            noFill();
            ellipse(fragment.getCoordX(), fragment.getCoordY(), 20, 20);
            if (fragment.hover) {
                strokeWeight(4);
                stroke(77, 255, 166);
                rect(fragment.getCoordX() - 240, fragment.getCoordY() - 50, 106, 106, 10);
                if (fragment.getCoordX() == 612) {
                    tint(255, 0, 0, 100);
                    image(p1, fragment.getCoordX() - 237, fragment.getCoordY() - 46, 100, 100);
                } else if (fragment.getCoordX() == 614) {
                    tint(0, 0, 255, 100);
                    image(p2, fragment.getCoordX() - 237, fragment.getCoordY() - 46, 100, 100);
                } else if (fragment.getCoordX() == 617) {
                    tint(255, 0, 0, 100);
                    image(p5, fragment.getCoordX() - 237, fragment.getCoordY() - 46, 100, 100);
                } else if (fragment.getCoordX() == 581) {
                    tint(0, 0, 255, 100);
                    image(p3, fragment.getCoordX() - 237, fragment.getCoordY() - 46, 100, 100);
                } else if (fragment.getCoordX() == 587) {
                    tint(0, 0, 255, 100);
                    image(p4, fragment.getCoordX() - 237, fragment.getCoordY() - 46, 100, 100);
                }

                fill(255);
                textSize(10);
                textAlign(CENTER);
                text(fragment.getName(), fragment.getCoordX() - 200, fragment.getCoordY());
            }
            noFill();
            noStroke();
            noTint();
            strokeWeight(1);
        }
    }

    public void drawrandomInfo() {
        for (Random ran : text) {

            if (ran.getCx() == 931 && ran.getCy() == 307) {
                fill(255);
                ellipse(ran.getCx(), ran.getCy(), 12, 12);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 10, ran.getCy() - 5, 120, 70);

            } else if (ran.getCx() == 1110 && ran.getCy() == 307) {
                fill(255, 0, 0);
                ellipse(ran.getCx(), ran.getCy(), 12, 12);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 10, ran.getCy() - 5, 120, 70);

            } else if (ran.getCx() == 931 && ran.getCy() == 378) {
                fill(0, 255, 0);
                ellipse(ran.getCx(), ran.getCy(), 12, 12);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 10, ran.getCy() - 5, 120, 70);

            } else if (ran.getCx() == 1110 && ran.getCy() == 378) {
                fill(0, 0, 255);
                ellipse(ran.getCx(), ran.getCy(), 12, 12);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 10, ran.getCy() - 5, 120, 70);
            } else if (ran.getCx() == 931 && ran.getCy() == 449) {
                fill(191, 0, 255);
                ellipse(ran.getCx(), ran.getCy(), 12, 12);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 10, ran.getCy() - 5, 120, 70);

            } else if (ran.getCx() == 1110 && ran.getCy() == 449) {
                fill(0, 255, 191);
                ellipse(ran.getCx(), ran.getCy(), 12, 12);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 10, ran.getCy() - 5, 120, 70);

            } else if (ran.getCx() == 931 && ran.getCy() == 520) {
                fill(255, 255, 0);
                ellipse(ran.getCx(), ran.getCy(), 12, 12);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 10, ran.getCy() - 5, 120, 70);
            } else if (ran.getCx() == 720 && ran.getCy() == 617) {
                fill(178, 102, 255);
                ellipse(ran.getCx() + 15, ran.getCy(), 10, 10);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 30, ran.getCy() - 5, 100, 40);
            } else if (ran.getCx() == 720 && ran.getCy() == 652) {
                fill(102, 255, 178);
                ;
                ellipse(ran.getCx() + 15, ran.getCy(), 10, 10);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 30, ran.getCy() - 5, 100, 40);
            } else if (ran.getCx() == 720 && ran.getCy() == 687) {
                fill(255, 102, 255);
                ellipse(ran.getCx() + 15, ran.getCy(), 10, 10);
                textSize(5);
                textAlign(LEFT);
                text(ran.getInformation(), ran.getCx() + 30, ran.getCy() - 5, 100, 40);
            }
            noFill();
            noStroke();
        }
    }
    public float h;
    public float wave(float x) {
        if(key == 'i')
        {
        for (int i = 0; i < ai.bufferSize(); i++) {
            h= s2*pow(s3/(s3+pow(x, 4)), s3)*cos(s4*x-t)* heartbeat.left.get(i);
        }
        return h;
        }else{
        return s2*pow(s3/(s3+pow(x, 4)), s3)*cos(s4*x-t);
        }

    }

    public void waves()
    {
    
        stroke(255);
        float coordx = 0;
        float coordy = 113;
        for (float x = 10; x<width/5; x+=step)
        {
            float cx = map(x, 0, 100, -6, 2);    
            float cy = wave(cx);
            float y = map(cy, -3, 1, height/2, 30);
            line(coordx, coordy, x, y);

            coordx = x;
            coordy = y;
        }
        t = t + 0.11f;  
        s4 = s4 + (s1-s4)/200;
        }

    //To play heartbeat
    public void mousePressed()
    {
        if(mouseX > 588 && mouseX < 615 && mouseY>183 && mouseY<213)
        {
            heartbeat.play();
        }
    }
    //To stop the heartbeat 
    public void keyPressed()
    {
        if(key == 'p' && heartbeat.isPlaying() == true)
        {
            heartbeat.pause();
        }

    
    }
 
    
}



