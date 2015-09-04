import java.io.*;
import java.util.Scanner;
class Tanker {
	public static void main(String[] args) {

		//gets name from the user
		System.out.println("Please type in your name");
		Scanner usrName = new Scanner(System.in);
		String userName = usrName.nextLine();
		
		//gets birth year from user
		System.out.println("please enter your birth year (YYYY)");
		Scanner yearSC = new Scanner(System.in);
		int y = yearSC.nextInt();
		
		//gets birth moneth from a user
		System.out.println("Please enter your birth month (M)");
		Scanner monthSC = new Scanner(System.in);
		int m = monthSC.nextInt();
		
		//gets birth day from user
		System.out.println("Please enter your birth day (D)");
		Scanner daySC = new Scanner(System.in);
		int d = daySC.nextInt();

		//create day object for birthday
		Day birthday = new Day(y, m, d);

		//ask user how many years he/she would like to live
		System.out.println("How many years would you like to live?");
		Scanner yrslivd = new Scanner(System.in);
		int yearsToLive = yrslivd.nextInt();
		int liveYears = (y + yearsToLive);
		Day deathDay = new Day(liveYears, m, d);

		//ask user how many ounces they drink in a day
		System.out.println("How many ounces do you drink in a day?");
		Scanner inputOunces = new Scanner(System.in);
		double ounces = inputOunces.nextDouble();

		//calculations of ounces
		double difference = deathDay.daysFrom(birthday);
		System.out.println(difference);
		double totalOunces = (difference * ounces);
		System.out.println(totalOunces);
		double totalGallons = (totalOunces / 128);
		System.out.println(totalGallons);
		double totalTankers = (totalGallons / 8000);

		//print the amount of tankers
		System.out.println("In your lifetime, " + userName + ", you will drink " + totalTankers + " tankers worth of liquid");

	}
}
