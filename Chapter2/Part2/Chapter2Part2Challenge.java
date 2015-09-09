import javax.swing.*;
import java.awt.Rectangle;

class Chapter2Part2Challenge{
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		RectangleComponent rect = new RectangleComponent();

		//frame.add(rect);

		rect.makeRect(10, 10, 20, 20);
		

		//rect.translateRect(100, 100);
		//frame.add(rect);
		System.out.println(rect.getX());
		//frame.add(rect);

		

		frame.setVisible(true);




	}
}
