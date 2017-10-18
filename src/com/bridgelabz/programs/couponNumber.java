package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class couponNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Coupon numbers.........");
		int numberOfCoupon=scanner.nextInt();
		System.out.println("Total Random number to have Distinct Number....."+utility.PrintDistinctCoupon(numberOfCoupon));
	}

}
