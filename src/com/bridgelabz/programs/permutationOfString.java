package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class permutationOfString {

	public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the String....");
		String str=scanner.nextLine();
		
		System.out.println("Itrative method..........");
		utility.permutationItrative(str,0,str.length()-1);
		System.out.println();
		
		System.out.println("Recursion methods are..........");
		utility.permutationRecursion(str,0,str.length()-1);
		scanner.close();
	}
}
