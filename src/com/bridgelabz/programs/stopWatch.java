package com.bridgelabz.programs;

public class stopWatch {
	private static long startTimer=0,stopTimer=0,elapsedTimer=0;
	public static void main(String[] args) {
		 StartTimer();	
			
		 StopTimer();
		 long l=ElapsedTimer();
		 System.out.println("Start Timing....."+StartTimer());
		 System.out.println("Stop Timing......"+StopTimer());
		 System.out.println("The Elapsed Time between stop and end......."+elapsedTimer);
			System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
			}

		private static long StopTimer() {
			startTimer=System.currentTimeMillis();
			return startTimer;
		}

		private static long ElapsedTimer() {
			elapsedTimer=stopTimer-startTimer;
			return elapsedTimer;
		}

		private static long StartTimer() {
			stopTimer=System.currentTimeMillis();;
			return stopTimer;
		}
	}

