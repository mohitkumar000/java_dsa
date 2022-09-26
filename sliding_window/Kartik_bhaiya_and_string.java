package sliding_window;
import java.util.*;

public class Kartik_bhaiya_and_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int k=scn.nextInt();
		String str =scn.next();
	
		
				
				
		
		int b =flip(str,k,'b');
		int a =flip(str,k,'a');
		System.out.println(Math.max(a,b));
		

	} 
	public static int flip(String str,int k,char ch)
	{
		int si=0;
		int ei =0;
		int ans =0;
		int flip=0;
		while(ei<str.length())
		{
			if(str.charAt(ei)==ch)
			{
				flip++;
			}
			//shrink
			while(flip>k&&si<=ei)
			{
				if(str.charAt(si)==ch)
				{
					flip--;
				}
				si++;
				
			}
			//anscal
			ans =Math.max(ans,ei-si+1);
			ei++;
			
		}
		return ans;
	}

}
