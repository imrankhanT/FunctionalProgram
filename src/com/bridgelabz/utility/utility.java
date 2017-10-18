package com.bridgelabz.utility;

import java.io.PrintWriter;

public class utility {
/**
 * @param numberOfFlip
 * Logic to find the percentage of heads and tails
 */
public static void flipCoin(int numberOfFlip) {
	int heads=0,n,tails=0;
	for(int i=0;i<=numberOfFlip;i++){
		 if (Math.random() < 0.5)
		heads++;
		else tails++;
		}

		heads=heads*100/numberOfFlip;
		tails=tails*100/numberOfFlip;

		System.out.println("The Percentage of heads........"+heads+"%");
		System.out.println("The Percentage of tails........"+tails+"%");
}

/**
 * @param year
 * logic to find the leap year
 */
public static void leapYear(int year) {
	String s=String.valueOf(year);
	if(s.length()==4){
	if((year%4 == 0&& year%100!= 0) || (year%400== 0))
	   System.out.printf("the given year  is a leap year."+year);
	   else
	   System.out.printf("the given year is not a leap year."+year);
	}
	
}

/**
 * @param number
 * logic to find the power of two
 */
public static void powerOfTwo(int number) {
	int i;

	if(number<=31){
	for(i=0;i<=number;i++){
	int num=(int)(Math.pow(2,i));

	if(num%4==0)
	System.out.println("LeapY Year--->"+num);
	else System.out.println("Not Leap Year----->"+num);

	//System.out.println(n);
	}

	}else System.out.println("Integer Range is overflow....");
}

/**
 * @param number
 * logic to find the harmonic series
 */
public static void hormonicSeries(int number) {
	double result=0;

	for(int i=1;i<=number;i++){
	if(i!=number)
	System.out.print("1/"+i+"+");
	else System.out.print("1/"+i);
	result=result+(double)(1/i);
	}
	System.out.print("=");
	System.out.print(result);
}

/**
 * @param n
 * logic to find the prime factor
 */
public static void primeFact(int n){
while(n%2==0){
System.out.print(2+" ");
n=n/2;
}

for(int i=3;i<=Math.sqrt(n);i+=2){
while(n%i==0){
System.out.print(i+" ");
n=n/i;
}
}
if(n>2)
System.out.print(n);
System.out.println();
}

/**
 * @param stake
 * @param goal
 * @param trail
 * Logic to find the percentage of won and loss (Gambler
 */
public static void gambler(int stake, int goal, int trail) {
	int wins=0,bets=0,i;

	for(i=0;i<trail;i++){
	int cash=stake;

	while(cash>0 && cash<goal){
	bets++;
	 if(Math.random()<0.5)
	cash++; //wins $1
	else cash--; //loss $1
	}
	if(cash==goal) //cash is equal to Goal i.e wins
	wins++;
	}
	System.out.println("Number of Percentage won.........."+100*wins/trail);
	System.out.println("Average Number of bets......"+1*bets/trail);


}
static int count=0,distinct=0;
/**
 * @param numberOfCoupon
 * @return
 * program to find the distict coupon number
 */
public static int PrintDistinctCoupon(int numberOfCoupon) {
	boolean[] value=new boolean[numberOfCoupon];

	while(distinct<numberOfCoupon){
	int val=getCoupon(numberOfCoupon);
	count++;

	if(!value[val]){
	distinct++;
	value[val]=true;
	               }
	}
	return count;
	}

private static int getCoupon(int numberOfCoupon)
{return (int)(Math.random()*numberOfCoupon);}

/**
 * @param value1
 * @param value2
 * @param value3
 * to find the quadratic equation
 */
public static void quadratic(double value1, double value2, double value3) {
	double root1,root2;
	double delta=(value2*value2-4*value1*value3);
	System.out.println("---------->"+delta);

if(delta > 0)
{

    System.out.println("Roots are real and unequal");
    root1 = ( - value2 + Math.sqrt(delta))/(2*value1);
    root2 = (-value2 - Math.sqrt(delta))/(2*value1);
    System.out.println("First root is:"+root1);
    System.out.println("Second root is:"+root2);
}

else if(delta == 0)
{
	System.out.println("Roots are real and equal");
    root1 = (-value2+Math.sqrt(delta))/(2*value1);
    System.out.println("Root:"+root1);
}
else
{
    System.out.println("Roots are imaginary");
}
}

/**
 * @param number
 * @param a
 * program to find the sum of three number which is equal to zero
 */
public static void sumOfThree(int number,int a[]) {
boolean found=false;
	for (int i = 0; i < a.length - 2; i++) {
		for (int j = 0; j < a.length - 1; j++) {
			for (int k = 0; k < a.length; k++) {
				if (i != j && j != k) {
					if ((a[i] + a[j] + a[k] == 0)) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						found = true;
					}
				}
			}
		}
	}
	if (found == false)
		System.out.println("Triplets not Exist................");
	
}

/**
 * @param temperature
 * @param velocity
 * program to find the wind 
 */
public static void windChill(double temperature, double velocity) {
	double windChill=0;
	if (temperature<=50.0 && (velocity>=3&&velocity<=120) )
	   windChill = (35.47+0.6251+(0.4275*temperature-35.75))*Math.pow(velocity, 0.16);
		
		System.out.println("temprature is......"+temperature);
		System.out.println("wind Speed is......"+velocity);
		System.out.println("wind chill is......"+windChill);
}

/**
 * @param str
 * @param start
 * @param end
 * permutation of a string using itrative
 */
public static void permutationItrative(String str, int start, int end) {
	
	int length=str.length(); //length of the string....
	int totalPermutation=fact(length); //calculate total possible outcomes.....

	int j=1;//points to first position....
	
	int m=0; //to fix the position
	
	int perm_count;
	String perm_s=str;
	for(perm_count=0;perm_count<=totalPermutation;) {
		int k=0;
		
		while(k!=totalPermutation/length) {
			while(j!=length-1) {
				System.out.println(perm_s);
				perm_s=swap(perm_s,j,j+1);
				j++;
				k++;
				perm_count++;
			}
			j=1;
		}
		m++;
		if(m==length)
			break;
		
		perm_s=swap(perm_s,0,m);
	}
}

private static int fact(int length) {

	return (length==1) ? 1 : length*fact(length-1);	
}

/**
 * @param str
 * @param start
 * @param end
 * program to find the permutation of a string using recursion
 */
public static void permutationRecursion(String str, int start, int end) {
	if(start==end) {
		System.out.println(str);
		count++;
	}else {
			for(int i=start; i<=end;i++) {
				str= swap(str,start,i);
				permutationRecursion(str,start+1,end);
				str= swap(str,start,i);
				count++;
			}
	
}

}

/**
 * @param str
 * @param start
 * @param index
 * swappint the charcters
 * @return
 */
private static String swap(String str, int start, int index) {
	char a[]=str.toCharArray();
	char temp=a[start];
	a[start]=a[index];
	a[index]=temp;
	return str.valueOf(a);
	
}

/**
 * @param arrayElements
 * @param rows
 * @param columns
 * Logic to print the 2d Array
 */
public static <T> void print2DArray(T[][] arrayElements, int rows, int columns) {
	PrintWriter writer=new PrintWriter(System.out);

	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
		writer.print(arrayElements[i][j]+" ");
		writer.flush();
		}
		System.out.println();
	}
	
}
}

