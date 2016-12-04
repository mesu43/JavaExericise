package day.one;

import java.util.ArrayList;

public class MethodPracticeT {

	public static void main(String[] args) {

		System.out.println(getAllEvenNumber(40));
	}

	/**
	 * write a method that take a number input and return the list of all even
	 * number string from 0 to given number
	 */

	public static ArrayList<Integer> getAllEvenNumber(int number) {

		ArrayList<Integer> numberList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {
				numberList.add(i);

			}
		}

		return numberList;
	}

}
