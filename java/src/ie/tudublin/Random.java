package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Random 
{
    private float Cx;
    private float Cy;
    private String Information;
    PApplet ui;


    public Random(TableRow row)
    {
        this.Cx = row.getFloat("Cx");
        this.Cy = row.getFloat("Cy");
        this.Information = row.getString("Information");
    }

    public String toString()
    {
        return Cx + "\t" + Cy + "\t" + Information;
    }

    /**
     * @return the cx
     */
    public float getCx() {
        return Cx;
    }

    /**
     * @param cx the cx to set
     */
    public void setCx(float cx) {
        Cx = cx;
    }

    /**
     * @return the cy
     */
    public float getCy() {
        return Cy;
    }

    /**
     * @param cy the cy to set
     */
    public void setCy(float cy) {
        Cy = cy;
    }

    /**
     * @return the information
     */
    public String getInformation() {
        return Information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(String information) {
        Information = information;
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