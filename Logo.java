import java.awt.*;
import java.applet.*;
public class Logo extends Applet
{
        public static void drawCircles(Graphics g)
        {
            Expo.setColor(g,206,197,118); 
            Expo.fillCircle(g,500,325,60); //yellow
            Expo.setColor(g,56,56,56);
            Expo.fillCircle(g,500,325,55); //gray
            Expo.setColor(g,206,197,118); 
            Expo.fillCircle(g,500,325,47); //yellow
            Expo.setColor(g,56,56,56);
            Expo.fillCircle(g,500,325,43); //gray
            Expo.setColor(g,206,197,118); 
            Expo.fillCircle(g,500,325,23); //yellow
            Expo.setColor(g,56,56,56);
            Expo.fillCircle(g,500,325,19); //gray
           }
        public static void drawLines(Graphics g)
        {
            Expo.setColor(g,206,197,118); 
            Expo.fillRectangle(g,558,315,700,335); //right mid bar
            Expo.fillRectangle(g,442,315,300,335); //left mid bar
            Expo.fillPolygon(g,700,315,725,325,700,335); //right mid tip
            Expo.fillPolygon(g,300,315,275,325,300,335); //left mid tip
            Expo.setColor(g,56,56,56);
            Expo.fillRectangle(g,558,320,690,330); //right mid bar
            Expo.fillRectangle(g,442,320,310,330); //left mid bar
            Expo.fillPolygon(g,690,320,715,325,690,330); //right mid tip
            Expo.fillPolygon(g,310,320,285,325,310,330); //left mid tip
            /**********************************************/
            Expo.setColor(g,206,197,118); 
            Expo.fillRectangle(g,550,280,625,300); //right upper bar
            Expo.fillRectangle(g,450,280,385,300); //left upper bar
            Expo.fillRectangle(g,540,280,625,288); //right upper bar
            Expo.fillRectangle(g,460,280,385,288); //left upper bar
            Expo.fillPolygon(g,625,280,650,290,625,300); //right upper tip
            Expo.fillPolygon(g,385,280,360,290,385,300); //left upper tip
            Expo.setColor(g,56,56,56);
            Expo.fillRectangle(g,550,295,625,290); //right upper bar
            Expo.fillRectangle(g,450,295,385,290); //left upper bar
            Expo.fillRectangle(g,545,295,625,285); //right upper bar
            Expo.fillRectangle(g,455,295,385,285); //left upper bar
            Expo.fillPolygon(g,625,285,645,290,625,295); //right upper tip
            Expo.fillPolygon(g,385,285,360,290,385,295); //left upper tip
            /*********************************************/
            Expo.setColor(g,206,197,118); 
            Expo.fillRectangle(g,550,350,625,370); //right lower bar
            Expo.fillRectangle(g,450,350,385,370); //left lower bar
            Expo.fillRectangle(g,540,365,625,370); //right lower bar
            Expo.fillRectangle(g,460,365,385,370); //left lower bar
            Expo.fillPolygon(g,625,350,650,360,625,370); //right lower tip
            Expo.fillPolygon(g,385,350,360,360,385,370); //left lower tip
            Expo.setColor(g,56,56,56);
            Expo.fillRectangle(g,550,355,625,365); //right lower bar
            Expo.fillRectangle(g,450,355,385,365); //left lower bar
            Expo.fillRectangle(g,545,355,625,360); //right lower bar
            Expo.fillRectangle(g,455,355,385,360); //left lower bar
            Expo.fillPolygon(g,625,355,645,360,625,365); //right lower tip
            Expo.fillPolygon(g,385,355,360,360,385,365); //left lower tip
            
        }
       }