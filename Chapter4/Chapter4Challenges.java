import java.lang.Math;
import java.util.Scanner;

class Chapter4Challenges{
	public static void main(String[] args) {
		/**
			R4.1	
		*/
		/*
		final int NUMBER_OF_DAYS_PER_WEEK = 7;
		int daysUntilEndOfSemester;
		final double CENTIMETERS_IN_AN_INCH = 2.54;
		int tallestPersonHeightInCentimeters;
		*/

		/**
			R4.5
		*/

		/*
		double ssubZero;
		double vsubZero;
		double t;
		double g;
		double s = ssubZero + (vsubZero * t) + (.5(g * (t * t)));

		double a;
		double p;
		double mSubOne;
		double mSubTwo;
		double G = 4 * (Math.PI * Math.PI) * ( (Math.pow(a, 3)) / ((Math.pow(p, 2) * (mSubOne + mSubTwo))));

		double PV;
		double YRS;
		double INT;
		double FV = PV * Math.pow((1 + (INT / 200)), YRS); 

		double a;
		double b;
		double y;
		double c = Math.sqrt( (Math.pow(a, 2)) + (Math.pow(b, 2)) - (2 * a * b * Math.cos(y)));
		*/

		/**
			R4.12
		*/

		/*
		2 can be saved as an int. 2.0 can be saved as a float or a double. '2' can be saved as a char. "2" can be saved
		as a String and "2.0" can also be saved as a String
		*/

		/**
			R4.18
		*/

		/*
		double r1 = 2;
		double r2 = 4;
		double h1 = 5;
		double h2 = 7;
		double h3 = 2;

		double v = Math.PI * ((((r1 * r1) + (r1 * r2) + (r2 * r2)) * 3) / 3);

		System.out.println(v);
		*/

		/**
			E4.3
		*/

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number to see the square, cube, and fourth power of it.");
		double num = sc.nextDouble();

		double num2 = Math.pow(num, 2);
		double num3 = Math.pow(num, 3);
		double num4 = Math.pow(num, 4);

		System.out.println("The square is: " + num2 + "\nthe cube is: " + num3 + "\nThe fourth power is: " + num4);
		*/

		/**
			E4.8
		*/

		/*
		Scanner sc = new Scanner(System.in);

		System.out.println("Please type in length of side one");
		double s1 = sc.nextDouble();
		System.out.println("Please type in the length of side 2");
		double s2 = sc.nextDouble();

		double area = s1 * s2;
		double perimeter = (s1 * 2) * (s2 * 2);
		double diagonal = Math.sqrt((s1 * s1) + (s2 * s2));

		System.out.println("The are of the rectangle is: " + area + "\nThe perimeter of the rectangle is: " + perimeter + "\nThe diagonal of the rectangle is: " + diagonal);
		*/

		/**
			E4.12
		*/

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in a number between 1,000 and 999,999");
		String num = sc.nextLine();

		num = num.replaceAll( "," , "");

		System.out.println(num);
		*/

		/**
			E4.15
		*/

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in a number");
		String num = sc.nextLine();

		int numLength = num.length();

		int i = 0;
		while(i < numLength){
			System.out.print(num.substring(i, i + 1) + " ");
			i++;
		}
		*/

		/**
			E4.18
		*/

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the number of the month");
		int month = sc.nextInt();

		String months = "January  ,February ,March    ,April    ,May      ,June     ,July     ,August   ,September,October  ,November ,December ";

		System.out.println(months.substring( ((10 * month) - 10), (10 * month - 1)) );
		
		*/


	}
}
