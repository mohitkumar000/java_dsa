package _2d_array;

import java.util.Iterator;

public class Transpose_matrix_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{9,10,11,12}};
		transpose(arr);
		System.out.println();
		
		

	}
	public static void transpose(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for (int col = row+1; col <arr[0].length; col++) {
				int temp =arr[row][col];
				arr[row][col]=arr[col][row];
				arr[col][row]=temp;
				
				
			}
			
		}
			
	}

}
