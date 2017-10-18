package com.bridgelabz.programs;

import com.bridgelabz.utility.utility;

public class Gambler {

	public static void main(String[] args) {
		int stake=Integer.parseInt(args[0]);
		int goal=Integer.parseInt(args[1]);
		int trail=Integer.parseInt(args[2]);
		utility.gambler(stake,goal,trail);
	}

}
