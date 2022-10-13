// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        int xCoord = 100;
        int yCoord = 100;
        int width = 150;
        int height = 150;
        int diff = 50;

        // DRAW CUBE
        g.drawRect(xCoord,yCoord,width,height);
        g.drawRect(xCoord+diff,yCoord+diff,width,height);

        // Top Left
        g.drawLine(xCoord,yCoord, xCoord+diff, yCoord+diff);

        // Top Right
        g.drawLine(xCoord+width,yCoord, xCoord+diff+width, yCoord+diff);

        // Bottom Left
        g.drawLine(xCoord,yCoord+height, xCoord+diff, yCoord+diff+height);

        // Bottom Right
        g.drawLine(xCoord+width,yCoord+width, xCoord+diff+width, yCoord+diff+width);


        // DRAW SPHERE



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS



        // DRAW PACMEN FLOWER



    }

}


