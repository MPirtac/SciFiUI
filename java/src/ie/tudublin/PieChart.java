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
  PApplet ui;
  
  public PieChart(float w, float h, float diameter, float start, float end, float r, float g, float b,PApplet ui)
  {
    this.w = w;
    this.h = h;
    this.diameter = diameter;
    this.start = start;
    this.end = end;
    this.r = r;
    this.g = g;
    this.b = b;
    this.ui = ui;
  }

  public void render()
  {
    ui.stroke(0);
    ui.fill(r,g,b);
    ui.arc(w,h,diameter,diameter,start,end);
  }
}