import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  

   public Rectangle box;
   public Graphics2D g2;
   public int x, y, width, height;
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      g2 = (Graphics2D) g;

      g2.draw(box);
      // Construct a rectangle and draw it
      //g2.draw(box);
   }

   public void makeRect(int x1, int y1, int xWidth, int yHeight){

      x = x1;
      y = y1;
      width = xWidth;
      height = yHeight;

      box = new Rectangle(x, y, width, height);
   }

   public int getX(){
      return x;
   }

   public void translateRect(int x1, int y1){
      x = x1;
      y = y1;
      box = new Rectangle(x, y, width, height);

   }

}
