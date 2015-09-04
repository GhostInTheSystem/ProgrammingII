import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;
class Chapter2 {
	public static void main(String[] args) {


		/* //E2.6
		String str1 = "Hello World";
		str1 = str1.replace('o', 'e');
		str1 = str1.replaceFirst("e", "o");
		System.out.println(str1);
		*/
		
		/*//E2.8
		Color clr1 = new Color(200, 5, 5);
		clr1.brighter();
		System.out.println("red value is: " + clr1.getRed() + "\n" + "Green Value is: " + 				clr1.getGreen() + "\n" + "Blue Value is: " + clr1.getBlue());
		*/

		/* // E2.10
		Color clr1 = new Color(200, 5, 5);
		clr1.();
		System.out.println("red value is: " + clr1.getRed() + "\n" + "Green Value is: " + 				clr1.getGreen() + "\n" + "Blue Value is: " + clr1.getBlue());
		*/

		/*//E2.11
		Random rand = new Random();
		int rand1 = rand.nextInt(6);
		System.out.println(rand1);
		*/

		/* //E2.12
		Random rand = new Random();
		float rand1 = rand.nextFloat();
		rand1 *= (19.95 - 10.00 + 10.00);
		System.out.println(rand1);
		*/

		/* //E2.14
		Day day1 = new Day();
		Day day2 = new Day();
		day1 = day1.addDays(10);
		System.out.println(day1.daysFrom(day2));
		System.out.println(10);
		*/

		/*//E2.15
		Picture pic1 = new Picture();
		pic1.load("/users/jeff/Documents/Programming2/Chapter2/Tanker/queen-mary.png");
		int width = pic1.getWidth();
		int height = pic1.getHeight();
		pic1.scale((width/2), (height/2));
		*/

		/*//E2.16
		Picture pic1 = new Picture();
		pic1.load("/users/jeff/Documents/Programming2/Chapter2/Tanker/queen-mary.png");
		int width = pic1.getWidth();
		int height = pic1.getHeight();
		pic1.scale((width * 2), (height * 2));
		*/

		/*//P2.5
		Random rand = new Random();
		int[] lotteryNumbers = new int[6];
		for(int i = 0; i <= 5; i++){
			lotteryNumbers[i] = (rand.nextInt(49) + 1);
		}
		System.out.println("Play this combination:");
		for(int i = 0; i <= 5; i++){
			System.out.println(lotteryNumbers[i]);
		}
		System.out.println("It'll make you rich!");
		*/
	}
}
