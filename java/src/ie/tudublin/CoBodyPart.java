package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class CoBodyPart extends PApplet
{
    private float CoordX;
    private float CoordY;

    private String Name;
    PApplet ui;

    boolean hover = false;

    public CoBodyPart(TableRow row)
    {
        this.CoordX = row.getFloat("CoordX");
        this.CoordY = row.getFloat("CoordY");
        this.Name = row.getString("Name");
    }

    public String toString()
    {
        return CoordX + "\t" + CoordY + "\t" + Name;

    }

    public void hoverover(float cx, float cy)
    {
        float d = ui.dist(cx,cy,CoordX,CoordY);
        if(d< 10/2)
        {
            hover = true;
        }else{
            hover = false;
        }
    }
    
    /**
     * @return the coordX
     */
    public float getCoordX() {
        return CoordX;
    }

    /**
     * @param coordX the coordX to set
     */
    public void setCoordX(float coordX) {
        CoordX = coordX;
    }

    /**
     * @return the coordY
     */
    public float getCoordY() {
        return CoordY;
    }

    /**
     * @param coordY the coordY to set
     */
    public void setCoordY(float coordY) {
        CoordY = coordY;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @return the ui
     */
    public PApplet getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(PApplet ui) {
        this.ui = ui;
    }
}