package javaBasics;

import java.util.Scanner;

public class OddEvenProgram {

	public static void main(String[] args) {

		// Take input from user
		Scanner sc = new Scanner(System.in);
		// Ask user to input number
		System.out.print("Enter your number:  ");
		int number = sc.nextInt();
		// Check given number is not a zero
		if (number != 0) {
			// Verify the number is ODD or EVEN
			if (number % 2 == 0) {
				System.out.println(number + "  is even number");
			} else {
				System.out.println(number + "  is odd number ");
			}
		} else {
			System.out.println("Please enter valid number.");
		}
		sc.close();

	}

}
