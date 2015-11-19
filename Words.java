import java.awt.*;
import java.applet.*;

public class Words extends Applet
{
        public static void drawTop(Graphics g)
        {
          Expo.setColor(g,206,197,118);  
          Expo.setFont(g,"Arial",Font.BOLD,36);
          Expo.drawString(g,"VAULT-TEC",400,260);
           }
        public static void drawBottom(Graphics g)
        {
          Expo.drawString(g,"INDUSTRIES",395,420);
        }
       }
