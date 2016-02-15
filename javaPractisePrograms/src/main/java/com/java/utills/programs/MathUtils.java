package com.java.utills.programs;

public class MathUtils {

	public static void swapNumbersWithoutTemp(int a, int b) {

		System.out.println("Values of a and b before swaping is :" + a + " , " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Values of a and b after swaping is :" + a + " , " + b);

	}

	public static void swapNumbersUsingTemp(int a, int b) {

		System.out.println("Values of a and b before swaping is :" + a + " , " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("Values of a and b after swaping is :" + a + " , " + b);

	}

	public static boolean checkPrime(int a) {

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
			}
			return true;

		}

	}


