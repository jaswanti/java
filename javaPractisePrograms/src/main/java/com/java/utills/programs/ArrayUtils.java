package com.java.utills.programs;

public class ArrayUtils {
	
	

	public static void countTotalArray(int a[]) {
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				System.out.println(min);
			}

		}
	}

	public static void getMinValueOfArray(int a[]) {
		int minvalue = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < minvalue) {
				minvalue = a[i];
				
 			}
		
		}
		System.out.println(minvalue);
		
	}
	

	public static void getMaxValueOfArray(int a[]) {
		int maxvalue = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > maxvalue) {
				maxvalue = a[i];
			}
			
		}
		System.out.println(maxvalue);

	}
}
