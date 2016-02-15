package com.bayamp.math.programs;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;

		System.out.println(c);
		addTwoNumbers(40, 34);
		addLongInt(50L, 90L);
		addFloatNumbs(67.8f, 98.0f);
		boolenTest(true);
	}

	public static void addTwoNumbers(int num1, int num2) {
		int num = num1 + num2;
		System.out.println(num);

	}

	public static void addLongInt(long a, long b) {
		long c = a + b;
		System.out.println(c);

	}

	public static void addFloatNumbs(float a, float b) {
		float c = a + b;
		System.out.println(c);

	}
    
	public static void boolenTest(Boolean a) {
		if (a) {
			System.out.println(a);
		}
	}
   
}
