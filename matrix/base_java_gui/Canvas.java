import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;

public class Canvas extends JPanel {

    public static final int XRES = 500;
    public static final int YRES = 500;

    private PointMatrix edges;
    private BufferedImage bi;
    private PointMatrix tmpline;
    private Color c;
    boolean drawing=false;    
    
    public Canvas() {
	edges = new PointMatrix();
	tmpline = new PointMatrix(2);	
	c = Color.blue;
    }
    

    /*======== public void setDrawing() ==========
      Inputs:  int x0
               int y0
	       int x1
	       int y1 
      Returns: 
      sets drawing to true and adds a line to the tmpLine PointMatrix

      ====================*/
    public void setDrawing(int x0, int y0, int x1, int y1) {
    }

    
    public void stopDrawing() {
	drawing=false;
    }
  
    public BufferedImage getBufferedImage() {
	return bi;
    }

    public Dimension getPreferredSize() {
	return new Dimension(XRES, YRES);
    }


    /*======== public void addLine() ==========
      Inputs:  int x0
               int y0
	       int z0
	       int x1
	       int y1
	       int z1 
      Returns: 
      Adds the specified line to the edges PointMatrix
      ====================*/
    public void addLine(int x0, int y0, int z0, int x1, int y1, int z1) {

	//this allows the gui to repaint
	//leave this as the last line
	this.update(this.getGraphics());
    }


    /*======== public void addPoint() ==========
      Inputs:  int x0
         int y0
         int z0 
      Returns: 
      add a single point to the edges PointMatrix
      ====================*/
    public void addPoint(int x0, int y0, int z0) {


	//this allows the gui to repaint
	//leave this as the last line
	this.update(this.getGraphics());
    }


    public void clearTmp() {
	tmpline.clear();
    }

    /*======== public void clearPoints()) ==========
      Inputs:   
      Returns: 

      Clear the edge matrix

      03/05/12 11:17:10
      jdyrlandweaver
      ====================*/
    public void clearPoints() {
	edges.clear();
	this.update(this.getGraphics());
    }

    /*======== public void paintComponent() ==========
      Inputs:  Graphics g 
      Returns: 
      draws the edges stored in tmpLine or edges to the canvas
      you must update this to work with matricies instead of an 
      array of Line objects   
      ====================*/
    public void paintComponent(Graphics g) {

	super.paintComponent(g);
	bi = (BufferedImage)this.createImage(XRES, YRES);
	Graphics2D g2 = bi.createGraphics();

	if (drawing) {
	    g2.setColor(c.red);
	    //draw tmpline, the java drawLine call is as follows:
	    //g2.drawLine( x0, y0, x1, y1);
	}
	
	g2.setColor(c);
	
	//use java's drawline to draw the lines in the edges PointMatrix

	((Graphics2D)g).drawImage(bi,null,0,0);
    }
}
