package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class sumOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array......");
		int number = scanner.nextInt();
		int a[] = new int[number];

		System.out.println("Enter the Array Elements........");
		for (int i = 0; i < number; i++)
			a[i] = scanner.nextInt();

		utility.sumOfThree(number,a);
	}

}
