// Lab07Bst.java
// The OOP Graphics Program
// This is the student, starting file for Lab 07B.
// This is an "Open-Ended" asignment.


import java.awt.*;
import java.applet.*;


public class Lab07Bst extends Applet
{
    public void paint(Graphics g)
    {
        //Vault-Tech logo
        Background.drawWall(g);
        Logo.drawCircles(g);
        Logo.drawLines(g);
        Words.drawTop(g);
        Words.drawBottom(g);
    }
}


