package com.bridgelabz.programs;

import java.util.Scanner;

public class printUser {
static String name="<<UserName>>";
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the UserName........");
		String userName=scanner.next();

		String str1="";
		name=name.replaceAll("name ",userName);

		if(userName.length()<=3){
		System.out.println("Hello "+name+" How are you ?");
		}
	}

}
