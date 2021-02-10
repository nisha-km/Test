package assignment4;

import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {


		int children = 0;
		int adult = 0;
		int seniorCitizen = 0;
		int age[] = { 24,34,12,14,27,56,2,5,89 };
		for (int i = 0; i < age.length; i++) {

			if (age[i] < 18) {
				children++;

			} else if (age[i] >= 18 && age[i] <= 54) {
				adult++;

			} else if (age[i] >= 54) {
				seniorCitizen++;

			}

		}

		System.out.println(children);
		System.out.println(adult);
		System.out.println(seniorCitizen);

	}

}
