package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class leapYear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the LeapYear......");
		int year=scanner.nextInt();
		utility.leapYear(year);
	}

}
