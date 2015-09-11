import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      for(int i = 0; i <= 360; i += 20){
         Line2D.Double ageLines = new Line2D.Double(30, (370 - i), 280, (370 - i));
         g2.draw(ageLines);
      }

      Line2D.Double yaxis = new Line2D.Double(30, 370, 30, 10);
      g2.draw(yaxis);

      Line2D.Double yaxis2 = new Line2D.Double(280, 370, 280, 10);
      g2.draw(yaxis2);

   }
}
