

import java.util.*;

public class veryEasyTask {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int x=scn.nextInt();
		int y=scn.nextInt();
		
		System.out.println(mintime(n,x,y));
		
	}

	public static int mintime(int n, int x, int y) {
		// TODO Auto-generated method stub
		if(n==1) {
			return Math.min(x,y);
		}
		int left =0;
		int right= Math.max(x,y)*n;
		
		int ans = 0;
		while(left<=right) {
			int mid=(left+right)/2;
			
			

			if(good(n,x,y,mid)) {
				ans =mid;
				right=mid-1;
				
			}
			else {
				left = mid+1;
			}
		}
		
		return ans+ Math.min(x,y);
	}

	public static boolean good(int n, int x, int y, int mid) {
		// TODO Auto-generated method stub
		
		//if in mid amount of time iam able to make n-1 copies or not 
		//then my mid value is good and i should return true 
		
		//check how how many copies can be made in mid amount of time 
		
		//if no copies > n-1 return true ;
		
		// otherwise return fslse
		
		//c1 copier can make mid/x copies in mid time 
		
		return (mid/x)+(mid/y)>=n-1;
		
	}

}
