package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.utility;

public class Array2D {
	public static void main(String[] args) {
		int rows=0,columns = 0;
		int choice;
		Scanner scanner=new Scanner(System.in);

		do {
			System.out.println("Enter your choice");
			System.out.println("1.Printing a Integer 2d Array......");
			System.out.println("2.Printing a Double 2d Array......");
			System.out.println("3.Printing a Boolean 2d Array......");
	        choice=scanner.nextInt();
	        
	        if(choice>0 && choice<=3) {
	        System.out.println("Enter the rows and columns.........");
	    	rows=scanner.nextInt();
	    	columns=scanner.nextInt();
	        }
	        
	        
	    	Integer[][] i1=new Integer[rows][columns];
	    	Double[][] d=new Double[rows][columns];
	    	Boolean[][] b=new Boolean[rows][columns];
		switch(choice) {
	         	
		case 1 :System.out.println("Enter the Integer Array Elements.......");
		        for(int i=0;i<rows;i++)
		        for(int j=0;j<columns;j++)
		        i1[i][j]=scanner.nextInt();
		    	utility.print2DArray(i1,rows,columns);
		        break;
		case 2:System.out.println("Enter the Double Array Elements.......");
			   for(int i=0;i<rows;i++)
			   for(int j=0;j<columns;j++)
			   d[i][j]=scanner.nextDouble();
			   utility.print2DArray(d,rows,columns);
			   break;
		case 3:System.out.println("Enter the Boolean Array Elements.......");
		       for(int i=0;i<rows;i++)
		       for(int j=0;j<columns;j++)
		       b[i][j]=scanner.nextBoolean();
		       utility.print2DArray(b,rows,columns);
		       break;
		 default:System.exit(0);
		}	
		} while(choice!=0);
		scanner.close();
	}
}
