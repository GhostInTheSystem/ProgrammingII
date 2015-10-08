import java.util.Scanner;
import java.lang.Math;

class Chapter4CodeChallenge{
	public static void main(String[] args) {

		int amountOfOnes = 0;
		int amountOfQuarters = 0;
		int amountOfDimes = 0;
		int amountOfNickels = 0;
		int amountOfPennies = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input amount due");
		int amountDue = sc.nextInt();

		System.out.println("Please input amount given");
		int amountGiven = sc.nextInt();

		int amountToReturnCalc = amountGiven - amountDue;
		
		if(amountToReturnCalc >= 100){
			int amountToSubtract = amountToReturnCalc % 100;

			amountOfOnes = amountToReturnCalc - amountToSubtract;
			amountToReturnCalc -= amountOfOnes;
			amountOfOnes /= 100;

		} 

		if(amountToReturnCalc >= 25){
			int amountToSubtract = amountToReturnCalc % 25;

			amountOfQuarters = amountToReturnCalc - amountToSubtract;
			amountToReturnCalc -= amountOfQuarters;
			amountOfQuarters /= 25;

		}

		if(amountToReturnCalc >= 10){
			int amountToSubtract = amountToReturnCalc % 10;

			amountOfDimes = amountToReturnCalc - amountToSubtract;
			amountToReturnCalc -= amountOfDimes;
			amountOfDimes /= 10;

		}

		if(amountToReturnCalc >= 5){
			int amountToSubtract = amountToReturnCalc % 5;

			amountOfNickels = amountToReturnCalc - amountToSubtract;
			amountToReturnCalc -= amountOfNickels;
			amountOfNickels /= 5;

		}

		if(amountToReturnCalc >= 1){
			amountOfPennies = amountToReturnCalc;
		}

		System.out.println("Amount of ones to return: " + amountOfOnes + "\nAmount of quarters to return: " + amountOfQuarters + "\nAmount of dimes to return: " + amountOfDimes + "\nAmount of nickels to return: " + amountOfNickels + "\nAmount of pennies to return: " + amountOfPennies);

	}
}
