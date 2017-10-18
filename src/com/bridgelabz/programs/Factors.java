package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class Factors {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Enter the Number....");
		int number=scanner.nextInt();
		utility.primeFact(number);

	}

}
