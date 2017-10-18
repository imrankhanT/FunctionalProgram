package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class flipCoin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number of time to Flip The Coin");
		int numberOfFlip=scanner.nextInt();
		utility.flipCoin(numberOfFlip);
		scanner.close();
	}

}
