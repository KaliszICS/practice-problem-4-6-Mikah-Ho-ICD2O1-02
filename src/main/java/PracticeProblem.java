/**
 * File: Lesson 4.6 - Data type checking
 * Author: Mikah Ho
 * Date Created: April 15, 2026
 * Date Last Modified: April 17, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(intChecker());
		System.out.println(doubleChecker());
		System.out.println(booleanChecker());
		System.out.println(multipleIntChecker());

	}

	//q1
	public static int intChecker() {

		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer: ");

		while (!input.hasNextInt()) {

			input.nextLine();
			System.out.print("Input an integer: ");
		}

		int num = input.nextInt();

		return num;

	}

	//q2
	public static double doubleChecker() {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");

		while (!input.hasNextDouble()) {

			input.nextLine();
			System.out.print("Input a number: ");
		}

		double num = input.nextDouble();

		return num;

	}

	//q3
	public static boolean booleanChecker() {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a boolean: ");

		while (!input.hasNextBoolean()) {

			input.nextLine();
			System.out.print("Input a boolean: ");
		}

		boolean bool = input.nextBoolean();

		return bool;

	}

	//q4
	public static boolean multipleIntChecker() {

		Scanner input = new Scanner(System.in);

		int count = 0;

		while (count < 4) {

			System.out.print("Input an integer: ");
			
			if (input.hasNextInt()) {

				count++;

			}

			input.nextLine();

		}

		return true;

	}

}
