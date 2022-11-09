package college_lab;

import java.util.*;

public class plateform
{
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int [] arr1 =new int[n];
		for(int i =0;i<n;i++)
		{
		    arr1[i]= scn.nextInt();
		}
		int [] arr2 =new int[n];
	    for(int i =0;i<n;i++)
		{
		    arr2[i]= scn.nextInt();
		}
		int ans=findPlatform(arr2,arr2,n);
		System.out.print(ans);
		
		
	}
	public static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
          Arrays.sort(dep);
          int count=0;
          int i=0;
          int j=0;
          int max=0;
          while(i<n&&j<n)
          {
              if(arr[i]<=dep[j])
              {
                  count ++;
                  i++;
                  max=Math.max(max,count);
              }
              else
              {
                  count--;
                  j++;
                  
              }
              
          }
          return max;
          
        
    }
    
		
}
