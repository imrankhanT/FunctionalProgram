package com.bridgelabz.programs;

import java.util.Scanner;

public class ticTacToe {
	private static final int none=0;
	private static final int empty=0;
	private static final int user=1;
	private static final int computer=2;
	private static final int stalmate=3;
public static void main(String[] args) {
        int turn=user,move,winner;
		Scanner scanner=new Scanner(System.in);	
		int rows,columns;
		System.out.println("Enter the Rows.......");
		rows=scanner.nextInt();
		columns=scanner.nextInt();
		int[][] board=new int[rows][columns];
		prinrBoard(board);
		while(true) 
		{
		    if(turn == user) 
		    {
			System.out.println("Your move");
			move = -1;
			while (move<0 || move>9 || board[move/3][move%3] != empty) 
			{
			    System.out.println("Please enter your move(0-8): ");
			    move = scanner.nextInt();
			}
		    } 
		    else 
		    {
			move = Computer_move(board);
			System.out.println("Computer move: " + move);
		    }

		  
		    board[(int)(move/3)][move%3] = turn;

	
		    prinrBoard(board);

		    winner = checkWinner(board);
            System.out.println(winner);
		    if(winner != none)
			break;

		    if(turn == user) {
			turn = computer;
		    } else {
			turn = user;
		    }

		}
		switch(winner) {
		case user:System.out.println("User Won");
		          break;
		case computer:System.out.println("Computer won");
		              break;
		 default: System.out.println("Drwa......");
		 break;
		}
		scanner.close();
		}

private static int checkWinner(int[][] board) {
	
	//checking top row
  if(board[0][0]==board[0][1] && board[0][1]==board[0][2])
	  return board[0][0];
  //checking middle row
  if(board[1][0]==board[1][1] && board[1][1]==board[1][2])
	  return board[1][0];
  //checking bottom row
  if(board[2][0]==board[2][1] && board[2][1]==board[2][2]) 
      return board[2][0];
  
  //checking first column
  if(board[0][0]==board[1][0] && board[1][0]==board[2][0]) 
	  return board[0][0];
   //checking middle column
  if(board[0][1]==board[1][1] && board[1][1]==board[2][1])
	  return board[0][1];
  //checking last column
  if(board[0][2]==board[1][2] && board[1][2]==board[2][2])
	  return board[0][2];
  
  //checking daignol 
  if(board[0][0]==board[1][1] && board[1][1]==board[2][2])
	  return board[0][0];
  
  //checking other daignol
  if(board[0][2]==board[1][1] && board[1][1]==board[2][0]) 
	  return board[0][2];
  
  if(board[0][0]==empty || board[0][1]==empty || board[0][2]==empty
		  || board[1][0]==empty || board[1][1]==empty || board[1][2]==empty
		  || board[2][0]==empty || board[2][1]==empty || board[2][2]==empty)
	  return none;
  
	return stalmate;
}

private static int Computer_move(int[][] board) {
	int move=(int)(Math.random()*9);
	
	while(board[move/3][move%3]!=empty)
		move=(int)(Math.random()*9);
	return move;
}

private static void prinrBoard(int[][] board) {
	for (int i=0;i<board.length;i++)
	{
		for(int j =0 ;j<board[i].length;j++)
		{
			System.out.print(board[i][j]+"-");
		}
	   System.out.println();
	}
	 
}

private static char printChar(int i) {
	switch(i) {
	case empty : return ' ';
	case user : return 'X';
	case computer : return 'O';
	}
	return ' ';
}
}
