package recursion;
import java.util.*;

import java.util.Scanner;

public class count_board {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
				
		count(0,n,"");
		System.out.println();
		System.out.println(count);
		

	}
	public static void count(int curr,int n,String str)
	{
		if(curr==n)
		{
			System.out.print(str+" ");
			count++;
			return;
		}
		if(curr>n)
		{
			return;
			
		}
		count(curr+1,n,str+1);
		count(curr+2,n,str+2);
		count(curr+3,n,str+3);
		
		
		
		
		
	}

}
