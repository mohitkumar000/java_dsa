package backtracking;

import java.util.Iterator;

public class N_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		boolean [] [] board = new boolean[n][n];
		n_queen(board,0,n);
		

	}
	public static void n_queen(boolean [] [] board,int row,int tq)
	{
		if(tq==0)
		{
			Display(board);
		}
		for(int col =0;col<board.length;col++)
		{
			if(isitsafe(board,row,col)==true)
			{
				board[row][col]=true;
				n_queen(board,row+1,tq-1);
				board[row][col]=false;
				
			}
		}
	}
	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				System.out.println(board[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
