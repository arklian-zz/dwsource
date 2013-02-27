/*========== Parser.java ==========

Goes through a file and performs all of the actions listed.
The file follows the following format:
     Every command is a single character that takes up a line
     Any command that requires arguments must have those arguments in the second line.
     The commands are as follows:
         l: add a line to the edge matrix - 
	    takes 6 arguemnts (x0, y0, z0, x1, y1, z1)
	 i: set the transform matrix to the identity matrix - 
	 s: create a scale matrix, 
	    then multiply the transform matrix by the scale matrix - 
	    takes 3 arguments (sx, sy, sz)
	 t: create a translation matrix, 
	    then multiply the transform matrix by the translation matrix - 
	    takes 3 arguments (tx, ty, tz)
	 x: create an x-axis rotation matrix,
	    then multiply the transform matrix by the rotation matrix -
	    takes 1 argument (theta)
	 y: create an y-axis rotation matrix,
	    then multiply the transform matrix by the rotation matrix -
	    takes 1 argument (theta)
	 z: create an z-axis rotation matrix,
	    then multiply the transform matrix by the rotation matrix -
	    takes 1 argument (theta)
	 a: apply the current transformation matrix to the 
	    edge matrix
	 g: draw the lines of the edge matrix to the Frame
	    save the Frame to a file -
	    takes 1 argument (file name)
	 q: end parsing

See the file script for an example of the file format


IMPORTANT MATH NOTE:
the trig functions in java.Math  use radian mesure, but us normal
humans use degrees, so the file will contain degrees for rotations,
be sure to conver those degrees to radians (Math.PI is the constant
for PI)


jdyrlandweaver
=========================*/

import java.io.*;
import java.util.*;
import java.awt.*;

public class Parser {
    
    /*===========================
      transform is the master transform Matrix
      em is the master EdgeMatrix
      f is the frame used for drawing and saving
      =========================*/
    private Matrix transform;
    private EdgeMatrix em;
    private Frame f;

    public Parser() {
	
	f = new Frame();
	transform = new Matrix();
	em = new EdgeMatrix();
	transform.ident();
    }


    /*========     public void parseFile() ==========
      Inputs:   BufferedReader in  
      Returns: 

      Goes through the input stream referred to by in,
      scans it for the commands listed above, and performs
      the required commands.
      
      03/08/12 19:20:55
      jdyrlandweaver
      ====================*/
    public void parseFile( BufferedReader in ) {
    }
}