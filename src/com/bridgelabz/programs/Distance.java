package com.bridgelabz.programs;

public class Distance {

	public static void main(String[] args) {
		double value1=Double.parseDouble(args[0]);
        double value2=Double.parseDouble(args[1]);
        
        double result=Math.sqrt(value1*value1+value2*value2);
        
        System.out.println("The Distance between x and y is origin x and y "+result);
	}

}
