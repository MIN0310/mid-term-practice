package com.min;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {

		Random random = new Random();
		int answer = random.nextInt(100 + 1);
		System.out.println(answer);

		System.out.print("Please guess a number from 1 to 100 : ");
		Scanner scanner = new Scanner(System.in);

		int max = 100;
		int min = 1;

		while (true) {
			int guess = scanner.nextInt();
			if (guess == answer) {
				System.out.println("Bingo!!!");
				break;
			} else {

				if (guess >= min && guess <= answer) {
					System.out.println("The number is from " + guess + "to " + max);
					System.out.print("Please guess a number from " + guess + "to " + max + ": ");
					min = guess;

				}

			}

			if (guess <= max && guess >= answer) {
				System.out.println("The number is from " + min + "to " + guess);
				System.out.print("Please guess a number from " + min + "to " + guess + ": ");
				max = guess;
			}

		}

	}

}
