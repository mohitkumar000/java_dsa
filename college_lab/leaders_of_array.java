package college_lab;
import java.util.*;

public class leaders_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		list = leaders(arr,n);
		for(int i =0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
	
		

	}
	   public static ArrayList<Integer> leaders(int arr[], int n){
	        // Your code here
	     
	       ArrayList<Integer> al = new ArrayList<Integer>();
	        al.add(arr[n-1]);
	        int m=arr[n-1];
	        for(int i=n-2;i>=0;i--){
	            if(arr[i]>=m){
	                m=arr[i];
	                al.add(0, arr[i]);
	            }
	        }
	        return al;
	     
	        
	    }

}
