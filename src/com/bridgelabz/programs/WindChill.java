package com.bridgelabz.programs;

import com.bridgelabz.utility.utility;

public class WindChill {

	public static void main(String[] args) {
		
		double temperature=Double.parseDouble(args[0]);
		double velocity=Double.parseDouble(args[1]);
		utility.windChill(temperature,velocity);
	}
}
