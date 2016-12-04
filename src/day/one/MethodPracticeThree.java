package day.one;

import java.util.ArrayList;

public class MethodPracticeThree {

	public static void main(String[] args) {

		System.out.println(getAllOddNumber(20));

	}

	/**
	 * write a method that take a number input and return the list of all odd
	 * number string from 0 to given number
	 */

	public static ArrayList<Integer> getAllOddNumber(int number) {

		ArrayList<Integer> numberList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {

				numberList.add(i);

			}
		}

		return numberList;

	}

}
