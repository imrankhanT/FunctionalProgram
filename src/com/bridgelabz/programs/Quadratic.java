package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class Quadratic {

	public static void main(String[] args) {
		double value1,value2,value3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of a b and c");
		value1=scanner.nextDouble();
		value2=scanner.nextDouble();
		value3=scanner.nextDouble();
		
		utility.quadratic(value1,value2,value3);
		scanner.close();
	}

}
