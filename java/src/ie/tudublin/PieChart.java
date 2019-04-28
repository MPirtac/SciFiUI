package ie.tudublin;

import processing.core.PApplet;

public class PieChart
{
  private float diameter ;
  private float w;
  private float h;
  private float start;
  private float end;
  private float r,g,b;
  private String t;
  private float tx;
  private float ty;
  PApplet ui;
  
  public PieChart(float w, float h, float diameter, float start, float end, float r, float g, float b, String t, float tx, float ty, PApplet ui)
  {
    this.w = w;
    this.h = h;
    this.diameter = diameter;
    this.start = start;
    this.end = end;
    this.r = r;
    this.g = g;
    this.b = b;
    this.t = t;
    this.tx = tx;
    this.ty = ty;
    this.ui = ui;
  }

  public void render()
  {
    ui.stroke(0);
    ui.fill(r,g,b);
    ui.arc(w,h,diameter,diameter,start,end);
    ui.fill(0);
    ui.textSize(20);
    ui.text(t, tx, ty);
  }
}