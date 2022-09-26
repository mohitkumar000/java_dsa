package assignment_2;

import java.util.Scanner;

public class squaret_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(mySqrt(n));

	}
	 public static  int mySqrt(int x) {
	        if(x==0)
	        {
	            return 0;
	        }
	       int start =1;
	        int end =x;int res=0;
	        
	        while(start<=end)
	        {
	            int mid =start+(end-start)/2;
	            if(mid<=x/mid)
	            {
	                res =mid;
	                start =mid+1;
	            }
	            else
	            {
	                end =mid-1;
	            }
	        }
	        
	        return res;
	        
	    }

}
