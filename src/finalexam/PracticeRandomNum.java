package finalexam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeRandomNum {

	public static void main(String[] args) {
		/*
		  Generate 500 random numbers and print the nth smallest number in a programming language of your choice. 
		  (Ask user for the Nth smallest number)
		*/
		Random rnum = new Random();
		int[] randomNumbers = new int[500];
		
//		Generate 500 random numbers and store them in the 'randomNumbers' array
		for(int counter = 0; counter < randomNumbers.length; counter++) {
			randomNumbers[counter] = rnum.nextInt(500);
		}
//			Ask user for nth smallest number
			System.out.println("Give me a number");
			Scanner ui = new Scanner(System.in);
			int input = ui.nextInt();
			
//			Sort array in ascending order
			Arrays.sort(randomNumbers);
			
//			Print the nth smallest number
			int nthSmallest = randomNumbers[input - 1];
			System.out.println("Generated random numbers:");
			for(int number :randomNumbers ) {
				System.out.print(number + " ");
			}
			
			System.out.println("\n" + input + "th smallest number: " + nthSmallest );
		}

	

}
