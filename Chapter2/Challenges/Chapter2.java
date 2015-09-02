import java.awt.Color;
import javax.swing.JFrame;

class Chapter2 {
	public static void main(String[] args) {


		/* //E2.6
		String str1 = "Hello World";
		str1 = str1.replace('o', 'e');
		str1 = str1.replaceFirst("e", "o");
		System.out.println(str1);
		*/
		
		/* //E2.7
		StringBuilder strb1 = new StringBuilder("desserts");
		strb1.reverse();
		System.out.println(strb1);
		*/ 
		
		//E2.8
		Color clr1 = new Color(200, 5, 5);
		clr1.brighter();
		
		System.out.println("red value is: " + clr1.getRed() + "\n" + "Green Value is: " + 				clr1.getGreen() + "\n" + "Blue Value is: " + clr1.getBlue());
		/* E2.9
		Color clr1 = new Color(255, 0, 0);
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		frame.getContentPane().setBackground(clr1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		*/
	}
}
